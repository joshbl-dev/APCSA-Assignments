/*
 * Lesson 33 Coding Activity 5
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 *  
 * Write a method that takes an array of ints, an integer value, 
 * and an integer index.The method should insert the value at the given
 * index and move the values afterwards by one.
 * 
 * This method must be called insertValue() and must have the following 
 * parameter types: int[], integer, integer. 
 * 
 * Calling insertValue(a, 100, 2) would change the array {1, 2, 3, 4, 5} 
 * to {1, 2, 100, 3, 4}.
 */


import java.util.Scanner;

class Lesson_33_Activity_Five {
  
    /*fill in the rest of method insertValue()
    {
    //Write your code here
    }
    */
    public static void insertValue(int[] nums, int num, int index) {
        int[] result = new int[nums.length];
        for (int i = 0; i < index; i++) {
            result[i] = nums[i];
        }
        result[index] = num;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = nums[i - 1];
        }
        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }
    }
  
    public static void main(String[] args)
     {
     /*
      * Test your method here
      */
     int[] nums = {1, 2, 3, 4, 5};
     insertValue(nums, 100, 2);
     for (int i = 0; i < nums.length; i++) {
         System.out.print(nums[i] + " ");
     }
    }
}