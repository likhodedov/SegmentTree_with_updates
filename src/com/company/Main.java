package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11};
        int n = arr.length;
        LazySegmentTree tree = new LazySegmentTree();

        // Build segment tree from given array
        tree.constructST(arr, n);

        // Print sum of values in array from index 1 to 3
        System.out.println("Sum of values in given range = " +
                tree.getSum(n, 1, 3));

        // Add 10 to all nodes at indexes from 1 to 5.
        tree.updateRange(n, 1, 5, 10);

        // Find sum after the value is updated
        System.out.println("Updated sum of values in given range = " +
                tree.getSum(n, 1, 3));
    }
}
