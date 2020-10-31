package ca.ioxom.part4.introduction;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public static void main(String[] arrgs) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.value = 5;
        counter.printValue();
        counter.reset();
        counter.printValue();
    }
}
