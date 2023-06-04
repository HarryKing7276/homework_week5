package homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  6. Write a Java program to retrieve an element (at a specified index) from a given
 *      array list
 */

public class SpecifiedIndexValue {

        public static void main(String[] args) {

            // Create a list and add some colors to the list

            ArrayList list  = new ArrayList();
            list.add("Red");
            list.add("50");
            list.add("Orange");
            list.add("White");
            list.add('H');

            // Print the list

            System.out.println("Enter the value you would like to print:");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            System.out.println(list.get(i));
        }
    }

