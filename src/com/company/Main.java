package com.company;

public class Main {

    public static void main(String[] args) {
       int MAX=10000000;

        int[] matrix = new int[MAX];
//        int arr[] = {1, 3, 5, 7, 9, 11};
        for (int i=0;i<MAX;i++)
            matrix[i]=getRandomNumberInRange(0,5);
        long start= System.nanoTime();
        int n = matrix.length;
        LazySegmentTree tree = new LazySegmentTree();

        // Build segment tree from given array
        tree.constructST(matrix, n);

        // Print sum of values in array from index 1 to 3
        System.out.println("Sum of values in given range = " +
                tree.getSum(n, 1, 3));

        // Add 10 to all nodes at indexes from 1 to 5.
        tree.updateRange(n, 1, 5, 10);

        // Find sum after the value is updated
        System.out.println("Updated sum of values in given range = " +
                tree.getSum(n, 1, 3));
        long finish=System.nanoTime();
        System.out.println("SEGMENT TREE WITH "+MAX+" elements works "+(finish-start)+" nanoseconds");
    }
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
