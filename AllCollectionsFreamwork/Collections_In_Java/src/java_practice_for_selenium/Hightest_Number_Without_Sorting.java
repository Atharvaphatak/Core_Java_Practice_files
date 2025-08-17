package java_practice_for_selenium;

//print higest number without using sorting
public class Hightest_Number_Without_Sorting {
    public static void main(String[] args) {
        int []ar={20,10,40,50,30,100};
        int max=ar[0];      //20
        //System.out.println(max);

        for(int i=1;i<ar.length;i++)
        {
            if(max<ar[i])
            {
                max=ar[i];
            }
        }
        System.out.println("Highest Number:"+max);
    }
}
