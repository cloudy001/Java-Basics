package Basics_in_Java;

public class Spielen {

	public static void main(String[] args) {
	
		// Array deklarieren , grösse 5
	int [] spieler = new int[7] ;

	// mit spieler.length wird die Grösse automatisch angepasst
	for( int counter=0 ; counter < spieler.length; counter ++) {
	
		spieler[counter] = counter +1 ; ;
		
	}

	for(int eintrag: spieler) {
			System.out.println("Spiele nummer " + eintrag + " ist am Ball");
		
	}
	

		
/* spieler[0]= 1 ;
 * spieler[1]= 2 ;
 * spieler[2]= 3 ;
 * spieler[3]= 4 ;
 * spieler[04]= 5;
 * 
 * 
 */

}
}
