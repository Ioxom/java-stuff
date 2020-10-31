package ca.ioxom.fun;

import java.util.Scanner;

public class loadingBar {
    public static void main(String[]arrgs) throws InterruptedException {
        //configure the bar
        Scanner scanner = new Scanner(System.in);
        StringBuilder currentProgress = new StringBuilder();
        System.out.println("bar config: length");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("bar config: wait time (millis)");
        int waitTime = Integer.parseInt(scanner.nextLine());
        StringBuilder spaces = new StringBuilder();
        for (int q = 0; q < length; q++) {
            spaces.append(" ");
        }
        for (int i = 0; i < length; i++) {
            System.out.print("[" + currentProgress + spaces + "]");
            //remove one space every run
            if (!spaces.toString().equals("")) {
                spaces.deleteCharAt(0);
            }
            //wait so the bar doesn't finish near-instantly
            Thread.sleep(waitTime);
            //remove the amount of characters in the bar (\b == backspace)
            for (int h = -2; h < currentProgress.length() + spaces.length() + 1; h++) {
                System.out.print("\b");
            }
            currentProgress.append("-");
        }
    }
}
