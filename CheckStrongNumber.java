// Write a program to check that it is strong number or not
// 145=1!+4!+5!
package codingjava;

import java.util.Scanner;

public class CheckStrongNumber {

	public static void main(String[] args) {
			int num,sum=0,rem,temp,fact,i;
			System.out.println("Enter Any Number:");
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			temp=num;
			while(num!=0)
			{
				rem=num%10;
				fact=1;
				for(i=1;i<=rem;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
				num=num/10;
			}
			{
				 if(sum==temp)
					System.out.println(temp+ " is a Strong Number ");
				else
					System.out.println(temp+ " is not a Strong Number ");
				}

	}

}
