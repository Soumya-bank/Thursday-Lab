package codingjava;

public class PrintPattern2 {

	public static void main(String[] args) {
		// write a java program to print number reverse pattern
		int i,j;
		for(i=1;i<=5;i++) // raws outer loop
		{
			for(j=5;j>=i;j--) // columns inner loop
		{
				System.out.print(j);
		}
			System.out.println();
			}
	}

}
