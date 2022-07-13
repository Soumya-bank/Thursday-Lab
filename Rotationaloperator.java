/* write a program to calculate marks and average five subjects and calculate
grade based on certain condition:
if avg >=90 grade A+
avg >=80 grade A
avg >=60 grade B
avg >=40 grade C
avg <40 grade D
*/
package javaprogram;

import java.util.Scanner;

public class Rotationaloperator {

	public static void main(String[] args) {
		int m1,m2,m3,m4,m5,total,avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 5 marks");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
m5=sc.nextInt();
total=m1+m2+m3+m4+m5;
avg=total/5;
System.out.println("total: "+ total +" "+" Average:"+ avg);
System.out.println("Grade:");
if (avg>=90)
	System.out.println("A+");
else if (avg>=80)
	System.out.println("A");
else if (avg>=60)
	System.out.println("B");
else if (avg>=40)
	System.out.println("c");
else 
	System.out.println("D");
	}

}
