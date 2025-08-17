package java_practice_for_selenium;

public class OddNumber2 {
    public static void main(String[] args) {
        int num=57, count=1;
        while(count<=20)
        {
            if(num%2!=0)
            {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
