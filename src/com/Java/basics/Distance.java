package com.Java.basics;

public class Distance 
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[0]);
		double distance = Math.sqrt(x*x + y*y);
		System.out.println("Distance Is : " +distance);

	}

}
