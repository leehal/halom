package ex01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.Buffer;

public class Exam07 {

	public static void main(String[] args) throws IOException {
		
		String filePath = "c:/data/sample.txt";
		
		
		
	try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){	
		String line =null;
		
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	}
	}


