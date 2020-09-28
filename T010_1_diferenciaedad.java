/*10.- Elaborar un algoritmo que solicite la edad de 2 hermano y muestree un 
 * mensaje indicando la edad del mayor y cuantos años es la diferencia con el menos 
 */
package Estudio;
import java.util.Scanner;
public class T010_1_diferenciaedad {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Edad del hermano 1: ");
		int E1=entrada.nextInt();
		System.out.println("Edad del hermano 2: ");
		int E2=entrada.nextInt();
		
		boolean mayor=diferencia(E1,E2);//metodo para ver que hermano es mayor 
		if(mayor==true) {
			System.out.println("El hermano 1 es mayor:");
		}else {
			System.out.println("El hermano 2 es mayor ");
		}
	}
	/**
	 * diferncia es un metodo basico en que se compararan las edaddes use vera que hermano es mayor 
	 * @param e1 la edad del hermano 1 
	 * @param e2 la edad del hermano 2
	 * @return si hermano 1 es mayor dira que es cierto de caso contrario hermano 2 sera mayor 
	 */
	private static boolean diferencia(int e1, int e2) {
		if(e1<e2) {
			return true; 
		}else {
		return false;
		}
	}
}
