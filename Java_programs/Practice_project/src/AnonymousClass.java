//Anonymous class will always be a child class and inner class
class Greetings{
	public void show() {
		System.out.println("say hello");
	}
}
class India{
	Greetings g1=new Greetings() {
		public void show() {
			System.out.println("Namaste");
		}
	};
}
public class AnonymousClass {
	public static void main(String args[])
	{
		India india =new India();
		india.g1.show();
	}
}
