package map;
import java.util.*;
import java.text.*;


class Personne {
	private String nom, prenom, tel;
	private Calendar dateNaissance;
	
	public Personne (String nom, String prenom, String tel, Calendar dateNaissance){
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.dateNaissance = dateNaissance;
	}
	
	public String getTel(){
		return tel;
	}
	
	@Override
	public String toString(){
		return "Persone [ nom = " + nom + ", prenom = "+ prenom+ ", tel = "+tel +", dateNaissance = "
				+ SimpleDateFormat.getDateInstance().format(dateNaissance.getTime())+ "]";
	}
	
}

public class TestMap {

	public TestMap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Map<String, Personne> map = new HashMap<String, Personne>();
				
		Calendar date = Calendar.getInstance();
		date.set(1950, 11, 4);
		Personne Jacques = new Personne("Dupond", "Jacques", "0606060606", date);
		
		date = Calendar.getInstance();
		date.set(1980, 9, 30);
		Personne Paul = new Personne("Martin", "Racaillle", "0601010101", date);
		
		map.put(Jacques.getTel(), Jacques);
		map.put(Paul.getTel(), Paul);
		
		System.out.println(map.get("0601010101"));
		System.out.println("La map est-elle vide ? "+ map.isEmpty());
		System.out.println(map.containsKey("0601010101"));
		System.out.println(map.containsKey("jony"));
		System.out.println(map.containsValue(Paul));
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());

	}

}
