/*
 * Lesson 5 Coding Activity Question 2
 * 
 * Input four integer values and print the sum of all four values.
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_Two {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner s = new Scanner(System.in);
        int x = 0;
        for (int i = 0; i < 4; i++) {
            x += s.nextInt();
        }
        System.out.print(x);


    }
}