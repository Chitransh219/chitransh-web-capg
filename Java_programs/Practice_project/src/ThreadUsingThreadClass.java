class A3 extends Thread
{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Class A " +i);
		}
	}
}
class B3 extends Thread
{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Class B " +i);
		}
	}
}
public class ThreadUsingThreadClass {
	public static void main(String args[]) {
		A3 a1= new A3();
		B3 b1=new B3();
		a1.start();
		b1.start();
	}
}
