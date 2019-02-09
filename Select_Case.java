package Basics_in_Java;

public class Select_Case {

	public static void main(String[] args) {
	 

		  String monat= "01";
		
		switch(monat) {
		
		case "01" :
			System.out.println("Januar");
			break ;
			
		case "02" :
			System.out.println("Februar");
			break ;
		case "03" :
			System.out.println("März");
			break ;
		
		default: System.out.println("kein Monat");
		}
		
	
	int zahl = 10 ;
	int erg = 0;
	int faktor =2 ;
	
	while(faktor > 0) {
		erg += zahl ;
		faktor -- ;	
	}
	System.out.println(erg);
	 int wartezeit = 2 ;
	 do {
		 System.out.println("Daten werden geladen...");
		 wartezeit -- ;
	 }while(wartezeit >0) ;
	 
	
	}

	
	
	
}
