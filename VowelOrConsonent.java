// write a program to input any alphabet and check whether its vowel or consonant.
package javaprogram;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter Character");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
	System.out.println("Vowel");
}
else
{
	System.out.println("Consonent");
}
	}

}
