package java_practice_for_selenium;
import java.util.*;
public class Armstrong_Number {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int temp=n;
        int res=0;
        while(temp>0)
        {
            int ld=temp%10;
            res= res+ld*ld*ld;
            temp=temp/10;
        }
        if(res==n)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
    }
}
