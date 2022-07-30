// WAJP TO PRINT SUM OF NATURAL NUMBER
package javaprogramming;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int n,i,sum=0;
		System.out.println("Enter The Range");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	sum=sum+i;
}
System.out.println(" Sum of " +n+ " natural number: " +sum);
	}

}
