package com.sapient.week8;

public class scientificCalculator extends calculator{

	public void sin(double a)
	{
		double b=Math.toRadians(a);
		System.out.println(Math.sin(b));
		
	}
	public void cos(double a)
	{
		double b=Math.toRadians(a);
		System.out.println(Math.cos(b));
		
	}
	public void tan(double a)
	{
		double b=Math.toRadians(a);
		System.out.println(Math.tan(b));
		
	}
	public void display()
	{
		System.out.println("This is a scentific Calculator");
	}
}
