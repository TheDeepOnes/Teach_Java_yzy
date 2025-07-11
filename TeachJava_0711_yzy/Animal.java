package TeachJava_0711_yzy;

public class Animal {

    // 成员变量
    String name;
    int age;
    //私有成员变量
    private int weight;
    private String color;

    // static关键字（类变量，所有对象共享）
    static int animalCount = 0;  // static 成员变量,被所有对象共享

    // 代码块
    {
        System.out.println("实例代码块：每次创建对象时执行！");
    }

    // 静态代码块
    static {
        System.out.println("静态代码块：只会在类加载时执行一次！");
    }

    // 构造器
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalCount++;     // 静态变量
        System.out.println("构造器被调用，创建了一个新的动物对象！");
    }
    public Animal() {
        System.out.println("无参构造器被调用，创建了一个新的动物对象！");
    }

    // this关键字
    public void displayInfo() {
        System.out.println("动物名字: " + this.name + ", 年龄: " + this.age);  // 使用this引用成员变量
    }

    // 成员变量和局部变量
    public void greet(String greeting) {  // greeting是局部变量
        System.out.println(greeting + ", " + this.name);
    }

    // static关键字,静态方法只能访问静态变量
    public static void displayAnimalCount() {
        System.out.println("一共创建了 " + animalCount + " 个动物对象。");  // static方法可以访问 static 变量
    }
    //封装
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void setAnimalCount(int animalCount) {
        Animal.animalCount = animalCount;
    }

    public static void main(String[] args) {
        // 创建动物对象
        Animal dog = new Animal("狗", 3);
        dog.displayInfo();
        dog.greet("你好");

        // 创建另一个动物对象
        Animal cat = new Animal("猫", 2);
        cat.displayInfo();
        cat.greet("嗨");

        // static关键字调用静态方法
        Animal.displayAnimalCount();

        Animal animal = new Animal();
        animal.setName("Lion");

    }
}
