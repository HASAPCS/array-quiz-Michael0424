package com.example;

public class ArrayOperations {
    // Exercise 1: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        int max = array[0];
        for(int num:array){
            if(num>max){
                max=num;
            }
        }
        // TODO: Implement the logic to find the maximum value in the array.
        return max; // Placeholder return value
        
    }

    // Exercise 2: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        // TODO: Implement the logic to calculate the average of the array elements.
        return (double) sum / array.length; // Placeholder return value
    }

    // Exercise 3: Reverse an Array
    public static int[] reverseArray(int[] array) {
        int i = 0, j =array.length - 1;
        while(i>j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j++;
            i--;
        }
        // TODO: Implement the logic to reverse the array.
        return new int[i]; // Placeholder return value
    }
}
