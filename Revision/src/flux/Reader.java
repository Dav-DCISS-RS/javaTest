package flux;
import java.io.*;
public class Reader {

	public Reader() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException{
		

		FileReader in = new FileReader("/home/david/Bureau/to do list");
		BufferedReader lecture = new BufferedReader(in);
		LineNumberReader count = new LineNumberReader(lecture);
		
		String line = null;
		while(line= count.readLine() != null) {
			int lineNum = count.getLineNumber();
			System.out.println("ligne : "+ lineNum);
		}
		count.close();

	}

}
