//25.-Elabora un algoritmo que solicite ingresar letras hasta que este ingrese una vocal 
package Estudio;
import java.util.Scanner;
public class T025_1_Esvocal {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce una frace");
		String frase=entrada.nextLine();
		String vocal=quees(frase);
		System.out.println("Se encontro la vocal: "+ vocal);
	}
	/**
	 * 
	 * @param frase
	 * @return
	 */
	private static String quees(String frase) {
		String letra=" ";
		for (int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==('a') ) {
				return "a";
			}else if(frase.charAt(i)==('A')) {
				return "A";
			}else if(frase.charAt(i)==('e')) {
				return "e";
			}else if(frase.charAt(i)==('E')) {
				return "E";
			}else if(frase.charAt(i)==('i')) {
				return "i";
			}else if(frase.charAt(i)==('I')) {
				return "I";
			}else if(frase.charAt(i)==('o')) {
				return "o";
			}else if(frase.charAt(i)==('O')) {
				return "O";
			}else if(frase.charAt(i)==('u')) {
				return "u";
			}else if(frase.charAt(i)==('U')) {
				return "U";
			} 
		}	
		return "letra";
	}

}
