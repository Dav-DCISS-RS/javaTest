package genericite;

import java.util.Objects;

public class Paire {

	Object premier;
	Object second;
	
	public Paire(Object a, Object b) {
		premier = a;
		second = b;
	}
	
	public Object getPremier(){
		return premier;
	}
	
	public Object getSecond(){
		return second;
	}

	public static void main(String[] args) {
		Paire p = new Paire("abc", "xyz");
		String x = (String)p.getPremier();
		Double y = (Double)p.getSecond();

	}

}
