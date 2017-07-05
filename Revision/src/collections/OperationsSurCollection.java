package collections;
import java.util.*;

public class OperationsSurCollection {

	public OperationsSurCollection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("une chaine");
		c1.add((5));
		c1.add(new Date());
		
		System.out.println("contenu de c1 : " + c1);
		System.out.println("c1 est-elle vide ? " + c1.isEmpty());
		System.out.println("taille de c1 : " + c1.size());
		System.out.println("c1 contient 5 ? " + c1.contains(5));
		System.out.println("c1 contient-elle le double 5.0 ? " + c1.contains(5.0));
		
		c1.remove(5);
		System.out.println("Après avoir enlevé 5 : " + c1);
		c1.clear();
		System.out.println("après avoir tout enlevé : " + c1);

	}

}
