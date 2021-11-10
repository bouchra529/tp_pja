package dev_TP2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

import exemple.Employe;

public class Class2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String name , address ;
	    int SSN , number;
	    name = sc.next().toLowerCase();		    
	    address = sc.next().toLowerCase();	
	    SSN = sc.nextInt();	
	    number = sc.nextInt();	
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("emp.dat");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	         Employe  e =(Employe)in.readObject();
	         Employe  e2 =(Employe)in.readObject();
	         Employe  e3 =(Employe)in.readObject();
	         Employe  e4 =(Employe)in.readObject();
	         
	         in.close();
	         fileIn.close();


			System.out.println(e);
			System.out.println(e2);
			System.out.println(e3);
			System.out.println(e4);
			
			File fichier = new File("empdirect.dat") ;
			RandomAccessFile raf = new RandomAccessFile(fichier,"rw");
			long FileSize = raf.length();
			raf.seek(FileSize);
			raf.writeUTF(name);
			for(int i=0;i<20-name.length();i++) {
				raf.writeByte(20);
			}
			
			raf.writeUTF(address);
			for(int i=0;i<20-address.length();i++) {
				raf.writeByte(20);
			}
			raf.writeInt(SSN);
			raf.writeInt(number);
			raf.close();
				
	      } catch(FileNotFoundException i) {
				i.printStackTrace();
			} catch (IOException i) {

				 i.printStackTrace();
		         return;

			} catch (ClassNotFoundException c) {
				 
		         System.out.println("classe Employée non trouvée");
		         c.printStackTrace();
		         return;
			}
	      

	}

}
