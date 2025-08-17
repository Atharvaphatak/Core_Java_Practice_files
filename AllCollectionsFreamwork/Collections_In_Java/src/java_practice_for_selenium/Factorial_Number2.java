package java_practice_for_selenium;

//factorial number using for loop
public class Factorial_Number2
{
    public static void main(String[] args) {
        int fact=1,num=5;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
