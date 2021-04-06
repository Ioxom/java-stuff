package ca.ioxom.part11.exceptions;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean on;
    private final Random random;

    public TemperatureSensor() {
        on = false;
        random = new Random();
    }


    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = false;
    }

    @Override
    public int read() {
        if (isOn()) {
            return random.nextInt(61) - 30;
        } else {
            throw new IllegalStateException("cannot read while sensor is off");
        }
    }

    public static void main(String[] args) {
        Sensor ten = new TemperatureSensor();

        ten.setOn();

        System.out.println(ten.read());
        System.out.println(ten.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.read());
    }
}
