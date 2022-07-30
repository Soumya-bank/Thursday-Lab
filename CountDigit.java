package javaprogramming;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		int n,count=0;
		System.out.println("Enter The Number:");
       Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for (;n>0;) // while(n>0)
	{
	n=n/10;
	count++;
	}
System.out.println("Number Of Digits: "+count);
	}

}
