package week1.day2;

public class Palindrome {
    public static void main(String[] args) {

        int input = 121;
        int output = 0;
        int temp = input;

        for (; temp > 0; temp = temp / 10) {

            int rem = temp % 10;
            output = (output * 10) + rem;
        }

        if (input == output) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }
    }

}
