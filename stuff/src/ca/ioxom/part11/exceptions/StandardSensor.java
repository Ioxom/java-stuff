package ca.ioxom.part11.exceptions;

public class StandardSensor implements Sensor {
    private final int number;

    public StandardSensor(int number) {
        this.number = number;
    }

    @Override
    public boolean isOn() {
        //sensor is always on
        return true;
    }

    @Override
    public void setOn() {
        //sensor is always on
    }

    @Override
    public void setOff() {
        //sensor is always on
    }

    @Override
    public int read() {
        return number;
    }

    public static void main(String[] args) {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
    }
}
