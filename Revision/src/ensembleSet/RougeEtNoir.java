package ensembleSet;
import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RougeEtNoir {

	public RougeEtNoir() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		Path f1 = Paths.get("/home/david/Bureau/Symfony memo");
		
		Reader in = null;
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		TreeMap<Integer,Set<String>> TokenTriee = new TreeMap<Integer,Set<String>>();
		
		
		in = Files.newBufferedReader(f1, Charset.defaultCharset());
		
		Scanner scan = new Scanner(in);
		
		scan.useDelimiter("(\\p{Punct}|\\p{Space})+");
		
		while (scan.hasNext()){
			String mot = scan.next();
			mot = mot.toLowerCase();
			
			if (!map.containsKey(mot)){
				map.put(mot, 1);
			}else {
				map.put(mot, map.get(mot)+1);
			}
		}
		scan.close();
		
		Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry<String, Integer> e = it.next();
		
			Set<String> s1 = TokenTriee.get(e.getValue());
			
			if(s1 == null){
				s1 = new HashSet<String>();
				TokenTriee.put(e.getValue(), s1);
			}
			s1.add(e.getKey());
		}
		System.out.println(TokenTriee.descendingMap());
		System.out.println(TokenTriee.lastEntry());
		System.out.println(TokenTriee.descendingKeySet());
		System.out.println("symfony : " + map.get("symfony"));
		System.out.println("php : " + map.get("php"));
		System.out.println("application : " + map.get("application"));

	}

}
