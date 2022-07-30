// WAJP FOR THE FIBONACCI SERIES
//0,0+1=1,1+1=2,2+1=3,3+2=5,5+3=8,8+5=13
package codingjava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int term,a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter term");
		term=sc.nextInt();
		for(int i=1;i<=term;i++)
		{
			System.out.print(a + " ");
			c=a+b;
			a=b;
			b=c;
	}
	}
}
