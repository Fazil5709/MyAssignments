package week1.day2;

public class FibonacciSeries {
    public static void main(String[] args) {

        int range = 8;

        int firstNum = 0;
        int secondNum = 1;

        System.out.print("Fibonacci Series: ");

        while (firstNum <= range) {
            System.out.print(firstNum + " ");

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

}
