package ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\java\\aa\\data\\새 텍스트 문서.txt";
		
//		InputStream input = new FileInputStream(path);
//		int data = input.read();
//		input.close();
//		System.out.printf("%d : %c",data,data);// 아스키 코드표
		
		InputStream input = new FileInputStream(path);
		byte[] data = new byte[1024];
		int byteRead = 0;
		String str = null;
		
		while((byteRead = input.read(data)) != -1) {
			//byteRead는 글자의 크기,읽을게 없어지면 (!=-1) 반복을 끝낸다.
			str = new String(data,0,byteRead);
		}
		System.out.println(str);
		input.close();
	}

}
