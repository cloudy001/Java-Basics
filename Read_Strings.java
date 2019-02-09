package Basics_in_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read_Strings {

	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
System.out.println("String: ");
String tr = br.readLine() ;

System.out.println(tr);

	}

}
