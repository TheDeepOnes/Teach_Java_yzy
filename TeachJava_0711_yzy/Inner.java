package TeachJava_0711_yzy;

class OuterClass {
    private String message = "OuterClass";

    // 内部类
    class InnerClass {
        void display() {
            System.out.println(message);  // 可以访问外部类的成员
        }
    }

    // 创建方法返回内部类对象
    public InnerClass createInner() {
        return new InnerClass();
    }
}

public class Inner {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.createInner();
        inner.display();
    }
}
