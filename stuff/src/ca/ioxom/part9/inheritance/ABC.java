package ca.ioxom.part9.inheritance;

public class ABC {
    public static class A {
        public void a() {
            System.out.println("A");
        }
    }

    public static class B extends A {
        public void b() {
            System.out.println("B");
        }
    }

    public static class C extends B {
        public void c() {
            System.out.println("C");
        }
    }

    public static void main(String[] arrgs) {
        C c = new C();

        c.a();
        c.b();
        c.c();
    }
}
