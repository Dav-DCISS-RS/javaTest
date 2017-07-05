package flux;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTxt {

	public ReadTxt() {
		
	}

	public static void main(String[] args) throws IOException {
		Path f1 = Paths.get("/home/david/Documents/testjava.txt");
		Reader in = null;
		
		try{
			//Reader in = new BufferedInputStream(Files.newInputStream(f1)); 
			in = Files.newBufferedReader(f1, Charset.defaultCharset());
			
			int c;
			
			while ((c = in.read()) != -1){
				//System.out.println(((char)c));
				System.out.println(in.read());
			}
		}catch (NoSuchFileException e){
			System.err.println("le fichier "+ f1 +" n'exite pas !" );
		}
		
		finally {
			if (in != null){
				in.close();
			}
		}
	}

}
