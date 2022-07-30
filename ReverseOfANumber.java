package codingjava;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		//Write a java Program to reverse of any Number
				int num,rem,reverse=0,temp;
				System.out.println("Enter Any Number");
				Scanner sc=new Scanner(System.in);
				num=sc.nextInt();
				temp=num;
		while(num!=0)
		{
			rem=num%10;
			reverse=reverse*10+rem;
		num=num/10;
		}
		System.out.println(" Reverse of " +temp+ " is " +reverse);


	}

}
