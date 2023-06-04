package homework;

/**
 *    3. Write a Java program to reverse an array of integer values.
 */


import java.util.Arrays;

public class ReverseArray {

        public static void main(String[] args){

            int[] my_array1 = {
                    1111, 2222, 3333, 4444, 5555,
                    6666,7777, 8888,9999, 1010,
                    1100, 1200, 1300};

            System.out.println("Original array : "+ Arrays.toString(my_array1));

            for(int i = 0; i < my_array1.length/2 ; i++)
            {
                int temp = my_array1[i];
                my_array1[i] = my_array1[my_array1.length - i - 1];
                my_array1[my_array1.length - i - 1] = temp;
            }
            System.out.println("Reverse array : "+Arrays.toString(my_array1));
        }
    }

