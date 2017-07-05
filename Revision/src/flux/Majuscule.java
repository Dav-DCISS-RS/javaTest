package flux;
import java.io.*;

public class Majuscule {

	public Majuscule() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			BufferedReader rec = new BufferedReader(new FileReader("/home/david/Documents/testjava.txt") );
			try{
				String mot;
				String motMajuscule;
				while(mot=rec.readLine() != null){
					motMajuscule = mot.toUpperCase();
					System.out.println(motMajuscule);
				}
			}finally{
				rec.close();
			}
		}catch (IOException e){
			e.printStackTrace();
		}

	}

}
