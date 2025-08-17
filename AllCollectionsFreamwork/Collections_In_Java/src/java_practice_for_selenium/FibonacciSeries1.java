package java_practice_for_selenium;

//print fibonacci series max up to 150

public class FibonacciSeries1 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum=0;
        System.out.println(a);      //0
        System.out.println(b);      //1
        while(sum<=150)
        {
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}
//output
//        0
//        1
//        1
//        2
//        3
//        5
//        8
//        13
//        21
//        34
//        55
//        89
//        144
//        233


