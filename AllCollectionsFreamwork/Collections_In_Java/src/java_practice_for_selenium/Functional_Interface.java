package java_practice_for_selenium;

//Functional Interface
@FunctionalInterface
interface A{
    void m1();  //Functional Interface--> By Default public and abstract
}
//class B implements A
//{
//    public void m1() {
//        System.out.println("Inside m1 method");
//    }
//}
public class Functional_Interface
{
    public static void main(String[] args) {
    A obj1=new A()
    {       // AnaAnonymous function
        public void m1()
        {
        System.out.println("Inside m1 method");
        }
    };
    obj1.m1();
    }
}

