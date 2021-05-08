
class A2 implements Runnable
{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Class A " +i);
		}
	}
}
class B2 implements Runnable
{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Class B " +i);
		}
	}
}
public class ThreadsUsingRunnable {
	public static void main(String args[]) {
		Thread t1=new Thread(new A2());
		Thread t2=new Thread(new B2());
		t1.start();
		t2.start();
	}
	
}
