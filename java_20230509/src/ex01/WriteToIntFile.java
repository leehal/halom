package ex01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteToIntFile {
	public static void main(String[] args) throws IOException {
		

	String path = "C:\\java\\aa\\data\\새 텍스트 문서.txt";
	
	DataInputStream in = new DataInputStream(new FileInputStream(path));
	int num = in.readInt();
	double f = in.readDouble();
	System.out.println(num);
	System.out.println(f);
	in.close();
	
	}
}
