package com.algorithms;

import com.algorithms.search.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int key = 3243;
        BinarySearch binary = new BinarySearch();
        binary.search(arr,key);
    }
}
