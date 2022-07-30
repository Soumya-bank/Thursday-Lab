// multiplication table
package javaprogramming;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int n,i;
		System.out.println("Enter Any Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}

	}

}
