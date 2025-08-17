package java_practice_for_selenium;

public class Swapping_Numbers1 {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before Swapping " +a+" "+b);
        //logic 1 -third variable
//        int t=a;
//        a=b;
//        b=t;
//        System.out.println("After Swapping "+a+" "+b);

        //logic 2 -use + and - operator without using third variable
//        a=a+b;  //10+20= 30
//        b=a-b;  //30-20= 10
//        a=a-b;  //30-10= 20
//        System.out.println("After Swapping "+a+" "+b);

        //logic 3- use * and / operator without using third value
        //a & b values should not be zero
//        a=a*b;
//        b=a/b;
//        a=a/b;
//        System.out.println("After Swapping "+a+" "+b);

        //logic 4 using bitwise XOR (^) operator
//        a=a^b;  //30
//        b=a^b;  //20
//        a=a^b;  //10
//        System.out.println("After Swapping "+a+" "+b);

        //logic 5- Single stmt
        //a=10, b=20
        b=a+b-(a=b);
        System.out.println("After Swapping "+a+" "+b);
    }
}
