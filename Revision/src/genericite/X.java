package genericite;

public class X {
	
	public <T> void affiche(Paires<T> p){
		System.out.println(p);
	}
	
	public <T> T choix (T a, T b){
		return (int)(Math.random()*2)==1 ? a : b;
	}

	public X() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Paires<String> ps = new Paires<String>("un", "deux");
		Paires<Integer> pi = new Paires<Integer>(1, 2);
		
		X x = new X();
		x.affiche(ps);
		x.affiche(pi);
		Number n = x.choix(new Integer(2), new Double("3.14"));
		
		System.out.println(n);
		

	}

}
