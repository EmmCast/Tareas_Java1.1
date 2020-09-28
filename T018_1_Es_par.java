//18.- elabore un algoritmo que solicite un numero entero y  diferente a cero e indicar si es par
package Estudio;
import java.util.Scanner;
public class T018_1_Es_par {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce un numero");
		int num=entrada.nextInt();
		boolean par=espar(num);
		if(par==true) {
			System.out.println("El numero "+ num + " Es par");
		}else {
			System.out.println("El numero "+ num + " es inpar");
		}
	}
	/**
	 * un metodo que devorvera un true o false si es correcta la evaluacion 
	 * para saver si un numero es par o no es par
	 * @param num el numeroa evaluar 
	 * @return verdadero o falso 
	 */
	private static boolean espar(int num) {
		if(num%2==0) {//La divicion de todo numero par entre 2 dara 0 en residuo 
			return true;
		}else {
			return false;
		}
	}

}
