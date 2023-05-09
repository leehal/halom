package ex01;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteBufferFile {
	public static void main(String[] args) throws IOException {
		

	String path = "C:\\java\\aa\\data\\새 텍스트 문서.txt";
	String massage = "Hello, java";
	
	BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path));
	
	byte[] data = massage.getBytes();
	out.write(data);
	System.out.println("파일을 정상적으로 저장했습니다.");
	out.close();
	
	}
}
