package ca.ioxom.part2;

public class greatestInt {
    public static int greatest(int number1, int number2, int number3) {
        //check if either number1 or number2 is bigger than number3
        //then check which of those is bigger
        if (number1 > number3 || number2 > number3) {
            return Math.max(number1, number2);
        //otherwise return number3
        } else {
            return number3;
        }
    }

    //directly from the challenge
    public static void main(String[] args) {
        int answer =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }
}
