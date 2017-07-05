package collections;

import java.util.*;

public class TestCollection {

	public TestCollection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("kalash");
		c.add(new Date());
		c.add(new Integer(3));
		c.add(4);
		c.add(new Double(3.4));
		c.add(9.6);
		
		System.out.println("Ma collection contient: ");
		for(Object o : c){
			System.out.println("Un objet de type"+ o.getClass() +" : " + o);
			
		}
		System.out.println("la collection c est composée de : "+c);
			System.out.println("");
			System.out.println("2ème méthode");
			System.out.println("Ma collection contient : ");
			Iterator i = c.iterator();
			while (i.hasNext()){
				Object o = i.next();
				System.out.println("Un objet de type"+ o.getClass() +" : " + o);
			}
	}

}
