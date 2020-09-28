/*8.-Se tiene los puntos A y B en el cuadrante positivo del plano cartesiano elaborar un algoritmo que permita obtener la distancia entre A y B
 */
package Estudio;
import java.util.Scanner;
public class T008_1_planoCartesiano {
	public static void main (String arg[]) {
		StringBuffer impt=new StringBuffer();
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce X1:");
		int X1=entrada.nextInt();
		System.out.println("Introduce Y1:");
		int Y1=entrada.nextInt();
		System.out.println("Introduce X2:");
		int X2=entrada.nextInt();
		System.out.println("Introduce XY:");
		int Y2=entrada.nextInt();
		
		double distancia=Puntos(X1,Y1,X2,Y2);// metodo para medir la distancia entre 2 pintops del plano carteseano 
		impt.append("\nla distancia es2  ")
		.append(distancia);
		System.out.println(impt.toString());
	}
	/**
	 * Puntos es el metodo que nos permitira medir la distancia entre dos puntos dentro del mismo plano cartesiano 
	 * usando la siguiente formula D=raz(X2-X1)2+(Y2-Y1)2
	 * @param x1 es el primer dato para ubuicar el primer punto en el plano cartesiano 
	 * @param y1 es el segundo dato para ubicar el primer punto en el plano cartesiano 
	 * @param x2 es el primer dato para ubicar el segundo punto en el plano cartesiano 
	 * @param y2 es el segundo dato para unica el segundo punto en el plano cartesiano 
	 * @return regresara la distancia de 2 puntos 
	 */
	private static double Puntos(int x1, int y1, int x2, int y2) {
		double res=0.0;
		res=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));// usando la clase math y apollado de sqrt que es para sacar la raiz cuadrada 
		//y pow que es elevar al cuadrado el termino del primer argumento 
		return res;
	}
}
