//.wap to check whether a character is uppercase or lowercase.
package javaprogram;

import java.util.Scanner;

public class UppercaseLowercase {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter Character");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
if(ch>='A' && ch<='Z') 
	System.out.println(ch+" is in Uppercase");
else if(ch>='a' && ch<='z') 
	System.out.println(ch+" is in Lowercase");
	}
}
