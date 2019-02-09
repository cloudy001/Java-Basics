package Basics_in_Java;

public class Rekrusive {
public static void main(String[] args) {
	loop(4) ;
}

private static void loop(int anzahlDurchlaeufe) {
 
	
	if (anzahlDurchlaeufe > 0) {
		System.out.println("noch" + anzahlDurchlaeufe + "Durchläufe");
	loop(anzahlDurchlaeufe - 1); // funktion ruft sich selbst auf
	
	}
	
}
}
