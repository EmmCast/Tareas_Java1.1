/*30.- Ingresar 10 números a un arreglo. Posteriormente invertir su orden. Ejemplo:
     - Arreglo original: {1,2,3,4,5,6,7,8,9}
     - Arreglo resultante: {9,8,7,6,5,4,3,2,1}
*/     
package Estudio;
import java.util.Scanner;
public class T030_1_inversionnumeros {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce el numero del arreglo ");
		int tamaño=entrada.nextInt();
		int [] arreglo=new int[tamaño];
		for(int i=0;i<tamaño;i++) {
			System.out.println("introduce el numero " +(i+1));
			arreglo[i]=entrada.nextInt();
		}
		int[] inversion=ordena(arreglo);
		for(int i=0;i<inversion.length;i++) {
			System.out.println(inversion[i]);
		}
	}
	/**
	 * ordena es un metodo que capturara un arreglo e invertira el lugar de dicho arreglo 
	 * @param arreglo el arreglo original 
	 * @return arreglo invertido 
	 */
	private static int[] ordena(int[] arreglo) {
		int arre[]=new int[arreglo.length];//nombre del nuevo arreglo donde se almacenara 
		for(int i=0;i<arreglo.length;i++) {//se hace un ciclo donde se recorrera todo el arreglo 
			int var= arreglo[arreglo.length-1-i];//se inicializa una variable donde se indica que arreglo tiene como parametros el tamaño del arreglo e ir disminuyendo 1 en contador 
			arre[i]=var;
		}
		return arre;
	}

}
