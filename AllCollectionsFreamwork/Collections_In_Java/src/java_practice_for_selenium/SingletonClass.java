package java_practice_for_selenium;

public class SingletonClass {
    public static void main(String[] args)
    {
      Abc obj1=Abc.getInstance();
      Abc obj2=Abc.getInstance();
    }
}
class Abc
{
    static Abc obj=new Abc();
    private Abc()
    {
        System.out.println("Inside Private Constructor!!");
    }
    public static Abc getInstance()
    {
        return obj;
    }
}
