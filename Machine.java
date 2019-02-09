package Basics_in_Java;

/*
 * -- private nur innerhalb der Klasse sichtbar
 * -- Protected innerhalb der Klasse und unterklassen und Package Sichtbar
 * -- public überall sichtbar
 * -- wenn kein Modifier dann nur innerhalb der selben Package
 * 
 * */

public class Machine extends Person{
@SuppressWarnings("unused")
private int id;

private String name;



public Machine(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

// Objekte vergleichen mit equals und HashCode

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Machine other = (Machine) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}



public static void main(String[] args) {
	Machine machine1 = new Machine(1, "machine1") ;
	Machine machine2 = new Machine(1, "machine1") ;
	
	System.out.println(machine1.equals(machine2));
	
	Person person2 = new Person() ;
	person2.setAlter(22);
	person2.setVorname("Derick");
	person2.sex ="Male" ;
	
	person2.speak();
	
	Info info = new Person() ;
	info.showInfo();
	//--------------------------
	String i ="123" ;
	//String s  = String.valueOf(i) ;
int x = Integer.parseInt(i) ;
	System.out.println(x);
	//--------------------
	int i1 = 123456;
	String str = String.valueOf(i1) ;
	System.out.println(str);
	
}
}
