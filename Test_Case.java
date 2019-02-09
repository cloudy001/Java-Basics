package Basics_in_Java;

import java.util.Scanner;

public class Test_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Donnez le jour en Francais SVP: " );		
		String tag  = sc.nextLine() ;
		 
		switch(tag) {
		case "lundi" : System.out.println("Montag"); break ;
		case "Mardi" : System.out.println("Dienstag"); break ;
		case "Mercredi" : System.out.println("Mittwoch"); break ;
		case "Jeudi" : System.out.println("Donnerstag"); break ;
		case "vendrei" : System.out.println("Freitag"); break ;
		case "Samedi" : System.out.println("Samstag"); break ;
		case "Dimanche" : System.out.println("Sonntag"); break ;
		
		
		default : System.out.println("Donnez le jour en Francais SVP: " );	
		
		
		
		
		}
		


	}

}
