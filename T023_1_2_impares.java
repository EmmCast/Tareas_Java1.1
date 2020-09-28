//23.-Elabora un algoritmo que muestre 10 números enteros a partir de 1 excepto los pares 
package Estudio;
import java.util.ArrayList;
import java.util.Scanner;
public class T023_1_2_impares {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el ciclo a evaluar");
		int ciclo=10;//entrada.nextInt();
		int[] impar=esimpar(ciclo);
		//System.out.println("Los numeros impares son \n" + impar);
	}
	/**
	 * esimpar es un metdo que detetectara todos los numeros impares de un ciclo
	 * @param ciclo ciclo que se determinara 
	 * @return // retornara los numeros no pares 
	 */
	private static int[] esimpar(int ciclo) {
		int arre[] = new int[ciclo+1];//arreglo donde se almacenara el numero que se pares
		for(int i=1;i<=ciclo;i++) {//el ciclo que se llevara a cavo donde tiene que cer igual al ciclo el recorrido 
			if(i%2>0) {//la condicion todo num dividico entre 2 el residuo es diferente de 0 sera impar 
				arre[i]=i;//aqui se agrega en el arreglo el recorrido 
				System.out.println(arre[i]);
			}
		}
		return arre;
	}

}
