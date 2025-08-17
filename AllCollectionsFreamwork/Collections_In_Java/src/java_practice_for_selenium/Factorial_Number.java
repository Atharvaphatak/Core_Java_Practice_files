package java_practice_for_selenium;

//factorial number using while loop
public class Factorial_Number {
    public static void main(String[] args) {
        int num=5,fact=1;
        while(num>1)
        {
            fact=fact*num;
            num--;
        }
        System.out.println(fact);
    }
}
