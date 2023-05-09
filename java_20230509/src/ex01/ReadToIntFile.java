package ex01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadToIntFile {
	public static void main(String[] args) throws IOException {
		

	String path = "C:\\java\\aa\\data\\새 텍스트 문서.txt";
	
	DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
	out.writeInt(35);
	out.writeDouble(3.14);
	out.close();
	
	}
}
