package dev_TP2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import exemple.Employe;

public class Class1 {

	public static void main(String[] args) {
		String name;
		String address;
		int SSN;
		int number;
		
		Employe e = new Employe();
	      e.name = "Reyan Ali";
	      e.address = "Phokka Kuan, Ambehta Peer";
	      e.SSN = 11122333;
	      e.number = 101; 
	      
	      Employe e2 = new Employe();
	      e2.name = "dib aya ";
	      e2.address = "el khroub , constantine";
	      e2.SSN = 11122310;
	      e2.number = 204;
	      
	      Employe e3 = new Employe();
	      e3.name = "boudraa bouchra";
	      e3.address = "chelghoum laid , mila";
	      e3.SSN = 11122322;
	      e3.number = 105;
	      
	      Employe e4 = new Employe();
	      e4.name = "boudraa amira";
	      e4.address = "el eulma , sétif";
	      e4.SSN = 11140322;
	      e4.number = 165;
	      
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("emp.dat");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e2);
	         out.close();
	         fileOut.close();
	         Scanner sc = new Scanner(System.in);
	         System.out.println("Veuillez indiquer le nombre d'objet à sérialiser :");
	         int str = sc.nextInt();
	         
	         Scanner sc1 = new Scanner(System.in);
	         System.out.println("nom :");
	         String str1 = sc1.nextLine();
	         
	         Scanner sc2 = new Scanner(System.in);
	         System.out.println("adress :");
	         String str2 = sc2.nextLine();
	         
	         Scanner sc3 = new Scanner(System.in);
	         System.out.println("number :");
	         int str3 = sc3.nextInt();
	         
	         Scanner sc4 = new Scanner(System.in);
	         System.out.println("SSN :");
	         int str4 = sc4.nextInt();
	         
	      
	         System.out.printf("données serialisées sauvegardées dans emp.dat");

	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }



	}

}
