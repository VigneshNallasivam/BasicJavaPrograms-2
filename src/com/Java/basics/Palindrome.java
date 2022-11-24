package com.Java.basics;
import java.util.Scanner;
public class Palindrome
{
       public static void main(String[] args)
		{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = scanner.nextInt();
		
		int sum=0;
		int remainder;
		int temp = number;
		
		while(number>0)
		{
			remainder = number % 10;           
			sum = (sum*10) + remainder;  
			number = number/10;              
		}
		
		if(temp==sum)
			System.out.println("Yes! Given Number Is a Palindrome Number");
		else 
			System.out.println("No! Given Number Is NOT a Palindrome Number");
		}
		
}

