package listes;
import java.util.*;

public class ListOpen {

	public ListOpen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		
		int nbTourBoucle1 = 0;
		int nbTourBoucle2 = 0;
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			nbTourBoucle1 ++;
			String str = it.next();
			
			if (str.equals("4")){
				it.remove();
			}
		}
		it = list.iterator();
		
		while(it.hasNext()){
			nbTourBoucle2 ++;
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
			
		}

		System.out.println("nombre de tour de la boucle 1 :" + nbTourBoucle1 );
		System.out.println("nombre de tour de la boucle 2 :" + nbTourBoucle2 );
	}
}