package Basics_in_Java;

import java.io.File ;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_Try_Catch {
 public static void main(String[] args) {
	
 File datei = new File("File.txt") ;
 
 try {
	 

 Scanner sc = new Scanner(datei) ;
 // bei if wird nur die erste Zeile zurückgegeben, bei While (solange) wird alles in der Text datei ausgegeben
 
 while(sc.hasNextLine()) {
	 
	 System.out.println(sc.nextLine());
 					  }
 
		 sc.close();
	 
 }catch(FileNotFoundException e) {
	 System.out.println("Datei nicht gefunden " + e.toString());
 }
 
}// main
}// klasse
