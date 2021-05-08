//Array class contains static methods which can be applied to arrays containing premittive elements such as int,float etc
//as Collections class works only for non-premittive data types i.e for collection Framework containing interfaces
//containing classes and interfaces that contains only object type values i.e non-premittive ex-Integer,string,student.
import java.util.*;
public class ArraysClass {
	public static void main(String args[]) {
		int a[]={20,5,50,10,25};
		int i;
		for (i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
		
		Arrays.sort(a);
		System.out.println();
		for (i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
	}
}
