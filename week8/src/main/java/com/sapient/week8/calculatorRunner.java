package com.sapient.week8;

public class calculatorRunner {
	static public void main(String[] args)
	{
		calculator calc1=new simpleCalculator();
		calc1.display();
		System.out.println(calc1.add(6,99));
		System.out.println(calc1.add(78,45));
		System.out.println(calc1.add(56,3));
		System.out.println(calc1.add(4,2));
		scientificCalculator calc2=new scientificCalculator();
		double a=45;
		calc2.display();
		calc2.sin(a);
		calc2.cos(a);
		calc2.tan(a);
		
	}

}
