package com.algorithms.search;

public class BinarySearch {
    public void search(int arr[], int key) {
        int low = 0, high = arr.length;
      int k = binarySearch(arr,key,low,high);
        System.out.println(k);
    }

    private int binarySearch(int[] arr, int key, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return binarySearch(arr, key, low, mid - 1);
            } else {
                return binarySearch(arr, key, mid + 1, high);
            }
        }

        return -1; // Key not found
    }
}

