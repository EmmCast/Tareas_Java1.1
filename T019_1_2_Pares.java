// 19.-Elaborar un algoritmo que contenga los números 
//pares del 1 al 10
package Estudio;
import java.util.Scanner;
public class T019_1_2_Pares {
	public static void main(String[] args) {
		StringBuffer impt = new StringBuffer();
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce el ciclo ");
		int ciclo=10;//entrada.nextInt();
		StringBuffer pares = espar(ciclo);
		System.out.println(pares);
		
	}
	private static StringBuffer espar(int ciclo) {
		StringBuffer impt = new StringBuffer();
		int arre[] = new int[ciclo+1];
		for(int i=1;i<=ciclo;i++) {
			if(i%2==0) {
				//arre[i]=arre[i];
				arre[i]=i;
				impt.append(arre[i] +"\n");
			}
		}
		return impt;
	}

}