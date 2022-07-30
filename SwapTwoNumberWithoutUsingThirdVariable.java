// WAJP TO SWAP TWO NUMBER WITHOUT USING THIRD VARIABLE
package codingjava;
import java.util.Scanner;
public class SwapTwoNumberWithoutUsingThirdVariable {

		public static void main(String[] args) {
			int x,y,temp; // variable
			System.out.println("Enter x and y");
			Scanner sc=new Scanner(System.in);
			x=sc.nextInt(); // x=100
	        y=sc.nextInt(); // y=200
	        System.out.println("Before Swapping "+x+" "+y); // as it is print
	        x=x+y; // x=100+200=300
	        y=x-y;    //y=300-200=100
	        x=x-y; // x=300-100=200
	        System.out.println("After Swapping "+x+" "+y); // 200 100
		}

	}
