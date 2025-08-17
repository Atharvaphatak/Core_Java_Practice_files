package java_practice_for_selenium;

//Functional Interface
@FunctionalInterface
interface B{
    void m1(int i,int j);  //Functional Interface--> By Default public and abstract
}

public class LambdaExpression
{
    public static void main(String[] args) {
        //B obj1=(int i) ->System.out.println("Inside m1 method"+" "+i);
        //B obj1=(i) ->System.out.println("Inside m1 method"+" "+i);
        //B obj1= i ->System.out.println("Inside m1 method"+" "+i);
        B obj1= (i,j)->System.out.println("Inside m1 method"+" "+i+" "+j);
        obj1.m1(20,30);
    }
}


