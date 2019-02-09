package Basics_in_Java;

public class Mathe_API {

	int a;
	int b;

	public static int maximum(int a, int b) {

		if (a > b) {
			return a;

		} else {
			return b;

		}

	}

	public static void main(String[] args) {

		System.out.println("Max ist " + maximum(2, 4));
		
		// im Allgemein DATENTYP.toString um zu einer Zeichenkette zu konvertieren (Integer.toString(MyVariable))
		// und mit Parse wenn String -> Integer, Double,Float..usw Double.ParseDouble(myVariable)
		
	// String -> Intger  Convert
	
	String myString = "9";
	float foo = Float.parseFloat(myString);
	
	System.out.println(foo) ;
	
	// intger -> String
	
	int a = 123;
	String b= Integer.toString(a);
	System.out.println(b);
	
	// Double -> to String
	double c= 2344.5;
	String d = Double.toString(c) ;
	System.out.println(c);
	
}
}