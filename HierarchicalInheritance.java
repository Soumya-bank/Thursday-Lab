package oopsdemoprogram;

class Bank { // super class
	public void loanInterest()
	  {
		System.out.println("9% interest rate"); 
	  }
     }
class Sbi extends Bank // sub class
   {
	public void pensionScheme()
	   {
		System.out.println("minimum 5 year scheme ");
	   }

   }
 class Axis extends Bank // 2nd sub class
  {
	public void fixeddeposit()
	 {
		System.out.println("tenure year is 5%");
	 }
  }
 public class HierarchicalInheritance {

		public static void main(String[] args) {

		
		Sbi sbi=new Sbi();
		sbi.loanInterest();
		sbi.pensionScheme();
		
		Axis axis=new Axis();
		axis.loanInterest();
		axis.fixeddeposit();	

	}
}
