// write a program to to check if the number is divisible by 5 and 11 or not.
package javaprogram;

import java.util.Scanner;

public class CalculateReminder {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter Any Number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%5==0 && n%11==0);
		System.out.println(n+" is divisible by 5 and 11");
	}

}
