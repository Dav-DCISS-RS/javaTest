package collections;
import java.util.*;

public class CollectionToArray {

	public CollectionToArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("chose");
		c.add("chouette");
		c.add("truc");
		c.add("bidule");
		
		//syntaxe 1
		Object[] tab = c.toArray();
		System.out.println(Arrays.deepToString(tab));

		//syntaxe 2
		String[] tab2 = new String [10];
		c.toArray(tab2);
		System.out.println(Arrays.deepToString(tab2));
		
		//2bis
		String[]tab3 = new String[1];
		String[]tab4 = (String[]) c.toArray(tab3);
		System.out.println(Arrays.deepToString(tab3));
		System.out.println(tab4.getClass() + " - " + Arrays.deepToString(tab4));
		
		
	}

}
