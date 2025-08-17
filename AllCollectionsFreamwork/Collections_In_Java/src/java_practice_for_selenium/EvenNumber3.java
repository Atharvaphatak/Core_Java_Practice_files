package java_practice_for_selenium;

//print first 20 even numbers from 2 ?
public class EvenNumber3 {
    public static void main(String[] args) {
        for (int num=2,count=1;count<=20;num++)
        {
            if(num%2==0)                    //for odd
            {                               //if(num%2!=0)
                System.out.println(num);
                count++;
            }
        }
    }
}
