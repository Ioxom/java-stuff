package ca.ioxom.part2;

import java.util.Scanner;

public class loadingBar {
    public static void main(String[]arrgs) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder currentProgress = new StringBuilder();
        System.out.println("bar config: length");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("bar config: wait time(millis)");
        int waitTime = Integer.parseInt(scanner.nextLine());
        StringBuilder spaces = new StringBuilder();
        for (int q = 0; q < length; q++) {
            spaces.append(" ");
        }
        for (int i = 0; i < length; i++) {
            System.out.print("[" + spaces +  currentProgress + "]");
            if (!spaces.toString().equals("")) {
                spaces.deleteCharAt(0);
            }
            Thread.sleep(waitTime);
            for (int h = -2; h < currentProgress.length() + spaces.length() + 1; h++) {
                System.out.print("\b");
            }
            currentProgress.append("-");
        }
    }
}
