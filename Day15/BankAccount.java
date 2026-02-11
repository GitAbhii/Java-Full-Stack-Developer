class Account {
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        Account a1 = new Account();
        a1.setBalance(10000);

        System.out.println("Balance: " + a1.getBalance());
    }
}
