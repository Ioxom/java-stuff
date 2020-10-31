package ca.ioxom.part4.introduction;

public class PaymentCard {
    private double balance;
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return ("The card has a balance of " + this.balance + " euros");
    }

    public void eatAffordably() {
        //check if you can afford the food
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        //check if you can afford the food
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            //maximum value on card is 150
            if (this.balance + amount <= 150) {
                this.balance += amount;
                //if the balance to add is too high just set the balance to 150
            } else {
                this.balance = 150;
            }
        }
    }

    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("paul: " + paulsCard + "\nmatt: " + mattsCard);
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("paul: " + paulsCard + "\nmatt: " + mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("paul: " + paulsCard + "\nmatt: " + mattsCard);
    }
}
