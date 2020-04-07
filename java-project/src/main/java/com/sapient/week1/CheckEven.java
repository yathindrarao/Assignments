package com.sapient.week1;
import java.util.Scanner;
/**
 * check Boolean
 *
 */
public class CheckEven 
{
    public static void main (String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the number for check odd or even: ");
	int count=1;
	int num;
	while (count <= 5) {
           num=scan.nextInt();
           count = count + 1; 	
	   check(num);
	}
	
    }

    public static boolean check(int num){
	if(num%2==0){ 
    	   System.out.println(num+" is even");
	   return true;   
	}
	else{ 
           System.out.println(num+" is odd");
	   return false;
	}
     }
}

