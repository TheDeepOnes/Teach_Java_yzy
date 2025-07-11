package TeachJava_0711_yzy;

// 父类：生物
class Creature {
    String name;

    // 父类构造器
    public Creature(String name) {
        this.name = name;
    }

    // 父类方法
    public void makeSound() {
        System.out.println(name + "发出声音");
    }
}

// 子类：狮子 继承自 生物
class Lion extends Creature {
    // 子类构造器
    public Lion(String name) {
        super(name);  // 调用父类构造器
    }

    // 子类重写父类方法
    @Override
    public void makeSound() {
        System.out.println(name + "大叫");
    }
}

// 子类：老虎继承生物
class Tiger extends Creature {
    // 子类构造器
    public Tiger(String name) {
        super(name);  // 调用父类构造器
    }

    // 子类重写父类方法
    @Override
    public void makeSound() {
        System.out.println(name + "蹦跳");
    }
}
// final类不能被继承
final class bird {
    final int age = 5;  // final变量是常量

    public final void sound() {  // final方法不能被重写
        System.out.println("bird makes a sound");
    }
}

public class jicheng_duotai {
    public static void main(String[] args) {
        // 创建对象并演示多态
        Creature myLion = new Lion("Simba");
        Creature myTiger = new Tiger("tiger");

        myLion.makeSound();
        myTiger.makeSound();

        // 父类对象调用父类方法
        Creature genericCreature = new Creature("所有的生物");
        genericCreature.makeSound();
    }
}
