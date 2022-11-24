package com.Java.basics;
import java.util.Scanner;
public class QuadraticEquation 
{
	
	public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Value of a");
			double a = scanner.nextDouble();
			System.out.println("Enter Value of b");
			double b = scanner.nextDouble();
			System.out.println("Enter Value of c");
			double c = scanner.nextDouble();
			double root1;
			double root2;
			double discriminant = b*b - 4*a*c;
			
			if(discriminant >0)                                       //For Getting +ve Roots
			{
				System.out.println("Roots Are : ");
				root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			    root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			    System.out.println(root1);
			    System.out.println(root2);
			}
			
			else if(discriminant == 0)                                //For Getting '0' Root or One Root
			{
				System.out.println("Roots Are : ");
				root1 = root2 = -b/(2*a);
				System.out.println(root1);
			}
			
			else                                                      //For Getting -ve or Imaginary Roots
			{
				System.out.println("Roots Are : ");
				double real = -b/(2*a);
				double imaginary = Math.sqrt(-discriminant)/(2*a);
				System.out.println("Root-1 : " +real + " + i " +imaginary);
				System.out.println("Root-1 : " +real + " - i " +imaginary);
			}
			
			

		}

}


