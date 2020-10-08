/*27.-Elabore un algoritmo que solicite 2 números enteros y un operador aritmético y luego debe de mostrar 
 * l  resultado de la operación correspondiente "+" suma,  "-" resta, "*"multiplicación. " ° " Potencia.
*/
package Estudio;
import java.util.Scanner;
public class T027_2_Calculadora {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce una frace");
		String frase="hola mundo";//entrada.nextLine();
		
		int [] letras=consonantes(frase);
		for(int i=0;i<letras.length;i++) {
			System.out.print(letras[i]);
		}
		
	}

	private static int[] consonantes(String frase) {
		int[] arre=new int[2];
		int v=0;
		int c=0;
		arre[0]=v;
		arre[1]=c;
		for(int i=0;i<frase.length();i++) {
			if(frase.equalsIgnoreCase("a")) {
				v+=1;
			}else if (frase.equalsIgnoreCase("e")) {
				v+=1;
			}else if(frase.equalsIgnoreCase("i")) {
				v+=1;
			}else if (frase.equalsIgnoreCase("o")) {
				v+=1;
			}else if (frase.equalsIgnoreCase("u")) {
				v+=1;
			}else {
				c+=1;
			}
		}System.out.println(arre);
		return arre;
	}

}
