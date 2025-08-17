package java_practice_for_selenium;

//prime number
//2-6 all prime numbers
//7-12 all not prime numbers
public class PrimeNumber {
    public static void main(String[] args) {
        boolean flag=true;
        int num=2;
        for (int i=2;i<(num/2); i++)
        {
            if(num%1==0)
            {
                flag=false;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("number is prime number");
        }
        else {
            System.out.println("number is not prime");
        }
        }
    }



