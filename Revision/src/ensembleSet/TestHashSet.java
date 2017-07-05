package ensembleSet;
import java.util.*;

class Etudiant implements Comparable<Etudiant>{

	private String ine;
	private String nom;
	private String prenom;
	
	public Etudiant (String ine, String nom, String prenom) {
		this.ine = ine;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public boolean equals(Object o){
		if (o instanceof Etudiant){
			Etudiant e = (Etudiant) o;
			return this==e || ine.equals(e.ine);
		}
		return false;
	}
	
	public String toString(){
		return "Etudiant n°"+ine+" :("+nom +","+ prenom+")";
		
	}
	
	public int hashCode(){
		return ine.hashCode();
	}

	@Override
	public int compareTo(Etudiant o) {
		int comp = ine.compareTo(o.ine);
			if (comp==0){
				comp = nom.compareTo(o.nom);
					if (comp==0){
						comp = prenom.compareTo(o.prenom);
					}
			}
		return comp;
	}
}

public class TestHashSet {

	public static void main(String[] args) {
	
		Etudiant e1 = new Etudiant ("12345", "Basile", "Durand");
		Etudiant e2 = new Etudiant ("83625", "mat", "houston");
		Etudiant e3 = new Etudiant ("12346", "jo", "di");
		Etudiant e4 = new Etudiant ("12346", "mar", "credi");
		Etudiant e5 = new Etudiant ("19146", "vend", "dre");
		Etudiant e6 = new Etudiant ("93641", "sam", "edi");
		Etudiant e7 = new Etudiant ("95603", "dim", "anche");
		Etudiant e8 = new Etudiant ("24189", "fote", "bam");
		Etudiant e9 = new Etudiant ("32975", "vinc", "mac");
		Etudiant e10 = new Etudiant ("29013", "rac", "aille");
		Etudiant e11 = new Etudiant ("82680", "kal", "ache");
		Etudiant e12 = new Etudiant ("12345", "Basile", "Durand");
		
		SortedSet <Etudiant> m2 = new TreeSet<Etudiant>();
		m2.add(e1);
		m2.add(e2);
		m2.add(e3);
		m2.add(e4);
		m2.add(e5);
		m2.add(e6);
		m2.add(e7);
		m2.add(e8);
		m2.add(e9);
		m2.add(e10);
		m2.add(e11);
		m2.add(e12);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
		System.out.println(e2.toString());
		System.out.println(e1.toString());
		System.out.println(e1.compareTo(e4));
		System.out.println(e4.compareTo(e2));
		System.out.println(e3.hashCode());
	
		
		for (Object c : m2){
			System.out.println(c);
		}
	}
}
