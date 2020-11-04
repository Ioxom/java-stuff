package ca.ioxom.part5.overloading;

public class Counter {
    private int value;
    public Counter(int startValue) {
        this.value = startValue;
    }
    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void decrease() {
        this.value --;
    }
    public void increase() {
        this.value ++;
    }

    public void increase(int increaseBy) {
        this.value += increaseBy;
    }
    public void decrease(int decreaseBy) {
        this.value -= decreaseBy;
    }

    public static void main(String[] arrgs) {
        Counter counter = new Counter(5);
        Counter otherCounter = new Counter();
        counter.increase(7);
        otherCounter.decrease(67);
        otherCounter.increase();
        counter.decrease();
        counter.increase();
        System.out.println(otherCounter.value());
        System.out.println(counter.value());
    }
}
