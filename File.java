package Basics_in_Java;
/*
 *Abstrakte Methoden:
¤ bestehen ausschließlich aus der Deklaration (= Schnittstelle),
¤ enthalten keine Implementierung, d.h. der (Methoden-) Rumpf ist leer ¤ können nur public oder protected sein,
¤ sind mit dem Attribut abstract versehen,
¤ können nicht direkt aufgerufen werden (→ dynamische Bindung).
o Abstrakte Klassen:
¤ Klassen, die eine abstrakte Methode enthalten,
¤ müssen selbst als abstrakt deklariert werden (abstract),
¤ sind als Objekttyp zulässig, aber es können keine Objekte der abstrakten Klasse erzeugt werden. 
 * 
 * 
 */
 
public abstract class File {
	public static final String mwst = "19 %";
	protected int nummer;
	private int id;

	public File() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void start();

	public abstract void stop();

	public void stoppen() {
	}

}
