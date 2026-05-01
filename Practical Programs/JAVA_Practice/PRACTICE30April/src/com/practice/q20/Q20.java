package com.practice.q20;

public class Q20 {
    public static void main(String[] args) {

        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n = mat.length;

        // STEP 1: Transpose
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // STEP 2: Reverse each row
        for(int i=0;i<n;i++) {
            int start = 0, end = n-1;

            while(start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;

                start++;
                end--;
            }
        }

        // PRINT RESULT
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
