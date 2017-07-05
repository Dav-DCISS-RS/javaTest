package genericite;

public class Paires<T> {
	
	T premier;
	T second;
	
	public Paires(T a, T b) {
		premier = a;
		second = b;
		
	}
	
	public T getPremier(){
		return premier;
	}
	
	public T getSecond(){
		return second;
	}

	public static void main(String[] args) {
		Paires <String> p = new Paires <String> ("abc", "xyz");
		String x = p.getPremier();
		String y  = p.getSecond();
		
		System.out.println(x);
		System.out.println(y);

	}

}
