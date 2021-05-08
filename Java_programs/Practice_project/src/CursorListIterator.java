//iterator and enumeration works only in single direction. and iterator can remove element but enumeration does not 
//but list iterator does all.
import java.util.*;
public class CursorListIterator {
	public static void main(String args[]) {
		LinkedList l1=new LinkedList();
		l1.add("C");
		l1.add("C++");
		l1.add("Java");
		l1.add("PHP");
		
		System.out.println(l1);
		
		ListIterator lit=l1.listIterator();
		
		while(lit.hasNext()) {
			
			String s=(String)lit.next();
			
			if(s.equals("Java"))
				lit.set("Java SE");
			
			if(s.equals("c"))
				lit.add("DS");
			
			if(s.equals("PHP"))
				lit.remove();
		}
		
		System.out.println(l1);
	}
}
