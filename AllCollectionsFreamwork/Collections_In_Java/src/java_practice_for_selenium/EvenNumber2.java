package java_practice_for_selenium;

//print 20 even numbers, starting from 57
public class EvenNumber2 {
    public static void main(String[] args) {
        int num = 57, count = 1;
        while (count <= 20) {
            if (num %2== 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }

    }
}

//or
//for (int num=57,count=1;count<=20;num++)
//        {
//            if(num%2==0)
//        {
//            System.out.println(num);
//            count++;
//        }
//        }
