package map;
import java.util.*;

public class TestHashMapIterator {

	public TestHashMapIterator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "un");
		map.put("2", "deux");
		map.put("3", "trois");
		map.put("4", "quatre");
		map.put("5", "cinq");
		
		for (String s : map.keySet()){
			System.out.println("s = " + s);
		}
		for (Map.Entry<String, String> bim : map.entrySet()){
			System.out.println(bim);
		}
		
		//for (Collection<String> bam : map.values()){
		//	System.out.println(bam);
		//}
	}
}
