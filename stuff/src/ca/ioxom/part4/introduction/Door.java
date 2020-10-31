package ca.ioxom.part4.introduction;

public class Door {
    public void knock() {
        System.out.println("Who's there?");
    }

    public static void main(String[] arrgs) {
        Door alexander = new Door();

        alexander.knock();
        alexander.knock();
    }
}
