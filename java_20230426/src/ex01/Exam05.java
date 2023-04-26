package ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

public class Exam05 {

	private static Object write;

	public static void main(String[] args) throws IOException {
		
		String filePath = "c:/data/sample.txt";
		String filePath2 = "c:/data/data.txt";
		BufferedReader reader=null;
		BufferedWriter writer=null;
	try {	
		 reader = new BufferedReader(new FileReader(filePath));
		 writer = new BufferedWriter(new FileWriter(filePath2));
		String line =null;
		
		while((line=reader.readLine())!=null) {
			writer.write(line);
			writer.nullWriter();
		}
		
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}finally {
		reader.close();
		writer.close();
	}
	}

	

}
