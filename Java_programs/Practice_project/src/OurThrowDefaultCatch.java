
public class OurThrowDefaultCatch {
	public static void main(String args[]) {
		int balance=5000;
		int withdrawlAmount=6000;
		
		if(balance<withdrawlAmount)
			throw new ArithmeticException("insufficient balance");
		
		balance=balance-withdrawlAmount;
		System.out.println("Transaction completed successfully");
		System.out.println("Program continue....");
	}
}
