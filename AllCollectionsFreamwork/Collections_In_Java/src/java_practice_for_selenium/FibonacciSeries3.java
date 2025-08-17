package java_practice_for_selenium;
//Q2.print first 15 numbers of fibonacci series using while loop
public class FibonacciSeries3 {
    public static void main(String[] args) {
      int a=0,b=1,sum=0,counter=3;
        System.out.println(a);
        System.out.println(b);
        while(counter<=15)
        {
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            counter++;
        }
    }
}
