// print all odd number
package javaprogramming;

import java.util.Scanner;

public class PrintAllOddNumber {

	public static void main(String[] args) {
		int n,i;
		System.out.println("Enter Range:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i=i+2)
{ 
	System.out.println(" odd number: "+i);
}
	}

}
