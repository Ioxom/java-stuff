package ca.ioxom.part5.learningobjectorientedprogramming;

public class Timer {
    //class taken from course
    //not original code
    private static class ClockHand {
        public int value;
        private final int limit;

        public ClockHand(int limit) {
            this.limit = limit;
            this.value = 0;
        }

        public void advance() {
            this.value = this.value + 1;

            if (this.value >= this.limit) {
                this.value = 0;
            }
        }

        public int value() {
            return this.value;
        }

        public String toString() {
            if (this.value < 10) {
                return "0" + this.value;
            }

            return "" + this.value;
        }
    }
    //original class
    private final ClockHand seconds;
    private final ClockHand centiSec;
    public Timer() {
        this.seconds = new ClockHand(60);
        this.centiSec = new ClockHand(100);
    }

    public void advance() {
        this.centiSec.advance();

        if (this.centiSec.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + centiSec;
    }

    public static void main(String[] arrgs) {
        Timer timer = new Timer();
        //repeats forever
        while (true) {
            //I've improved the timer a bit by removing the old numbers on each new print
            System.out.print("\b\b\b\b\b" + timer);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("an error occurred: " + e);
            }
            timer.advance();
        }
    }
}
