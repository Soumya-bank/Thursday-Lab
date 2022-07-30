//Write a program to calculate Area & Perimeter of rectangle
package codingjava;

import java.util.Scanner; // import Scanner Class

public class AreaandPerimeterOfRectangle { 

	public static void main(String[] args) { // main method
		int l,b,area,perimeter;
		System.out.println("length breath"); // take length and breath
		Scanner obj=new Scanner(System.in); // take scanner class ref. object
		l=obj.nextInt();
		b=obj.nextInt();
		area=l*b;         // area formula
		perimeter=2*(l+b);  // perimeter formula
		System.out.println(" Area of rectangle "+area);   // print
		System.out.println(" Perimeter of rectangle "+perimeter);  //print

	}

}
