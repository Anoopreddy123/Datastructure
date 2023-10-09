package com.algorithms.sorting;

public class BubbleSort {

    public static void main(String[] args) {
       int[] arr = {3,2,3,1,2,4,5,5,6};
       int[] sortedArray = bubbleSort(arr);
        System.out.println(findKthLargest(arr,4));
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
return arr;

    }
    public static int findKthLargest(int[] nums, int k) {
        //TODO:finish this method.
        int max = Integer.MIN_VALUE, temp = 0,count = 0;
        for (int i = 0; i < nums.length; i++) {

                if (nums[i] > max){

                    temp = max;
                    max = nums[i];
                }



        }
        //TODO: Modify this line to return correct data.
        return temp;
    }
}
