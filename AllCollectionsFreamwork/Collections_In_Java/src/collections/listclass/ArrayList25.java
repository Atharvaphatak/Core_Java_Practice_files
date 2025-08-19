package collections.listclass;

import java.util.ArrayList;

public class ArrayList25 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(10);  al1.add(20);  al1.add(30);
        System.out.println(al1);

        ArrayList al2=new ArrayList(al1);
        al2.add('A'); al2.add('B'); al2.add('C');
        System.out.println(al2);

    }
}
