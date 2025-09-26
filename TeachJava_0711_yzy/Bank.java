package TeachJava_0711_yzy;

import java.util.LinkedList;

class Box<T> {
    private final LinkedList<T> queue = new LinkedList<>();
    private final int cap = 10;

    public synchronized void put(T item) {
        while (queue.size() == cap) {
            try { this.wait(); } catch (InterruptedException ignored) {}
        }
        queue.addLast(item);
        this.notifyAll();
    }

    public synchronized T get() {
        while (queue.isEmpty()) {
            try { this.wait(); } catch (InterruptedException ignored) {}
        }
        T item = queue.removeFirst();
        this.notifyAll();
        return item;
    }

    public synchronized int size() {
        return queue.size();
    }
}

public class Bank {
    public static void main(String[] args) throws Exception {
        Box<String> box = new Box<>();

        for (int i = 0; i < 10; i++) {
            final int consumerId = i;
            new Thread(() -> {
                for (int k = 0; k < 5; k++) {
                    String item = box.get();
                    System.out.println("消费者" + consumerId + " 取出：" + item +
                            "  当前数量=" + box.size());
                }
            }, "消费者-" + i).start();
        }

        Thread.sleep(100);

        // 2 个生产者：每人放 25 个 = 50 个
        for (int i = 0; i < 2; i++) {
            final int producerId = i;
            new Thread(() -> {
                for (int k = 0; k < 25; k++) {
                    String item = "物品 " + producerId + "-" + k;
                    box.put(item);
                    System.out.println("生产者" + producerId + " 放入：" + item +
                            "  当前数量=" + box.size());
                }
            }, "生产者 " + i).start();
        }
    }
}
