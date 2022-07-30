// WAJP to do add/ sub/ division/ subtraction/ multiple two number with choice press key 
package codingjava;

import java.util.Scanner;

public class Calculator {
	public static int addition(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static int substraction(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public static int multiplication(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public static int division(int a,int b)
	{
		int c=a/b;
		return c;
	}
	public static void main(String[] args) {
		int choice,num1,num2;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1. for Addition\n" + "Press 2. for Substraction\n"
		+ "Press 3. for Multiplication\n" + "Press 4. for Division\n" + "Press 5. for quit");
		System.out.println("Enter Your Choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter Any Two Number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int result=Calculator.addition(num1,num2);
		System.out.println(" Addition Value is: "+ result);
		break;
		case 2:System.out.println("Enter Any Two Number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int result1=Calculator.substraction(num1,num2);
		System.out.println(" Substraction Value is: "+ result1);
		break;
		case 3:System.out.println("Enter Any Two Number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int result2=Calculator.multiplication(num1,num2);
		System.out.println(" Multiplication Value is: "+ result2);
		break;
		case 4:System.out.println("Enter Any Two Number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int result3=Calculator.division(num1,num2);
		System.out.println(" Division Value is: "+ result3);
		break;
		case 5: break;
		default:System.out.println("wrong choice");
	} // end switch 
	} // end do
	while(choice!=5);
	System.out.println("Thank You");
}
}