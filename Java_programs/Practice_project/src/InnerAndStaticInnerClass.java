class Outer{
	static int x=5;
	static class Inner{
		void if1() {
			int y=10;
			System.out.println("if1() :"+x);
		}
	}
	class Inner1{
		void if2() {
			System.out.println("if2() :"+x);
		}
	}
}
public class InnerAndStaticInnerClass {
	public static void main(String args[]) {
		Outer.Inner o1=new Outer.Inner();
		o1.if1();
		Outer out=new Outer();
		Outer.Inner1 o2=out.new Inner1();
		o2.if2();
	}
}
