//the only difference between both is LHS preserve insertion order and HS does not

import java.util.*;
public class HashSetAndLinkedHashSet {
	public static void main(String args[]) {
		HashSet h1=new HashSet();
		h1.add("one");
		h1.add("two");
		h1.add("three");
		h1.add("four");
		h1.add("one");
		System.out.println(h1);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("one");
		lhs.add("two");
		lhs.add("three");
		lhs.add("four");
		lhs.add("one");
		System.out.println(lhs);
	}
}
