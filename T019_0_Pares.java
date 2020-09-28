// 19.-Elaborar un algoritmo que contenga los números 
//pares del 1 al 10
package Estudio;
import java.util.ArrayList;
import java.util.Scanner;
public class T019_0_Pares {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce el ciclo ");
		int ciclo=10;//entrada.nextInt();
		ArrayList<Integer> pares=estar(ciclo);
		impt.append("los numeros pares son: ")
		.append(pares);
		System.out.println(impt.toString());	
	}
	/**
	 * espar es un metodo que nos dira el los numeros pare que hay en un ciclo 
	 * @param ciclo es el ciclo que se repetira 
	 * @return retornara todos los numeros pares 
	 */
	private static ArrayList<Integer> estar(int ciclo) {
		ArrayList<Integer> arre=new ArrayList<Integer>();
		for(int i=1;i<ciclo;i++) {//el orden en el que se cumplira el ciclo
			if(i%2==0) {//hace la condicion que todo numero que su divicion entre su resuduo sea 0 es par 
				arre.add(i);// se agrega en un espacio nuevo el par 
			}
		}
		return arre;
	}
}
