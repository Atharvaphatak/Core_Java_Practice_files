package collection.setclass;

import java.util.TreeSet;
// Flipkart.java
// CompFlipkartName.java
//CompFlipkartId.java

public class TreeSet4 {
    public static void main(String[] args) {
        TreeSet<Flipkart> fk=new TreeSet<Flipkart>(new CompFlipkartName());// Comparator
        fk.add(new Flipkart(202,"Apple"));
        fk.add(new Flipkart(101,"Motorola"));
        fk.add(new Flipkart(202,"Samsung"));
        System.out.println(fk);
        for (Flipkart allProd:fk)
        {
            System.out.println(allProd.proId+"  -  "+allProd.proName);
        }
    }
}
