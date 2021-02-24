package com.jg;

public class Main {

    public static void main(String[] args) {

        int arr[] = {-2, 0, 3, 8};
        System.out.println(Consecutive(arr));
    }

    public static int Consecutive(int[] arr) {

        // Edge case - check if the array is at least 2 elements long
        if(arr.length < 2)
            return 0;

        // Edge case - check if all of the elements in array are the same
        boolean allSame = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[0] != arr[i]){
                allSame = false;
                break;
            }
        }
        if(allSame == true)
            return 0;

        // Find the length of the consecutive array by finding the max. and the min. values of the given array
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue)
                maxValue = arr[i];
        }

        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minValue)
                minValue = arr[i];
        }

        return (maxValue - minValue + 1) - arr.length;
    }
}

/** Coder Byte Challange:
 * Have the function Consecutive(arr) take the array of integers stored in arr
 * and return the minimum number of integers needed to make the contents of arr consecutive
 * from the lowest number to the highest number.
 * For example: If arr contains [4, 8, 6] then the output should be 2 because
 * two numbers need to be added to the array (5 and 7) to make it a consecutive array of numbers from 4 to 8.
 * Negative numbers may be entered as parameters and no array will have less than 2 elements.
 */

