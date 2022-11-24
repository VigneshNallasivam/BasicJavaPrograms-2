package com.Java.basics;

import java.util.Scanner;
public class ForReversingNumber 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = scanner.nextInt();
		int reverse = 0;
		int reminder ; 
		System.out.println("Actual Number: "+ number);
		for(int i = number ; i > 0; )//no need of decrement here
		{
			reminder = i % 10 ;
			reverse = reverse * 10 + reminder;
			i = i / 10;
			
		}	
		System.out.println("Reversed Number is: "+ reverse);

	}

}
