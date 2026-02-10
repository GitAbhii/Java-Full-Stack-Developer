class Person {
    String name;

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int age;

    void showAge() {
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Rahul";   // inherited
        s1.age = 22;

        s1.showName();
        s1.showAge();
    }
}
