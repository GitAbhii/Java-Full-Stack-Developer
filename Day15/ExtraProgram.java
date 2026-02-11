class Student {
    private int age;

    public void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setAge(22);

        System.out.println("Age: " + s1.getAge());
    }
}
