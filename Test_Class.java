package Basics_in_Java;

public class Test_Class {

	public int summe(int a, int b) {
		
		return ( a + b);
	}
	
	// static methode muss ein return haben (Rpückgabetyp), void aber nicht
	public String call() {
		return null;
		
		
	}
	
	public static void main(String[] args) {
		Test_Class test = new Test_Class() ;
		
		
String text = "Said Belbasri" ;
for(int i=text.length() -1 ; i >= 0 ; i--) {
	char harf = text.charAt(i) ;
	
	System.out.println(harf);
}

	}

}
