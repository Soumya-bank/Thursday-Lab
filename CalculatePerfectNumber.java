// perfect number check
//6-----=1 2 3 4 5 
// 6 divisible 1 2 3 so that 1+2+3=6 is a perfect number
package javaprogramming;

import java.util.Scanner;

public class CalculatePerfectNumber {

		public static void main(String[] args) {
			int n,i,sum=0;
			System.out.println("Enter Any Number:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(n==sum)
	System.out.println(n+ " is a perfect number");
	else
		System.out.println(n+ " is not a perfect number");
}
		
}