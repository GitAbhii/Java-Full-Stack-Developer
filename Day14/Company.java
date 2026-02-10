class Company {
    String companyName = "ABC Ltd";
}

class Employee extends Company {
    String empName;

    void display() {
        System.out.println(empName + " works at " + companyName);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.empName = "Aman";
        e1.display();
    }
}
