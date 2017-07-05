package listes;

import java.util.*;

public class ListGenericite {

	public ListGenericite() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List <String> c = new ArrayList();
		c.add("truc");
		c.add("bidule");
		c.add("chouette");
		
		int sumlength=0;
		
		System.out.println(c.listIterator(1));
		Iterator <String> i = c.iterator();
		while (i.hasNext()){
			String s = i.next();
			sumlength +=s.length();
		}
		System.out.println(((double)sumlength)/c.size());
	}
}
