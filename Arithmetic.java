package javaprogram;

import java.util.Scanner;

public class Arithmetic {
	

		public static void main(String[] args) {
			int a,b,c,ch;
			System.out.println("Enter any two numbers");
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
	        b=s.nextInt();
	        ch=s.nextInt();
	        System.out.println("Enter your choise");
	        switch(ch)
	        {
	        case 1: c=a+b;
		 System.out.println("Addition"+c);
	       break;
	        case 2: c=a-b;
	   	 System.out.println("Subtraction"+c);
	          break;
	        case 3: c=a*b;
	   	 System.out.println("multiplication"+c);
	          break;
	        case 4: c=a/b;
	   	 System.out.println("Division"+c);
	          break;
	        case 5: c=a%b;
	   	 System.out.println("Remainder"+c);
	          break;
	        default:
	      System.out.println("Invalid choise...");
		}

	}
	}

