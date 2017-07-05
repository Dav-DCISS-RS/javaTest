package collections;
import java.util.*;

public class EntreCollections {

	public EntreCollections() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		Collection c3 = new ArrayList();
		
		c1.add("truc");
		c1.add("bim");
		
		c2.add("truc");
		
		c3.add("bim");
		
		System.out.println("c1 contient c2 : " + c1.containsAll(c2));
		System.out.println("c2 contient c1 ? : " + c2.containsAll(c1));

		c2.addAll(c1);
		System.out.println(c2);
		
		c2.removeAll(c1);
		System.out.println(c2);
		
		// je ne retiens dans c1 que les éléments qui sont aussi dans c3
		c1.retainAll(c3);
		System.out.println(c1);
	}

}
