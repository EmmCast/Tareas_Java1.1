/*6.-Elabore un algoritmo que lea los 3 lados de un triangulo cualquiera y calcule su área, considerar: 
 * si A,B y C son los lados, y S el semi perímetro A=√S*(S-A)*(S-B)*(S-C)
*/
package Estudio;
import java.util.Scanner;// libreria que nos ayudara a poder capturar datos del teclado 
public class T006_1_Aarea_Triangulo_medodo_fheron {
	public static void main(String arg[]) {
	StringBuffer impt=new StringBuffer();// objeto que que agrupa todos los datos para imprimir 
	Scanner entrada=new Scanner(System.in);//objeto que nos permitira leer los datos del teclado
	System.out.println("Introduce el lado A del triangulo: ");// pedir lado a 
	double A=entrada.nextDouble();//variable donde se guardara la variable A
	System.out.println("Introduce el lado B del triangulo: ");// pedir lado b 
	double B=entrada.nextDouble();//variable donde se guardara la variable B
	System.out.println("Introduce el lado C del triangulo: ");//// pedir lado c
	double C=entrada.nextDouble();//variable donde se guardara la variable C
	
	double Area=FHERON(A,B,C);//metodo que que lleva los datos al metodo FORMULA DE HERON 
	impt.append("El area del triangulo por metodo de Heron es: ")
	.append(Area);
	System.out.println(impt.toString());
	}
	/**
	 * Formula de Heron es una formula matematica que nos permitira saber el area a travez de su perimetro
	 * con la siguiente formula A=√S*(S-A)*(S-B)*(S-C)
	 * @param a es el lado A del triangulo 
	 * @param b es el lado B del triangfulo 
	 * @param c es el lado c del triangulo 
	 * @return retornara el area del triangulo 
	 */
	private static double FHERON(double a, double b, double c) {
		double res=0.0;
		double SP=(a+b+c)/2;//la variable SP es el semi perimetro de la figura y se obtiene con el perimetro entre 2 
		res=Math.sqrt(SP*(SP-a)*(SP-b)*(SP-c));//usando la clase MAth nos permetira usar ya operaciones matematicas especificas
		//como el sqrt que nos permitira sacar la raiz cuadrada de toda la operacion de la formula 
		return res;
	}
}
