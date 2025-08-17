package java_practice_for_selenium;

public class Palindrome_Number {
    public static void main(String[] args) {
        int num = 303;
        int rem = 0, sum = 0;
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println("Resverse Numbers" + sum);
        if (sum == temp) {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");
        }
    }
}
