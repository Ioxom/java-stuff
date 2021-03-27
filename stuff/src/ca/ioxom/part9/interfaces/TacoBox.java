package ca.ioxom.part9.interfaces;

public interface TacoBox {
    int tacosRemaining();
    void eat();

    class CustomTacoBox implements TacoBox {
        private int tacosRemaining;

        public CustomTacoBox(int tacos) {
            tacosRemaining = tacos;
        }

        @Override
        public int tacosRemaining() {
            return tacosRemaining;
        }

        @Override
        public void eat() {
            tacosRemaining --;
        }
    }

    class TripleTacoBox implements TacoBox {
        private int tacosRemaining;

        public TripleTacoBox() {
            tacosRemaining = 3;
        }

        @Override
        public int tacosRemaining() {
            return tacosRemaining;
        }

        @Override
        public void eat() {
            tacosRemaining --;
        }
    }
}
