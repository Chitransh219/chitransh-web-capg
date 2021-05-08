
public class InstanceStaticInitializatioBlock {
	private int x;
	private static int k;
	{
		System.out.println("Initialization block x=" + x);
		x=5;
	}
	static {
		System.out.println("Static Initialization block K=" + k);
		k=10;
	}
	public InstanceStaticInitializatioBlock() {
		System.out.println("contructor x=" +x);
	}
	
	public static void main(String args[]) {
		new InstanceStaticInitializatioBlock();
	}
}
