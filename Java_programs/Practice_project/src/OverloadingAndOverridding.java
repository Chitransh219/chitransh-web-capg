//overloading
class A{
	public void f1(int a) {
		System.out.println("class A");
	}
}
class B extends A{
	public void f1(int a,int b) {
		System.out.println("class B");
	}
}
//overloading function over


//overridding
class C   //car
{
	public void f2(int a) {
		System.out.println("class C");
	}
}
class D  //sports car
{
	public void f2(int a) {
		System.out.println("class D");
	}
}
//overridding fucntion over

public class OverloadingAndOverridding {
	public static void main(String args[]) {
		A a1=new A();
		B b1=new B();
		a1.f1(1);
		b1.f1(1,2);
		D d1=new D();
		d1.f2(3);
	}
}
