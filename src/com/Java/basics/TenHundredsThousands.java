package com.Java.basics;
import java.util.Scanner;
public class TenHundredsThousands 
{
	public static void main(String[] args) 
	{
			

	        
	                Scanner scanner = new Scanner(System.in);

	                int thousands = 0;
	                int hundreds = 0;
	                int tens = 0;
	                int ones = 0;

	                    
	                System.out.print("Enter a 6 digit number: ");
	                int number = scanner.nextInt();
	                
	                thousands = number / 1000;
	                System.out.println("Thousands Place digit: " +thousands);

	               
	                hundreds = number / 100;
	                System.out.println("Hundreds place digit: " +hundreds);

	        
	                tens = number/ 10;
	                System.out.println("Tens place digit: " +tens);
	                
	                ones = number;
	                System.out.println("Ones Place digit: " +ones);
			

	}
}
