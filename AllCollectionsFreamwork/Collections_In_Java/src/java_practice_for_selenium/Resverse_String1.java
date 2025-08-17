package java_practice_for_selenium;

// 1) Reverse the String using + (String Concatination) operator
public class Resverse_String1 {
    public static void main(String[] args) {
       String str="ABCD";
        String rev="";
//        int len=str.length();   //4
//        for(int i=len-1;i>=0;i--)   //3 2 1 0 //-1: false
//        {
//            rev=rev+str.charAt(i);  //D C B A
//        }
//        System.out.println("Reverse the String:"+rev);


        //2) Using character array
//        char a[]=str.toCharArray();     //it divides the string
//        int len=a.length;
//        for(int i=len-1;i>=0;i--)
//        {
//            rev=rev+a[i];
//        }
//        System.out.println("Reverse the String: "+rev);

        //3) using reverse() method
        StringBuffer str1=new StringBuffer(str);
        System.out.println(str1.reverse());
      }
}
