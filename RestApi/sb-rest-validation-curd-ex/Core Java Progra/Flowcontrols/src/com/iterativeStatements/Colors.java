//Write a program to print the color name, based on color code. If color code in not valid then 
//print"Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow,W->White.Switch Statement

package com.iterativeStatements;
import java.util.Scanner;
public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=args[0].charAt(0);
		switch(ch)
		{
		case 1:
			System.out.println(" R->Red");
			break;
		case 2:
			System.out.println(" B->Blue");
			break;
		case 3:
			System.out.println(" G->Green");
			break;
		case 4:
			System.out.println(" O->Orange");
			break;
		case 5:
			System.out.println(" Y->Yellow");
			break;
		case 6:
			System.out.println("W->White");
			break;
			default:
				System.out.println("In-Valid");
		}
	}

}
