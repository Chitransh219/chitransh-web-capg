import java.io.*;
public class FileExample1 {
	public static void main(String args[]) throws IOException
	{
		File f1=new File("C:/chitransh web/Java_programs/Practice_project/src/name.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());
		System.out.println(f1.length());
		f1.delete();
	}
}
