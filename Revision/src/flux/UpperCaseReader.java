package flux;
import java.io.*;

public class UpperCaseReader extends FilterReader{

	public UpperCaseReader(Reader in) {
		super (in);
	}

	public int read() throws IOException{
		char cb[] = new char[1];
		if (read (cb, 0, 1) == -1){
			return -1;
		}else{
			return cb[0];
		}
	}
	@Override
	public int read(char[]cbuf, int off, int len) throws IOException{
		int read = super.read(cbuf, off, len);
		for (int i=off; i<off+read; i++){
			if (Character.isLetter(cbuf[i])){
				cbuf[i] = Character.toUpperCase(cbuf[i]);
			}
		}
		return read;
	}
}
