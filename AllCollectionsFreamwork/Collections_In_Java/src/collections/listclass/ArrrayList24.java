package collections.listclass;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class ArrrayList24 {
    public static void main(String[] args) {
        ArrayList<Zomato> al = new ArrayList<Zomato>();
        al.add(new Zomato(202, "Panner Masala"));
        al.add(new Zomato(101, "Kaju Masala"));
        al.add(new Zomato(303, "Chiken Masala"));
        for (Zomato zz : al)
        {
            System.out.println(zz.menuId + " - " + zz.menuName);
        }
        System.out.println("--------------------------------------------");
        Collections.sort(al,new CompMenuId());
        for (Zomato zz:al)
        {
            System.out.println(zz.menuId+" - "+zz.menuName);
        }

    }
}
