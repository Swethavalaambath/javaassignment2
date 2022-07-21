package com.swe.command;

public class Command {

	public static void main(String[] args) 
		{System.out.println("enter command line argument");
		
		System.out.println("command line argument is :");
		int n=Integer.parseInt(args[0]);
		if (n%2==0)
			{System.out.println("Even");
		
		}else
		System.out.println("Odd");
		
		// TODO Auto-generated method stub

	}}


