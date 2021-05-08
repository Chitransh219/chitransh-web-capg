//tree set only contains homogenous values and from java version 6 it does'nt take null value as first element as well. 
import java.util.*;
public class TreeSetClass {
	public static void main(String args[]) {
		TreeSet t=new TreeSet();
		t.add("A");
		t.add(10);
		System.out.println(t);
	}
}
