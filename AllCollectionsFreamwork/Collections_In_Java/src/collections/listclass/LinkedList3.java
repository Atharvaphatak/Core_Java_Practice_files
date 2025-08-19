package collections.listclass;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList();
        ll1.add("Cyber");
        ll1.add("Success");
        ll1.add("Training");
        for (String ss : ll1) {
            System.out.println(ss);
        }

    }
}
