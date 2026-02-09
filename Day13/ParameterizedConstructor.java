class Employee {
    int id;
    double salary;

    Employee(int i, double s) {
        id = i;
        salary = s;
    }

    void show() {
        System.out.println(id + " " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, 50000);
        e1.show();
    }
}
