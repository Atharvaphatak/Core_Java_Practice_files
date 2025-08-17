package java_practice_for_selenium;

//print first 15 numbers of fibonacci series using for loop
public class FibonacciSeries4 {
    public static void main(String[] args) {
        int a=0,b=1,sum=0;
        System.out.println(a);
        System.out.println(b);
        for (int i=3;i<=15;i++)
        {
            sum= a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}
