package Logical;

import java.util.Scanner;

public class FactorialOfNumber {

	
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
	
		int fact=1;
		System.out.println("Enter Number");
		
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
System.out.println("Factorial of  give  number = "+num+"="+fact);		
	}
}
