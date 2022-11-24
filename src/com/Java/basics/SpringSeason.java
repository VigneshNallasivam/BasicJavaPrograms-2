package com.Java.basics;

public class SpringSeason
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Month: ");
		int month = Integer.parseInt(args[0]);
		System.out.println("Enter Date: ");
		int date = Integer.parseInt(args[1]);
        if(date<=20)
        {
        	for(int i=1;i<=date;i++)
        	{
        		if(month>=3 && month<=6)
        		{
        			System.out.println("True");
        		}
        		else
        		{
        			System.out.println("False");
        		}
        	}
        }
        else
        	System.out.println("False: ");
        		
     }
}

