//collections is a class in java which have static methods which can be applied on collection framework objects such as
//list,set, queues and their child classes
import java.util.*;
public class CollectionsClass {
	public static void main(String args[]) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v);
		Collections.sort(v);
		int x=Collections.binarySearch(v, 20);
		System.out.println(v);
		System.out.println(x);
	}
}
