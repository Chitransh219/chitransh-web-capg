import java.io.*;
public class FileUsingFileOpStream {
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("C:/chitransh web/Java_programs/Practice_project/src/name.txt",true);
		String s="Tata";
		char[] ch=s.toCharArray();
		for (int i=0;i<s.length();i++) {
			fout.write(ch[i]);
		}
		fout.close();
	}
}
