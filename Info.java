package Basics_in_Java;
/**
 * Alle Methoden eines Interface sind abstrakt, d.h. sie geben nur eine
Schnittstelle vor, haben aber keine Implementierung.
¤ Alle Methoden sind automatisch abstrakt und öffentlich (public).
¤ Konstanten sind zulässig (und automatisch public static final).
¤ Datenfelder (Attribute) sind nicht zulässig.
¤ Konstruktoren sind nicht zulässig.
 Eine Klasse implementiert das Interface.
o Die Klasse (oder eine ihrer Unterklassen) muss die Methoden des
Interface überschreiben und mit Code füllen.
o Ein Interface kann mehrere Implementierungen haben, d.h. verschiedene Klassen können dieselbe Schnittstelle implementieren.
o Eine Klasse kann mehrere Schnittstellen implementieren ® Mehrfachvererbung (i.S.v. Subtyping).
o Ein öffentliches Interface (public interface) stellt einen Vertrag zwischen einer Klasse und ihren Verwendern dar.
o Eine Klasse kann mehrere, verschiedene Verträge eingehen.
 */


public interface Info  {
 
	 
	// konstant
	public static final  String mwst=  "19 %" ;
	// methode
	public int laenge() ;
	
public void showInfo() ;

 abstract void start() ;
public void starten() ;
public default void methode() {
	System.out.println("Java 8 Methode");
}
}
