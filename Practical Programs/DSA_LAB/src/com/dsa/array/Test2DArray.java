package com.dsa.array;

public class Test2DArray {

	public static void main(String[] args) {
		My2DArray ob = new My2DArray();
		ob.acceptData();
		ob.displayData();

		System.out.println("-----------------------");
		int[] SumArr = ob.findSumRowWise();
		System.out.println("ROWWISE SUM-- ");
		for (int i = 0; i < SumArr.length; i++) {
				System.out.print(SumArr[i]+ "\t");
			System.out.println();
		}

		System.out.println("-----------------------");
		// System.out.println(ob.isIdentity());
		// System.out.println(ob.isSymmetric());

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
	}

}
