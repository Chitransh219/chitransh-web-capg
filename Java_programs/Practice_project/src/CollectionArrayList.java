import java.util.*;
public class CollectionArrayList {
	public static void main(String args[]) {
		ArrayList l1=new ArrayList(4);
		l1.add("chiku");
		l1.add("Krishna");
		l1.add(0, "ronak");
		Iterator it=l1.iterator();
		while(it.hasNext())
			System.out.println(it.next());
				
	}
}
