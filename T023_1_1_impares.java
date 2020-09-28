//
package Estudio;
import java.util.Scanner;
public class T023_1_1_impares {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el ciclo a evaluar");
		int ciclo=10;//entrada.nextInt();
		StringBuffer impar=esimpar(ciclo);
		System.out.println(impar);
	}
	/**
	 * 
	 * @param ciclo
	 * @return
	 */
	private static StringBuffer esimpar(int ciclo) {
		StringBuffer impt = new StringBuffer();
		int arre[] = new int[ciclo+1];
		for(int i=1;i<=ciclo;i++) {
			if(i%2>0) {
				arre[i]=i;
				impt.append(arre[i] +"\n");
			}
		}
		return impt;
	}

}
