package guia4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ej2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char opp=args[0].charAt(0);
			String direc=args[1]; 
			String[] numeroS = null;
			Path ARCHIVO = Paths.get(direc);
			try {
				
				for (String linea: Files.readAllLines(ARCHIVO)) {
					numeroS=linea.split(" ");
				}
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			if(opp=='+') {
			suma(numeroS);
			}else if(opp=='*') {
				multiplicar(numeroS);
			}
			}
			private static void suma (String numeros[] ){
				int resultado=0;
				 for(int i=0;i<numeros.length;i++) {
						int numero = Integer.parseInt(numeros[i]);
						resultado = resultado + numero;
			            }
			        	System.out.println(resultado);
				 return;
			}


			private static void multiplicar (String numeros[] ){
				int resultado=1;
				 for(int i=0;i<numeros.length;i++) {
						int numero = Integer.parseInt(numeros[i]);
						resultado = resultado * numero;
			            }
			        	System.out.println(resultado);
				 return;
			}
}
