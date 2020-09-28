//23.-Elabora un algoritmo que muestre 10 números enteros a partir de 1 excepto los pares 
package Estudio;
import java.util.ArrayList;
import java.util.Scanner;
public class T023_1_inpares {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el ciclo a evaluar");
		int ciclo=entrada.nextInt();
		ArrayList<Integer> impar=esimpar(ciclo);
		System.out.println("Los numeros impares son \n" + impar);
	}
	/**
	 * esimpar es un metdo que detetectara todos los numeros impares de un ciclo
	 * @param ciclo ciclo que se determinara 
	 * @return // retornara los numeros no pares 
	 */
	private static ArrayList<Integer> esimpar(int ciclo) {
		ArrayList arre=new ArrayList();
		for(int i=0;i<ciclo;i++) {
			if(i%2>0) {
				arre.add(i);
			}
		}
		return arre;
	}

}
