// print all even number
package javaprogramming;

import java.util.Scanner;

public class PrintAllEvenNumber {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter Range:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<=n;i=i+2)
{ 
	System.out.println(" Even number: "+i);
}
	}

}
