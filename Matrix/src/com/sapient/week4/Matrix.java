package com.sapient.week4;

import java.util.Scanner;

public class Matrix {

	Scanner scan = new Scanner(System.in);
	int[][] matrix;

	public Matrix(int n, int m) {

		this.matrix = readMatrix(n, m);
	}

	public Matrix() {

		this.matrix = readMatrix(3, 3);
	}

	Matrix(Matrix arrayObj1) {
		this.matrix = arrayObj1.matrix;
	}

	public void displayMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

	public void displayMatrix(int[][] matrix) {
		System.out.println("Matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

	public int[][] readMatrix(int n, int m) {
		int[][] matrix = new int[n][m];
		System.out.println("Enter the values of matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				matrix[i][j] = scan.nextInt();
			System.out.println();
		}
		return matrix;

	}

	public int sumOfMatrix() {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int value : matrix[i])
				sum += value;
		}
		return sum;
	}

	private int[][] additionMatrix(int[][] matrix2) {
		if (matrix2.length == matrix.length && matrix2[0].length == matrix[0].length) {
			int[][] addedMatrix = new int[matrix.length][matrix[0].length];
			for (int i = 0; i < matrix2.length; i++)
				for (int j = 0; j < matrix2[i].length; j++)
					addedMatrix[i][j] = this.matrix[i][j] + matrix2[i][j];
			System.out.println("Matrix after adding");
			displayMatrix(addedMatrix);
			return addedMatrix;

		} else {
			System.out.println("addition can't be done /n");
			return null;
		}
	}

	private int[][] multiplicationMatrix(int[][] matrix2) {
		int sum = 0;
		int[][] multiply = new int[matrix.length][matrix2[0].length];
		if (matrix2.length == matrix[0].length) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix2[0].length; j++) {
					for (int k = 0; k < matrix[0].length; k++)
						sum = sum + matrix[i][k] * matrix2[k][j];

					multiply[i][j] = sum;
					sum = 0;
				}
			}
			System.out.println("Matrix after multiplication");
			displayMatrix(multiply);

		} else {
			System.out.println("Multiplication can't be done /n");
		}
		return multiply;
	}

	public Boolean scalarMatrix() {
		int x = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][i] != x)
					return false;
				if (matrix[i][j] != 0 && i != j)
					return false;
			}
		}
		return true;
	}

	void operationsOnArray(Matrix matrixObj) {

		System.out.println("Matrix: ");
		matrixObj.displayMatrix();

		Boolean scalarMatrix = matrixObj.scalarMatrix();
		System.out.println("Matrix scalar is :" + scalarMatrix);

		int[][] matrix2;
		System.out.print("Enter the size of the matrix2  n, m: ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		matrix2 = readMatrix(n, m);
		matrixObj.displayMatrix(matrix2);

		int[][] multipliedMatrix = matrixObj.multiplicationMatrix(matrix2);
		int[][] addedMatrix = matrixObj.additionMatrix(matrix2);

		System.out.println("sum of array is : " + matrixObj.sumOfMatrix());

	}

}
