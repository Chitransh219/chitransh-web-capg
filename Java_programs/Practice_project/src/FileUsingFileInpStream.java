import java.io.*;
public class FileUsingFileInpStream {
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fin=new FileInputStream("C:/chitransh web/Java_programs/Practice_project/src/name.txt");
		
		do {
			i=fin.read();
			if(i!=-1)
				System.out.print((char)i);
		}while(i!=-1);
		fin.close();
	}
}
