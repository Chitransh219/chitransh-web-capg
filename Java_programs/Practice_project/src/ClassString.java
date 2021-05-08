//string is a final class i.e. it can't be extended.....also it is immutable class.

public class ClassString {
	public static void main(String args[]) {
		String s1="computer";
		String s2="computer";
		String s3=new String("computer");
		System.out.println("Result1 :"+(s1==s2));
		System.out.println("Result1 :"+s1.equals(s2));
		System.out.println("Result1 :"+(s1==s3));
		System.out.println("Result1 :"+s1.equals(s3));
	}
}
