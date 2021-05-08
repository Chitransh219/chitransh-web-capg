import java.io.*;
public class BufferedWriterClass {
	public static void main(String args[]) throws IOException
	{
		FileWriter fw= new FileWriter("C:/chitransh web/Java_programs/Practice_project/src/file1.txt",true);
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write("computer");
		bf.close();
	}
}
