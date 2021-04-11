package ca.ioxom.part12.typeparameters;

public class Hideout<T> {
    private T object;

    public Hideout() {
        object = null;
    }

    public void putIntoHideout(T toHide) {
        object = toHide;
    }

    public T takeFromHideout() {
        try {
            return object;
        } finally {
            object = null;
        }
    }

    public boolean isInHideout() {
        return object != null;
    }

    public static void main(String[] args) {
        Hideout<String> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout("peekaboo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
        den.putIntoHideout("toodaloo");
        den.putIntoHideout("heelloo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());

        System.out.println("==");

        Hideout<Integer> integerHideout = new Hideout<>();
        System.out.println(integerHideout.isInHideout());
        integerHideout.putIntoHideout(1);
        System.out.println(integerHideout.isInHideout());
        System.out.println(integerHideout.isInHideout());
        System.out.println(integerHideout.takeFromHideout());
        System.out.println(integerHideout.isInHideout());
    }
}
