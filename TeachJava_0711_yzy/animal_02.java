package TeachJava_0711_yzy;

// 定义接口
interface Animal_01 {
    // 接口中的抽象方法
    void sound();
    void eat();
}

// 实现接口的类：Dog（狗）
class Dog implements Animal_01 {
    @Override
    public void sound() {
        System.out.println("小狗叫");
    }

    @Override
    public void eat() {
        System.out.println("小狗吃骨头");
    }
}

// 实现接口的类：Cat（猫）
class Cat implements Animal_01 {
    @Override
    public void sound() {
        System.out.println("小猫叫");
    }

    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }
}

public class animal_02 {
    public static void main(String[] args) {
        // 创建 Dog 和 Cat 对象
        Animal_01 dog = new Dog();
        Animal_01 cat = new Cat();

        // 调用接口方法
        dog.sound();
        dog.eat();

        cat.sound();
        cat.eat();
    }
}
