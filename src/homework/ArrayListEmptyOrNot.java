package homework;

import java.util.ArrayList;

/**
 *  7. Write a Java Program to test if an array list is empty or not
 *
 */
public class ArrayListEmptyOrNot {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Prime Testing");
        list.add("Java");
        list.add("H");
        list.add(9);
        list.add(true);

        System.out.println("Checking the above array list is empty or not! "+list.isEmpty());


    }
}

