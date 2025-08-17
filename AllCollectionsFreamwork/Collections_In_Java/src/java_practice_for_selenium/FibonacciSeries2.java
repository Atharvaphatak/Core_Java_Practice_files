package java_practice_for_selenium;

//print first 15 numbers of fibonacci series
public class FibonacciSeries2 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);//0
        System.out.println(b);//1
        int count=0;        //we can use here either 0 and 1
        while(count<=15)
        {
            count=a+b;
            System.out.println(count);//1
            a=b;
            b=count;
            count++;
        }
    }
}
