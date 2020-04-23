package com.sapient.shapes;

import java.math.BigDecimal;

public class Shapes {

	Circle circle = new Circle();
	Square square = new Square();
	Triangle triangle = new Triangle();

	void calculateShapeArea(int noOfSides, int sideLength) {

		BigDecimal area = new BigDecimal(0);

		switch (noOfSides) {
		case 1:
			area = circle.calculateArea(sideLength);
			System.out.println("The Area of the Circle is " + area);
			break;
		case 3:
			area = triangle.calculateArea(sideLength);
			System.out.println("The Area of the Tirangle is " + area);
			break;
		case 4:
			System.out.println("The Area of the Square is " + square.calculateArea(sideLength));
			break;
		default:
			System.out.println("No Shapes present");

		}

	}

}
