package listes;
import java.util.*;

public class TriCollection {

	public TriCollection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();
		
		list.add(-0.25d);
		list.add(12.52d);
		list.add(12.52d);
		list.add(56.25d);
		list.add(-45.12d);
		list.add(-100.11d);
		list.add(0.005d);
		
		System.out.println("avant le tri :");
		for( Double l : list){
			System.out.println(l);
		}
		
		System.out.println("-----------------------------------");
		System.out.println("après le tri :");

		Collections.sort(list);
		Iterator<Double> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
