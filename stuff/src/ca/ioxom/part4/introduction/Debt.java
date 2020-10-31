package ca.ioxom.part4.introduction;

public class Debt {
    private double balance;
    private final double interestRate;

    public Debt(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance *= this.interestRate;
    }

    public static void main(String[] args) {

        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}
