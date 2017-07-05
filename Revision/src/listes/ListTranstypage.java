package listes;

import java.util.*;

public class ListTranstypage {

	public ListTranstypage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List c = new ArrayList();
		c.add("truc");
		c.add("bidule");
		c.add("chouette");
		
		int sumlength=0;
		
		Iterator i = c.iterator();
		while (i.hasNext()){
			String s = (String) i.next();
			sumlength +=s.length();
		}
		System.out.println(((double)sumlength)/c.size());
	}
}
