package ca.ioxom.part5.objectsAndReferences;

//this is a mess
public class Money {

    private int euros;
    private int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money minus(Money decreaser) {
        if (decreaser.euros > this.euros) {
            return new Money(0, 0);
        }
        int euros = this.euros;
        euros -= decreaser.euros;
        int cents = this.cents;
        if (cents >= decreaser.cents) {
            euros -= decreaser.cents;
        } else {
            cents = Math.abs(100 - decreaser.cents);
            euros -= 1;
        }
        return new Money(euros, cents);
    }

    public Money plus(Money increase) {
        int euros = this.euros;
        euros += increase.euros;
        int cents = this.cents;
        if (cents + increase.cents < 100) {
            cents += increase.cents;
        } else {
            cents = Math.abs(100 - increase.cents + cents);
            euros ++;
        }
        return new Money(euros, cents);
    }

    public boolean lessThan(Money compared) {
        return compared.euros + 0. + compared.cents > this.euros + 0. + this.cents;
    }

    public static void main(String[] arrgs) {
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
