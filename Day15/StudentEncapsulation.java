class Student {
    private String name;
    private int age;

    public void setData(String n, int a) {
        name = n;
        age = a;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setData("Rahul", 22);
        s1.show();
    }
}
