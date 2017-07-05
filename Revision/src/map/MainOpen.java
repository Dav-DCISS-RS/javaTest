package map;
import java.util.*;
import java.util.Map.Entry;

public class MainOpen {

	public MainOpen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Map <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "1");
		hm.put(20, "2");
		hm.put(30, "3");
	    hm.put(40, "4");
	    hm.put(50, "5");

	      //Ceci va écraser la valeur 5

	    hm.put(50, "6");
	    
	    System.out.println("parcours de l'objet HashMap : ");
	    Set<Entry<Integer, String>> sethm = hm.entrySet();
	    Iterator<Entry<Integer, String>> it = sethm.iterator();
	    while (it.hasNext()){
	    	Entry<Integer, String> e = it.next();
	    	System.out.println(e.getKey() +" : "+ e.getValue());
	    }

	    System.out.println("valeur pour la clé 20 : "+ hm.get(20));
	

	Map <Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(10, "1");
		lhm.put(20, "2");
		lhm.put(30, "9");
		lhm.put(40, "4");
		lhm.put(50, "5");
		   
		System.out.println("Parcours de l'objet LinkedHashMap : ");      
		
		Set<Entry<Integer, String>> setLhm = lhm.entrySet();
		
		Iterator<Entry<Integer, String>> it2 = setLhm.iterator();
		
		while(it2.hasNext()){
		         Entry<Integer, String> e = it2.next();
		         System.out.println(e.getKey() + " : " + e.getValue());
		      }

}
}
