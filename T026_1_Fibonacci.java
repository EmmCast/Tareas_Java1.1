//26.-Elaborar un algoritmo que muestre los términos de la serie Fibonacci que sean menores a 100000.
//0,1,1,2,3,5,8,13,21,34…..

package Estudio;
import java.util.Scanner;
public class T026_1_Fibonacci {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el limite ");
		int limite=1000;//entrada.nextInt();
		int [] fibonacci=serie(limite);
		for(int i=0;i<fibonacci.length;i++) {
			System.out.println(fibonacci[i]);
		}		
	}
	/**
	 * serie es un metodo que hace el incremento de la serie fibonacci
	 * @param limite es el limite que dara como 
	 * @return retornara un arreglo con la serie
	 */
	private static int[] serie(int limite) {
		int a=0;
		int b=1;
		int c=0;
		int serie[]=new int [limite];

		for(int i=0;i<limite;i++) {
			serie[i]=c;
			if(serie[i]<limite) {
				a=b;
				b=c;
				c=a+b;
			}
		}
		return serie;
	}
}
