package ca.ioxom.part12.listandtable;

public class List<T> {
    private T[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        T[] newValues = (T[]) new Object[newSize];
        System.arraycopy(this.values, 0, newValues, 0, this.values.length);

        this.values = newValues;
    }

    public void add(T value) {
        if(this.firstFreeIndex == this.values.length) {
            grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        if (this.firstFreeIndex - 1 - fromIndex >= 0) {
            System.arraycopy(this.values, fromIndex + 1, this.values, fromIndex, this.firstFreeIndex - 1 - fromIndex);
        }
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public T value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }

        return this.values[index];
    }

    public int size() {
        return this.firstFreeIndex;
    }

    public static void main(String[] args) {
        List<String> list = new List<>();

        list.add("h");
        list.add("g");

        for (int i = 0; i < 12; i ++) {
            list.add(i + "t");
        }

        System.out.println(list.contains("h5"));
        System.out.println(list.contains("8t"));

        list.remove("7t");

        list.add("5f");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.value(i));
        }
    }
}
