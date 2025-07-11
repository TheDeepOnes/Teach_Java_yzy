package TeachJava_0711_yzy;

// 抽象类
abstract class Person {
    String name;

    // 抽象方法，子类必须重写
    abstract void speak();

    public void setName(String name) {
        this.name = name;
    }
}

// 子类：Student（学生），继承自 Person
class Student extends Person {
    public void speak() {
        System.out.println(name + " is a student.");
    }
}

// 子类：Teacher（老师），继承自 Person
class Teacher extends Person {
    public void speak() {
        System.out.println(name + " is a teacher.");
    }
}

public class people {
    public static void main(String[] args) {
        Person student = new Student();
        student.setName("John");
        student.speak();

        Person teacher = new Teacher();
        teacher.setName("kimi");
        teacher.speak();
    }
}
