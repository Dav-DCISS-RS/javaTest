package map;
import java.util.*;
import java.util.Map.Entry;

public class MapOpen {

	public MapOpen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "toto");
		map.put(2, "tata");
		map.put(3, "titi");
		map.put(4, "tutu");
		map.put(5, "tete");
		map.put(6, "tyty");
		
		Set<Integer> intmap = map.keySet();
		
		System.out.println("parcours d'une map avec keyset : ");
		Iterator<Integer> it = intmap.iterator();
		while (it.hasNext()){
			int key = it.next();
			System.out.println("valeur de la clé : "+ key +" = "+ map.get(key) );
			
		}
		System.out.println("--------------------------------------------------------------");
		
		
		Set<Entry<Integer, String>> setEntry = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> itEntry = setEntry.iterator();
		System.out.println("parcours d'une map avec setEntry : ");
		while (itEntry.hasNext()){
			Map.Entry<Integer, String> entry = itEntry.next();
			System.out.println("la valeur de la clé : "+ entry.getKey() + " = " + entry.getValue());
		}
		System.out.println("----------------------------------------------------------------");
			
	
	Collection <String> col = map.values();
	Iterator<String> itString = col.iterator();
	System.out.println("parcours de la liste des valeurs d'une map avec value : ");
	
	while(itString.hasNext()){
		String values = itString.next();
		System.out.println("valeur : "+values);
	}
	}

}
