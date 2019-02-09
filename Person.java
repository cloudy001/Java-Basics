package Basics_in_Java;

import java.time.LocalDateTime;

public class Person implements Info{
private int id ;
private  String name;
private String vorname;
private  int alter;
protected String sex ;

public Person() {
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

int getAlter() {
	return alter;
}

 
public void setAlter(int alter) {
//	alter = newAlter;
	this.alter = alter;
}

void speak() {
	System.out.println("Hallo ich bin: " + vorname + " und ich bin " + alter + "und " 
+ sex + " als Orientierung");
}

@Override
public String toString() {
	return "Person  hat als vorname: " + vorname  ;
}

public void move(double hoehe, String richtung) {
	
	System.out.println("Die Höhe beträgt: " + hoehe + " Richtung " + richtung);
}
@Override
public void showInfo() {
System.out.println("Today is: " + LocalDateTime.now());
	
}
public static void main(String[] args) {
	
 
	Person person1 = new Person() ;
 
	person1.vorname="Said" ;
	person1.name= "Belbasri" ;
	person1.alter= 34;
	person1.setAlter(22);
	//person1.setAlter(33);
	person1.speak();
	System.out.println(person1.vorname + " " + person1.name);
	int x= person1.getAlter() ;
	System.out.println("Mein alter ist: " +x);
	
	person1.move(123.78, "Süd");

	
	System.out.println(person1.toString()) ;

	person1.showInfo();
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getVorname() {
	return vorname;
}

public void setVorname(String vorname) {
	this.vorname = vorname;
}

@Override
public void start() {
	// TODO Auto-generated method stub
	
}

@Override
public void starten() {
	// TODO Auto-generated method stub
	
}

@Override
public int laenge() {
	// TODO Auto-generated method stub
	return 0;
}


	
}
