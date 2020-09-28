//24.-elabora un algoritmo que muestre los términos de la serie que sean menores a 1000 1,2,5,26…
package Estudio;
import java.util.Scanner;
public class T024_1_secuencia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce donde inicia el ciclo");
		int inicio=1;//entrada.nextInt();
		System.out.println("Introduce el limite del ciclo");
		int limite=1000;//entrada.nextInt();
		
		int secuencia []=muestra(inicio,limite);
		System.out.println(secuencia.toString());
	}
	/**
	 * 
	 * @param inicio
	 * @param limite
	 * @return
	 */
	private static int[] muestra(int inicio, int limite) {
		int arre []=new int [limite];
		for (int i=1;i<limite;i++) {
			arre[i]=inicio;
			if(arre[i]<limite){
				inicio=inicio*inicio+1;
				System.out.println(arre[i]);
			}
		}
		return arre;
	}

}
