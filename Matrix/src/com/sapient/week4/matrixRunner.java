package com.sapient.week4;

import java.util.Scanner;

public class matrixRunner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the matrix n, m: ");

		int n = scan.nextInt();
		int m = scan.nextInt();

		Matrix matrixObj1 = new Matrix(n, m);
		matrixObj1.operationsOnArray(matrixObj1);

		Matrix matrixObj2 = new Matrix();
		matrixObj2.operationsOnArray(matrixObj2);

		Matrix matrixObj3 = new Matrix(matrixObj1);
		matrixObj3.operationsOnArray(matrixObj3);

		scan.close();
	}

}
