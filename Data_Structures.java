package Basics_in_Java;

import java.util.Scanner;

public class Data_Structures {

	public static void main(String[] args) {
		// Scanner ist klasse, man erzeugt ein objekt eines variables 
	Scanner sc = new Scanner(System.in) ;
	

		System.out.println("gib eine zahl ein: " );
		
		// scan the next token as an int
		int variable = sc.nextInt() ;
		
	if(variable < 10) {
		System.out.println("Zahl kleiner als 10");
	}else 
	{
		System.out.println("Zahl ist grosser als 10");
	}
	

	double[] array  = {12.5, 0.1, 4, 5.6, 900};
	//	System.out.println(array[1] );

	for(int i =0 ; i< array.length ; i++) {
		System.out.printf("%.2f",array[i]);
	}
	}

}
