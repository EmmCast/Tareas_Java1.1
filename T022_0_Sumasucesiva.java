//22.-Elabora un algoritmo que solicite 2 números enteros y muestre su producto por método de suma sucesivas
package Estudio;
import java.util.Scanner;
public class T022_0_Sumasucesiva {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("ingresa el numero que deseas incrementar ");
		int num=entrada.nextInt();
		System.out.println("ingresa las veces que se hara el incremento ");
		int ciclo=entrada.nextInt();
		
		int sucecion=sucecion(num,ciclo);
		System.out.println("la suma de la sucecion es \n"+sucecion);
		
	}
	/**
	 * 
	 * @param num
	 * @param ciclo
	 * @return
	 */
	private static int sucecion(int num, int ciclo) {
		int res=0;
		for(int i=0;i<ciclo;i++) {
			res+=+num;
		}
		return res;
	}

}
