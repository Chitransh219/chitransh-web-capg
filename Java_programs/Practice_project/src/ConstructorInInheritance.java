class Test1
{
	public Test1(int a) {
		System.out.println("A");
	}
}
class Test2 extends Test1{
	public Test2() 
	{
		super(5);
		System.out.println("B");
	}
}
public class ConstructorInInheritance {
	public static void main(String args[]) {
		Test2 b1=new Test2();
	}
}