import java.io.*;
public class BufferedReaderExamples {
	public static void main(String args[]) throws IOException
	{
		int ch;
		BufferedReader br=new BufferedReader(new FileReader("C:/chitransh web/Java_programs/Practice_project/src/file1.txt"));
		while((ch=br.read())!=-1) {
			System.out.println((char)ch);
		}
		br.close();
		
		BufferedReader br1=new BufferedReader(new FileReader("C:/chitransh web/Java_programs/Practice_project/src/file2.txt"));
		String s1;
		while((s1=br1.readLine())!=null) {
			System.out.println(s1);
		}
		
		br1.close();
		
		BufferedReader br2=new BufferedReader(new FileReader("C:/chitransh web/Java_programs/Practice_project/src/file2.txt"));
		char s[]=new char[20];
		br2.read(s,2,4);
		System.out.println();
		System.out.println(s);
		br2.close();
	}
}
