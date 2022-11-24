package com.Java.basics;
import java.util.Scanner;
public class ForReversingNumber 
{
	      public static void main(String[] args)
			{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Number : ");
			int number = scanner.nextInt();
			
			int reverse=0;
			int remainder;
			
			for(int i=number;i>0;)
			{
				remainder = number%10;           
				reverse = (reverse*10) + remainder;  
				number = number/10;              
			}
			
			System.out.println("The Reverse of a Number Is : " +reverse);
			}
}

