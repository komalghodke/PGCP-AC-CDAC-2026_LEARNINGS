package com.dsa.array;

public class Test2DArray {
    public static void main(String[] args) {
        My2DArray ob = new My2DArray();
        ob.acceptData();
        ob.displayData();

        System.out.println("-----------------------");
        int[] SumArr = ob.findSumRowwise();
        System.out.println("ROWWISE SUM-- ");
        for (int sum : SumArr) {
            System.out.println(sum);
        }

        System.out.println("-----------------------");
        int[] SumC = ob.findSumColumnwise();
        System.out.println("COLUMN SUM-- ");
        for (int sum : SumC) {
            System.out.println(sum);
        }

        System.out.println("-----------------------");
        System.out.println("is identity? " + ob.isIdentity());
        System.out.println("is symmetric? " + ob.isSymmetric());

        System.out.println("------------- After Row Rotation ------------");
        ob.rowRotate(true, 2);
        ob.displayData();

        System.out.println("\n------------- After Column Rotation ------------");
        ob.columnRotate(true, 2);
        ob.displayData();

        My2DArray ob1 = new My2DArray();
        ob1.acceptData();
        ob1.displayData();

        System.out.println("\n-------------------------");

        int[][] sum = ob.add2DArray(ob1);
        My2DArray ob2 = new My2DArray(sum);
        ob2.displayData();

        System.out.println("\n-------------------------");

        int[][] diff = ob.sub2DArray(ob1);
        My2DArray ob3 = new My2DArray(diff);
        ob3.displayData();

        System.out.println("\n-------------------------");

        int[][] product = ob.matrixMultiplication(ob1);
        if (product != null) {
            My2DArray ob4 = new My2DArray(product);
            ob4.displayData();
        } else {
            System.out.println("Matrix multiplication not possible due to dimension mismatch.");
        }

        System.out.println("\n-------------------------");

        int[][] trans = ob.transpose();
        My2DArray ob5 = new My2DArray(trans);
        ob5.displayData();
    }
}