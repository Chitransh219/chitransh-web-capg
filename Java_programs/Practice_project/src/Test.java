class Box{
	private int length,breadth,height;
	public void setDimension(int l,int b,int h) {
		length=l;breadth=b;height=h;
	}
	public void showDimesnion() {
		System.out.println(length);
		System.out.println(breadth);
		System.out.println(height);
	}
}

public class Test {
	public static void main(String args[]) {
		Box smallBox=new Box();
		smallBox.setDimension(10, 20, 30);
		smallBox.showDimesnion();
		
	}
}
