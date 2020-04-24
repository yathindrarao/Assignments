package com.sapient.keyread_line2;

import java.util.ArrayList;
import java.util.Collections;

public class KeyRead_Line2 {

	ArrayList<Integer> list = new ArrayList<Integer>();

	public void readData(ArrayList<Integer> list) {
		this.list = list;
	}

	public void displayData() {
		for (int value : list) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public void sort() {
		Collections.sort(list);

	}

	public void find(int f) {

		if (list.contains(f))
			System.out.println(f + " is in the list");
		else
			System.out.println(f + " is not in the list");
	}

}
