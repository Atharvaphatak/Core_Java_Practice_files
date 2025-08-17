package java_practice_for_selenium;

//print even numbers between 51 to 70-->>
public class EvenNumbers1 {
    public static void main(String[] args) {
        for(int num=51;num<=70;num++)
        {
            if(num%2==0)
            {
                System.out.println(num);
            }
        }
    }
}
