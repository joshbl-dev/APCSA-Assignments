/*
 * Lesson 14 Coding Activity 2
 * Write a program to input two integers and print 
 * "Both are positive or zero." to the screen, if both are positive or zero.
 * Print "One or both are negative." otherwise.
 */


import java.util.Scanner;

class Lesson_14_Activity_Two {
    public static void main(String[] args) {
     /*
      * Write your code here
      * Copy and paste your entire program to Code Runner
      * to complete the activity, from the first import statement
      * to the last bracket.
      */
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        String print = "";
        if (x >= 0 || y >= 0) {
            print = "One or both are negative.";
            if (x >= 0 && y >= 0) {
                print = "Both are positive or zero.";
            }
        }
        System.out.println(print);
    }
}