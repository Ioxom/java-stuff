package ca.ioxom.part12.typeparameters;

import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private final List<T> objects;

    public Pipe() {
        objects = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        objects.add(value);
    }

    public T takeFromPipe() {
        if (objects.isEmpty()) {
            return null;
        } else {
            try {
                return objects.get(0);
            } finally {
                objects.remove(0);
            }
        }
    }

    public boolean isInPipe() {
        return !objects.isEmpty();
    }

    public static void main(String[] args) {
        Pipe<String> pipe = new Pipe<>();
        pipe.putIntoPipe("dibi");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("daa");
        while(pipe.isInPipe()) {
            System.out.println(pipe.takeFromPipe());
        }

        System.out.println("==");

        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while(numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());
    }
}
