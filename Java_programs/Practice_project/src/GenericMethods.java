//here place holder E will only replace with non-premitive value and not with premitive type
public class GenericMethods {
	public <E> void printArray(E s[]) {
		for(E x:s) {
			System.out.println(x);
		}
	}
	public static void main(String args[]) {
		GenericMethods g1=new GenericMethods();
		String countries[]=new String[] {"india","bhutan","nepal"};
		Integer arr[]= {12,45,76,34};
		g1.printArray(countries);
		g1.printArray(arr);
	}
}
