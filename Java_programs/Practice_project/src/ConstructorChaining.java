class A1
{
	public A1() {
		System.out.println("A1");
	}
}
class B1 extends A1 
{
	public B1() {
		this(4);
		System.out.println("B1");
	}
	public B1(int x) {
		System.out.println("B2");
	}
}
public class ConstructorChaining {
	public static void main(String args[]) {
		B1 b=new B1();
	}
}
