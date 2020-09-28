/*2.-Se desea obtener el promedio simple de un estudiante a partir de sus 3 notas parciales
*/
package Estudio;
import java.util.Scanner;
public class T002_1_Promedio {
	private static Scanner entrada;//al momento que use entrada en el metodo eclipse me indico que podia hacer estatico el metodo para poder usarlo en otro metdo sin crear un objeto nuevo 
	public static void main (String arg[]) {
		entrada = new Scanner(System.in);//el objeto entrada nos ayudara a leer el teclado 
		System.out.println("Cuantos parciales se elaluaran");// numero de elemenntos que habra y a su vez el divisor de la suma total de los promedios 
		int parciales=entrada.nextInt();// metodo que nos dara el promedio 
		double  promedio=calif(parciales);
		System.out.println("El promedio total es de "+promedio);
		
	}
	/**
	 * Metodo en calif que nos ayudara a determina la calificacion de un estudiante por # de parciales 
	 * @param parciales  es el numero de parciales que se evaluaran y al mismo tiempo la suma de todos se dividira en este mismo 
	 * @return  retornara la calificacion final 
	 */
	private static double calif(int parciales) {
		double todos= 0.0; //variable donde se sumaran todos los promedios que se ingresen 
		double res=0.0;//resultado donde se vera reflejo el promedio total 
		for (int i=0;i<parciales;i++) {// se usa un ciclo for para que se haga la pregunta y se ingrese el promedio de dicho parcial 
			System.out.println("ingresa la calificacion del pacrcia "+ (i+1));//la pregunta que solicita el promedio de dicho parcial 
			todos+=entrada.nextDouble();// se y usa un incremento en la variable todos para que se guarde en ese mismo y se sume al mismo tiempo los demas parciales 
			res=todos/parciales;//se divide la suma total de los promedios entre el numero de los parciales 
		}
		return res;
	}

}
