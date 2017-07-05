package collections;
import java.util.*;

public class CollectionsGenericite {

	public CollectionsGenericite() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Collection <String> c = new ArrayList();
		c.add("truc");
		c.add("bidule");
		c.add("chouette");
		
		int sumlength=0;
		
		Iterator <String> i = c.iterator();
		while (i.hasNext()){
			String s = i.next();
			sumlength +=s.length();
		}
		System.out.println(((double)sumlength)/c.size());
		System.out.println(c);
	}

}
