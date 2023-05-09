package ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Num {

	public static void main(String[] args) throws IOException {
		String path = "C:\\java\\aa\\data\\새 텍스트 문서.txt";
		
		FileOutputStream out = new FileOutputStream(path);
		
		for(int i=0; i<100;i++) {
			String massage = Integer.toString(i+1);
			byte[] data = massage.getBytes();
			out.write(data);
			
		}
		out.close();

	}

}
