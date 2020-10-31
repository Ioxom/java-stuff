package ca.ioxom.part4.introduction;

public class Whistle {
    private String sound;

    public Whistle(String sound) {
        this.sound = sound;
    }

    private void sound() {
        System.out.println(this.sound);
    }

    public static void main(String[] arrgs) {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
