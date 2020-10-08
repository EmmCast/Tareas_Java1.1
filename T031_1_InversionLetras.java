/*31.- Invertir el sentido de cualquier texto que se ingrese vía teclado. Ejemplo:
   - Texto original ejemplo: "jairo no sabe enseñar progra"
   - Resultado: "argorp rañesne ebas on oriaj
   */

package Estudio;
import java.util.Scanner;
public class T031_1_InversionLetras {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce una frase ");
		String frase=entrada.nextLine();
		String invierte=inversion(frase);
		System.out.println(invierte);
	}

	private static String inversion(String frase) {
		String frase2=" ";
		for(int i=frase.length()-1;i>=0;i--) {
		frase2+=frase.charAt(i);	
		}
		return frase2;
	}

}
