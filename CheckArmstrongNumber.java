 // Write a program to check that it is Armstrong number or not
  // 153= 1^3+5^3+3^3
package codingjava;

import java.util.Scanner; // import Scanner 

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		int num,count=0,sum=0,rem;  // integer variable
		System.out.println("Enter Any Number to check armstrong or not");
		Scanner sc=new Scanner(System.in); // ref. object
		num=sc.nextInt();
	int	temp=num;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
        	num=temp;
		while(num!=0)
		{
			rem=num%10;
			sum+=Math.pow(rem, count);
			num=num/10;
		}
		if(sum==temp) // if else loop
			System.out.println("Its A Armstrong Number");
		else
					System.out.println("Its Not A Armstrong Number");
		
	}

}
