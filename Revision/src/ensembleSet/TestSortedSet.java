package ensembleSet;
import java.util.*;

public class TestSortedSet {

	public TestSortedSet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SortedSet set = new TreeSet();
		
		set.add("a");
		set.add("t");
		set.add("g");
		set.add("m");
		set.add("z");
		set.add("p");
		
		Iterator it = set.iterator();
		
		while (it.hasNext()){
			Object ele = it.next();
			System.out.println(ele.toString());
		}
			System.out.println(set);
		
		System.out.println(set.tailSet("d"));
		System.out.println(set.headSet("r"));
		System.out.println(set.subSet("b", "q"));
	}

}
