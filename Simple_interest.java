import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int p,r,n,si;
		System.out.println("principle,rate,number of time");
		p=obj.nextInt();
		r=obj.nextInt();
		n=obj.nextInt();
		si=p*r*n/100;
		System.out.println("simple interest: "+si);
	}
}
