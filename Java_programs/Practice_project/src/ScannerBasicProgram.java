import java.util.*;
public class ScannerBasicProgram {
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter a your name");
		String name=sc.next();
		System.out.println(a);
		System.out.println(name);
	}
}
