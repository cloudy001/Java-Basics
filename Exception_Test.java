package Basics_in_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class Exception_Test {

	public static void main(String[] args) {

		String str = "12" ;
		try {
			int ganzzahl = Integer.parseInt(str) ;
			ganzzahl = ganzzahl * ganzzahl ;
			System.out.println("ganze Zahl ist: "+ ganzzahl);
			
		}catch(NumberFormatException nbr) {
			
			System.out.println("Ungültige Format " + nbr.toString());
		}

		// ganzes Array in einer Zeile ausgeben
		// 1- ArrayList deklariern
		//2- elemente hinfügen
		//3- beide ArrayListen zusammenfügen
		ArrayList<String> list= new ArrayList<String>() ;
		list.add("ooo") ;
		list.add("ööö");
		String [] ausgabe= {"aa", "bb","cc", "xxx" } ;
		// beide Listen zusammenfügen
		list.addAll(Arrays.asList(ausgabe));
		
		// übliche Ausgabe mit dem for Schleife ABER list der ArrayList als Parameter
		for(String value: list) {
			System.out.println(value);

		}
	
	}

}
