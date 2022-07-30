package oopsdemoprogram;
abstract class A
{
	abstract void display();
	public void demo()
	{
		System.out.println("Hello BANK");
	}
}
interface In
{
	void add(int a,int b);
}
class child extends A implements In
{

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	void display() {
		System.out.println("Hello DISPLAY");
		
	}
	
}
public class MultipleInheritanceUsingExtendsImpliments {

	public static void main(String[] args) {
	child c=new child();
	c.add(22, 23);
	c.demo();
c.display();
	}

}
