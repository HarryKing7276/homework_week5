package homework;
/**
 * 5. Write a Java program to iterate through all elements in an array list using
 *    Iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Prime Testing");
        list.add(9);
        list.add(29);
        list.add("class");

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
