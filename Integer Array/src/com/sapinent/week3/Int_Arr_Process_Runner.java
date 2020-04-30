package com.sapinent.week3;

import java.util.Scanner;

public class Int_Arr_Process_Runner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");

		int n = scan.nextInt();
		Integer[] array = new Integer[n];

		Int_Arr_Process arrayObj1 = new Int_Arr_Process(n);

		arrayObj1.operationsOnArray(arrayObj1);

		Int_Arr_Process arrayObj2 = new Int_Arr_Process();
		arrayObj1.operationsOnArray(arrayObj2);

		Int_Arr_Process arrayObj3 = new Int_Arr_Process(arrayObj1);
		arrayObj1.operationsOnArray(arrayObj3);

	}

}
