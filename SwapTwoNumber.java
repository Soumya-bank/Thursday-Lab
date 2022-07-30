// WAJP TO SWAP TWO NUMBER USING THIRD VARIABLE
package codingjava;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int x,y,temp; // variable
		System.out.println("Enter x and y");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt(); // x=100
        y=sc.nextInt(); // y=200
        System.out.println("Before Swapping "+x+" "+y); // as it is print
        temp=x; // temp=100
        x=y; // 100=200
        y=temp; // y=100
        System.out.println("After Swapping "+x+" "+y); // 200 100
	}

}
