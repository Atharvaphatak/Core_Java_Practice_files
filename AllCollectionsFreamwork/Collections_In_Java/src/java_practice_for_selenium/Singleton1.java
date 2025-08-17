package java_practice_for_selenium;

public class Singleton1 {
    public int a;
    private Singleton1()
    {
        System.out.println("Inside private constructor");
    }
    public static Singleton1 getParent()
    {
        Singleton1 obj1=new Singleton1();
       // Singleton1 obj2=new Singleton1();
        return obj1;
    }
}
class Parent
{
    public static void main(String[] args) {
        Singleton1 p1=Singleton1.getParent();
    }

}
