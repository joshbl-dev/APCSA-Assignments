/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */


import java.util.Scanner;

class Lesson_12_Activity_One {
    public static void main(String[] args) {
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
        Scanner s = new Scanner(System.in);
        int x = 0;
        for (int i = 0; i < 3; i++)
            x += s.nextInt();
        if (x / 3.0 >= 89.5)
            System.out.println("ABOVE AVERAGE");
    }
}