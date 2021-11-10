package dev_TP2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import exemple.Employe;

public class Class3 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s=new Scanner(System.in); 
	    boolean containsInt=false; 
	    System.out.println("Enter un numero pour chercher :"); 
	    String searchNum=s.next(); 
	    Scanner readFile =new Scanner(new File("empdirect.dat"));
	    readFile.useDelimiter("\\s+"); 
	    while(readFile.hasNext()) 
	     if(searchNum.equals(readFile.next())) 
	     { 
	      containsInt=true; 
	      break; 
	     } 
	    if(containsInt) 
	    	System.out.println("la personne est trouvée"); 
	    else 
	     System.out.println("la personne n'existe pas"); 

	}

}
