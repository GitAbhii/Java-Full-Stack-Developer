class Employee {
    private int id;
    private double salary;

    public void setEmployee(int i, double s) {
        id = i;
        salary = s;
    }

    public void display() {
        System.out.println(id + " " + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEmployee(101, 50000);
        e1.display();
    }
}
