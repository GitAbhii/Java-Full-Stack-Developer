class Employee {
    int id;
    double salary;

    void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 101;
        e1.salary = 45000;
        e1.showDetails();
    }
}
