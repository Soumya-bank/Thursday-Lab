package codingjava;

public class PrintPattern {

	public static void main(String[] args) {
		//  write a java program to print number pattern
int i,j;
for(i=1;i<=5;i++) // raws outer loop
{
	for(j=1;j<=i;j++) // columns inner loop
{
		System.out.print(j);
}
	System.out.println();
	}
	}

}
