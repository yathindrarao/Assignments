package com.sapient.command_line;

import java.util.ArrayList;

public class Command_Line1 {

	private ArrayList<Integer> list = new ArrayList<Integer>();

	public void setData(int... values) {
		for (int value : values) {
			list.add(value);
		}

	}

	public void getData() {
		for (int value : list) {
			System.out.println(value + ' ');
		}

	}

	public int sumOfData() {
		int sum = 0;
		for (int value : list) {
			sum += value;
		}
		return sum;
	}

	public double avgOfData() {
		double avg = (double) sumOfData() / list.size();
		return avg;
	}

	public int bigOfData() {
		int max = Integer.MIN_VALUE;
		for (int value : list) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}

	public int smallOfData() {
		int min = Integer.MAX_VALUE;
		for (int value : list) {
			if (value < min) {
				min = value;
			}
		}
		return min;
	}

}
