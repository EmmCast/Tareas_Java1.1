/*12.- elabore un algoritmo para leer 3 números enteros diferentes entre si, y determinar el numero mayor de los 3.
 */
package Estudio;
import java.util.Scanner;
public class T012_1_mayorque {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();//objeto que ayuda a imprimir 
		Scanner entrada=new Scanner(System.in);//objeto para intoducir los datos
		System.out.println("Introduce num A ");//solicita dato 1
		int a=entrada.nextInt();//introduce dato 1
		System.out.println("Introduce num B");//solicita dato 2
		int b=entrada.nextInt();//introcude dato 2
		System.out.println("Introduce num C");//solicita dato 3
		int c=entrada.nextInt();//introduce dato 3
		
		String mayor=cuales(a,b,c);//metodo que ayudara a identificae que datoes mayor
		impt.append("El Numero mas grande es: ")
		.append(mayor);
		System.out.println(impt.toString());
	}
	/**
	 * cuales es un metodo para poder ver que numero es mayor en una comparacion de 3 datos 
	 * @param a dato 1
	 * @param b dato 2
	 * @param c dato 3
	 * @return regresara que dato es el mayor 
	 */
	private static String cuales(int a, int b, int c) {
		if (a>b && a>c) {//a quio hacemos una evaluacion de a y b y al mismo tiempo a y c, donde ambas tienen que cumplirse 
			return "A";
		}else if (b>a && b>c){//aqui la segunda evaluacion de b haca a y c, e igual tiene que cumplice 
			return "B";
		}else {//por default aqui c se cumplira ya que es la ultima condicion 
		    return "C";
		}
	}
}
