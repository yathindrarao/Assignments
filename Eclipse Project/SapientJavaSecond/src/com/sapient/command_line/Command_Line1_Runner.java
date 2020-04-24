package com.sapient.command_line;

public class Command_Line1_Runner {

	public static void main(String[] args) {

		Command_Line1 cmdLine = new Command_Line1();

		cmdLine.setData(10, 215, 114);
		cmdLine.getData();

		System.out.println("Sum of the numbers is " + cmdLine.sumOfData());
		System.out.println("Average of the numbers is " + cmdLine.avgOfData());
		System.out.println("Biggest numbers is " + cmdLine.bigOfData());
		System.out.println("Smallest numbers is " + cmdLine.smallOfData());
	}

}
