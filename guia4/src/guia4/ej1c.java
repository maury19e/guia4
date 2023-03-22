package guia4;

import java.util.Scanner;

public class ej1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		char letra;
		if(args.length>0) {
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		num3=Integer.parseInt(args[2]);
		letra=args[3].charAt(0); 
		}else {
		Scanner lectura = new Scanner (System.in); 			
		System.out.println("Ingrese numero: ");
		num1 = lectura.nextInt();
		System.out.println("Ingrese numero: ");
		num2 = lectura.nextInt();
		System.out.println("Ingrese numero: ");
		num3 = lectura.nextInt();
		System.out.println("ingrese un caracter: ");
		String l = lectura.next();
		letra=l.charAt(0);	
		}
			int opcion = ordenar(num1,num2,num3,letra);
			mostrar(opcion,num1,num2,num3);
		
	}
		private static int ordenar(int a,int b,int c, char op) { 
			 char anObject = 'a';
			if(op==anObject){
				 if(a<b && a<c &&b<c) {
					 return 1;
				}else if(a<b && a<c &&c<b) {
					return 2;
				}else if(a>b && a<c && b>c) {
					return 3;	
				}else if(a>b && a<c && b<c) {			
					return 4;		
				}else if(a>b && a>c && c>b) {
					return 5;
				}else{
					return 6;
				}	
				 
			 } else {
				char anObject2 = 'd';
				if(op==anObject2) {
					 if(a>b && a>c &&b>c) {
						 return 6;
					 }else if(a>b && a>c &&c>b) {
						 return 5;
						}else if(a<b && a>c && b>c) {
							return 3;
						}else if(a>b && a<c && b<c) {
							return 4;
						}else if(a<b && a<c && c<b) {
							return 2;
						}else{
							return 1;
						}	
					 }
			}
		return 0;
		
			}
		
		private static void mostrar(int op,int a,int b,int c) {
			switch(op) {
			case 1:
			    System.out.println(a+" "+b+" "+c);
			    break;
			case 2:
				System.out.println(a+" "+c+" "+b);
				break;
			case 3:
				System.out.println(c+" "+a+" "+b);
				break;
			case 4:
				System.out.println(b+" "+a+" "+c);
				break;
			case 5:
				System.out.println(b+" "+c+" "+a);
				break;
			case 6:
				System.out.println(c+" "+b+" "+a);
				break;
		}
			return ;
		

	}

	

	}


