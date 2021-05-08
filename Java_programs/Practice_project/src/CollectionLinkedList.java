import java.util.*;
public class CollectionLinkedList {
	public static void main(String args[]) {
		LinkedList l1=new LinkedList();
		l1.addFirst("Krishna");
		l1.addLast("chiku");
		l1.add(1, "the best");
		System.out.println(l1.getFirst());
		System.out.println(l1.get(1));
		System.out.println(l1.getLast());
		
	}
}
