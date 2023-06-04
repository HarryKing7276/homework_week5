package homework;

import java.util.ArrayList;

/**
 *  4. Write a program to create a new array list, add some colours( String) and print out
 *     the collection using for each loop.
 */

public class Colours {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("Black");
        list.add("Purple");
        for (String colours : list){
            System.out.println(colours);
        }

    }

}
