package week1.day2;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        int input = 13;
        boolean isPrime = true;

        for (int i = 2; i < input; i++) {

            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(input + " is a Prime Number");
        } else {
            System.out.println(input + " is not a Prime Number");
        }
    }

}
