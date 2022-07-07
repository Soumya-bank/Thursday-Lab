/* .w.a.p to calculate bonus.if employee is serving
 in organization for more than 3years, bonus 2500 will be given to employee */
package javaprogram;

import java.util.Scanner;

public class CalculateBonus {

	public static void main(String[] args) {
		int ServingYear,CurrentYear,JoinYear,Bonus;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Joining Year:");
JoinYear=s.nextInt();
System.out.println("Enter the Current Year:");
CurrentYear=s.nextInt();
ServingYear=CurrentYear-JoinYear;
if(ServingYear>3);
Bonus=2500;
System.out.println("Provide the Bonus:"+Bonus);

	}

}
