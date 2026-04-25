package com.dsa.array;

import java.util.Scanner;

public class My2DArray {
	private int[][] arr;

	public My2DArray() {
		arr = new int[3][3];
	}

	public My2DArray(int row, int col) {
		arr = new int[row][col];
	}

	public My2DArray(int[][] arr) {
		super();
		this.arr = arr;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter data for row " + i + " and column " + j);
				arr[i][j] = sc.nextInt();
			}
		}

	}

	public void displayData() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// find sum rowwise
	public int[] findSumRowwise() {
		int[] sum = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sum[i] = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}

		}
		return sum;
	}

	// find columnwise sum
	public int[] findSumColumnwise() {
		int[] sum = new int[arr[0].length];
		for (int i = 0; i < arr[0].length; i++) {
			sum[i] = 0;
			for (int j = 0; j < arr.length; j++) {
				sum[i] += arr[j][i];
			}
		}
		return sum;

	}

	public int[][] add2DArray(My2DArray ob) {
		if ((this.arr.length == ob.arr.length) && (this.arr[0].length == ob.arr[0].length)) {
			int[][] sum = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					sum[i][j] = this.arr[i][j] + ob.arr[i][j];
				}
			}
			return sum;

		}
		return null;
	}

	public int[][] sub2DArray(My2DArray ob) {
		if ((this.arr.length == ob.arr.length) && (this.arr[0].length == ob.arr[0].length)) {
			int[][] subtract = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					subtract[i][j] = this.arr[i][j] - ob.arr[i][j];
				}
			}
			return subtract;
		} else {
			return null;
		}
	}

	public int[][] matrixMultiplication(My2DArray ob) {
		// check whether columns of this.arr and rows of ob.arr matches
		if (this.arr[0].length != ob.arr.length) {
			return null;
		}
		// size will be rows of this and columns of ob
		int[][] result = new int[this.arr.length][ob.arr[0].length];
		// i is row number for result array and this.arr
		for (int i = 0; i < this.arr.length; i++) {
			/// j is column number for result and ob
			for (int j = 0; j < ob.arr[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < this.arr[0].length; k++) {
					sum += this.arr[i][k] * ob.arr[k][j];
				}
				result[i][j] = sum;
			}
		}

		return result;
	}

//if flag=true ----->rotate rows upward
//flag=false  ------>rotate rows downward
	public void rowRotate(boolean flag, int num) {

		if (flag) {

			for (int cnt = 0; cnt < num; cnt++) {
				// rotate up
				int[] temp = arr[0];
				for (int i = 0; i < arr.length - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[arr.length - 1] = temp;
			}
		} else {
			// rotate down
			int[] temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;

		}
	}

	// flag =true------> rotate right
	// flag=false------> rotate left
	public void columnRotate(boolean flag, int num) {
		if (flag) {
			// rigth rotate
			// 1. copy last column into temp
			int[] temp = new int[this.arr.length];
			for (int i = 0; i < this.arr.length; i++) {
				temp[i] = arr[i][arr[0].length - 1];
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = arr[0].length - 2; j >= 0; j--) {
					arr[i][j + 1] = arr[i][j];
				}
			}
			// copy temp column into 0 th column
			for (int i = 0; i < this.arr.length; i++) {
				arr[i][0] = temp[i];
			}
		} else {
			// left rotate num times
			for (int cnt = 0; cnt < num; cnt++) {
				// rotate columns to left one time
				// copy 1st culmn into temp
				int[] temp = new int[this.arr.length];
				for (int i = 0; i < this.arr.length; i++) {
					temp[i] = arr[i][0];
				}
				// shift every column to left
				for (int i = 0; i < arr.length; i++) {
					for (int j = 1; j < arr[0].length; j++) {
						arr[i][j - 1] = arr[i][j];
					}
				}
				// copy temp into last column
				for (int i = 0; i < arr.length; i++) {
					arr[i][arr[0].length - 1] = temp[i];
				}
			}
		}
	}

	public boolean isSymmetric() {
		// check whether it is square matrix, means number of rows and columns are equal
		if (this.arr.length == arr[0].length) {
			// then check values arr[i][j] == arr[j][i]
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] != arr[j][i]) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	public int[][] transpose() {
		int[][] temp = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				temp[j][i] = arr[i][j];
			}
		}
		return temp;
	}

	// if all digonal elements are 1 and all nondiagonal elements are 0
	// then the matrix is identity matrix
	public boolean isIdentity() {
		if (arr.length == arr[0].length) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if ((i == j) && (arr[i][j] != 1)) {
						return false;
					} else if ((i != j) && (arr[i][j] != 0)) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

}
