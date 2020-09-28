// 19.-Elaborar un algoritmo que contenga los números 
//pares del 1 al 10
package Estudio;
import java.util.Scanner;
public class T019_1_Pares {
	public static void main(String[] args) {
		StringBuffer impt = new StringBuffer();
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce el ciclo ");
		int ciclo=10;//entrada.nextInt();
		int [] pares = espar(ciclo);
		System.out.println(pares);
		
	}
	/**
	 * espar es un metodo que nos dira el los numeros pare que hay en un ciclo 
	 * @param ciclo es el ciclo que se repetira 
	 * @return retornara todos los numeros pares 
	 */
	private static int[] espar(int ciclo) {
		int arre[] = new int[ciclo+1];//arreglo donde se almacenara el numero que se pares
		for(int i=1;i<=ciclo;i++) {//el ciclo que se llevara a cavo donde tiene que cer igual al ciclo el recorrido 
			if(i%2==0) {//la condicion todo num dividico entre 2 el residuo es 0 sera par 
				arre[i]=i;//aqui se agrega en el arreglo el recorrido 
				System.out.println(arre[i]);
			}
		}
		return arre;
	}

}
