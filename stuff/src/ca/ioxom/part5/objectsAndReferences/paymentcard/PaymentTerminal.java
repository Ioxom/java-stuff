package ca.ioxom.part5.objectsAndReferences.paymentcard;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            affordableMeals ++;
            this.money += 2.50;
            return payment - 2.50;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            heartyMeals ++;
            this.money += 4.30;
            return payment - 4.30;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            card.takeMoney(2.50);
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            card.takeMoney(4.30);
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

    public static void main(String[] arrgs) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
