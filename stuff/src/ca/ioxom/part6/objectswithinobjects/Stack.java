package ca.ioxom.part6.objectswithinobjects;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;
    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (String value : this.list) {
            if (!value.isEmpty()) {
                empty = false;
                break;
            }
        }
        return empty;
    }

    public void add(String value) {
        boolean found = false;
        for (String currentValue : this.list) {
            if (currentValue.equals(value)) {
                found = true;
                break;
            }
        }
        if (!found) {
            this.list.add(value);
        }
    }

    public String take() {
        String value = this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return value;
    }

    public ArrayList<String> values() {
        return this.list;
    }

    public static void main(String[] arrgs) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
    }
}
