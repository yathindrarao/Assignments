package com.sapinent.week3;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {

	Scanner scan = new Scanner(System.in);
	Integer[] array;

	public Int_Arr_Process(int n) {

		readArray(n);
	}

	public Int_Arr_Process() {

		readArray(10);
	}

	Int_Arr_Process(Int_Arr_Process arrayObj1) {
		this.array = arrayObj1.array;
	}

	public void displayArrayHorzi() {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public void displayArrayVerti() {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + " ");
	}

	public void readArray(int n) {
		Integer[] array = new Integer[n];
		System.out.println("Enter the " + n + " numbers to be added to array: ");
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		this.array = array;

	}

	public void sortArray() {
		Arrays.sort(array);

	}

	public int sumOfArray() {
		int sum = 0;
		for (int value : array) {
			sum += value;
		}
		return sum;
	}

	public int maxOfArray() {
		int max = Integer.MIN_VALUE;
		for (int value : array) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}

	public int minOfArray() {
		int min = Integer.MAX_VALUE;
		for (int value : array) {
			if (value < min) {
				min = value;
			}
		}
		return min;
	}

	void operationsOnArray(Int_Arr_Process arrayObj) {

		System.out.print("Array is printed horizontally: ");
		arrayObj.displayArrayHorzi();
		System.out.println("Array is printed verticallytally: ");
		arrayObj.displayArrayVerti();
		arrayObj.sortArray();
		System.out.print("Array is sorted: ");
		arrayObj.displayArrayHorzi();
		System.out.println("sum of array is : " + arrayObj.sumOfArray());
		System.out.println("Minimum of array is : " + arrayObj.minOfArray());
		System.out.println("maximum of array is : " + arrayObj.maxOfArray());
		System.out.println();

	}

}
