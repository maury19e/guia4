package guia4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ej3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab="abcdefghijklmnñopqrstuvwxyz";
		 char nom1[]= new char[80];
		 int des;
		 Scanner lectura = new Scanner (System.in);
			System.out.println("Ingrese una palabra: ");
			String entrada = lectura.next();
			System.out.println("Ingrese  codificar o decodificar: ");
			String opp = lectura.next();
			System.out.println("Ingrese un numero para desplasamiento");
			des = lectura.nextInt();
		 
		 if(opp.equals("codificar")) {
		 codificar(ab,nom1,entrada,des);}
		 else if(opp.equals("decodificar")) {
			 decodificar(ab,nom1,entrada,des);
		 	}
		
		 System.out.println("====================================================\n" );
		 System.out.println("se realizo la operacion");
	}
	private static void codificar (String abc,char nom2 [],String nomb,int despla) {
		int p=0;
		 for(int i=0;i<nomb.length();i++) {
			 for(int j=0;j<abc.length();j++) {
				 if(nomb.charAt(i)==abc.charAt(j)) {
					 nom2[p]=abc.charAt(j+despla);
					 p++;
				 }
			 }
			 
		 }
	
	   String nom3 = String.copyValueOf(nom2);
		 cargarSALIDA(nom3);
		 cargarENTRADA(nomb);
		}

	private static void decodificar(String abc,char nom2 [],String nomb,int despla) {
	int p=0;
		for(int i=0;i<nomb.length();i++) {
			 for(int j=0;j<abc.length();j++) {
				 if(nomb.charAt(i)==abc.charAt(j)) {
					 nom2[p]=abc.charAt(j-despla);
					 p++;
				 }
			 }
			 
		 }
		String nom3 = String.copyValueOf(nom2);
		 cargarSALIDA(nom3);
		 cargarENTRADA(nomb);
	
	}
	private static void cargarENTRADA(String nombre) {
		try {
			Path ARCHIVO = Paths.get("entrada.txt");
			Files.writeString(ARCHIVO,nombre);
			}catch(IOException e) {
				System.err.println(e);
			}
	}
	private static void cargarSALIDA(String nombre) {
		try {
			Path otroARCHIVO = Paths.get("salida.txt");
			Files.writeString(otroARCHIVO,nombre);
			}catch(IOException e) {
				System.err.println(e);
			}
		
	}
	}