package com.sapient.week8;

public class number implements numberinterface{
 @Override
 public boolean checkPrime(int num)
 {
	 if(num<0)
	 {
		 throw new IllegalArgumentException("Enter positive number");
	 }
	 for(int i=2;i<=Math.sqrt(num);i++)
	 {
		 if(num%i==0)
			 return false;
	 }
	 return true;
	 
		 
 }

 @Override
 public boolean checkArmstrong(int num)
 {   
	 if(num<0)
	 {
		 throw new IllegalArgumentException("Enter positive number");
	 }
	 int temp=num;
 int sum=0;
	 while(temp!=0)
	 {
		 sum+=(temp%10)*(temp%10)*(temp%10);
		 temp=temp/10;
		 
	 }
	 if(sum==num)
	 return true;
	 else
		 return false;
	 
		 
 }
 @Override
 public boolean checkPalindrome (int num) throws Exception
 {
	 if(num<0)
	 {
		 throw new Exception("Enter positive number");
	 }
	 int temp=num,reversenum=0;
	 while(temp!=0)
	 {
		 reversenum=reversenum*10+temp%10;
		 temp=temp/10;
	 }
	 if(reversenum==num)
		 return true;
	 else
		 return false;
 }


 
}
