/*8.- Elaborar un algoritmo que permita ingresar 10  letras cualquiera,y luego nos indique al final cuantas 
 * vocales y consonantes se ingresaron.
*/
package Estudio;
import java.util.Scanner;
public class T028__1_consonatevocal {
	public static void main(String arg[]) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la frace");
		String frase="PAPA";//entrada.nextLine();
		
		int[] contador=longitud(frase);
		/*for(int i=0;i<frase.length();i++) {
			System.out.println(contador[i]);
		}*/
	}
	
	private static int[] longitud(String frase) {
		int []arre=new int[2];
		int v=0;
		int c=0;
		arre[0]=v;
		arre[1]=c;
		for(int i=0;i<frase.length();i++) {
			if((frase.charAt(i)=='A')||(frase.charAt(i)=='a')||(frase.charAt(i)=='E')||(frase.charAt(i)=='e')||
			   (frase.charAt(i)=='I')||(frase.charAt(i)=='i')||(frase.charAt(i)=='O')||(frase.charAt(i)=='O')||
			   (frase.charAt(i)=='U')||(frase.charAt(i)=='u')) {
				v+=1;
			}
			c=frase.length()-v-1;	
		
			
		}
		System.out.println("\n" +v+" V" + "\n"+ c+" c");
		
		return null;
	}
}
