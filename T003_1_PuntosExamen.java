/*3.-Elaborar un algoritmo que solicite el número de respuestas correctas, incorrectas y en blanco correspondiente 
 * a postulantes y demuestre su puntaje final considerando, que por cada respuesta correcta tendrá 4 puntos, respuesta 
 * incorrecta -1 y respuesta en blanco 0.
 */
package Estudio;
import java.util.Scanner;// libreria que nos permite capturar los datos de teclado 
public class T003_1_PuntosExamen {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);//objeto con el metodo Scanner para capturar datos 
		System.out.println("Introduce cuantas preguntas seran");
		int preguntas=entrada.nextInt();//variable que asignara el numero de preguntas que se deben de ingresar 
		System.out.println("Introduce cuantas preguntas correctas son");
		int correctas=entrada.nextInt();// variable que asigna las preguntas correctas 
		System.out.println("Introduce cuantas preguntas Incorrectas son");
		int incorrectas=entrada.nextInt();// variable de las preguntas incorrectas 
		System.out.println("Introduce cuantas preguntas en blanco son");
		int blanco=entrada.nextInt();//variable de preguntas en blanco 
		
		if((correctas+incorrectas+blanco)==preguntas) {//es una condicional que compruebva que la suma de las respuestas 
			                                           //sea igual al numero de preguntas y asi poder continuar 
			int puntuiacion=puntaje(correctas,incorrectas,blanco);//se mandan los datos al metodo 
			System.out.println("El puntaje es de "+puntuiacion);// se imprime la puntuacion 
		}else {
			System.out.println("el numero preguntas no considen con el numero de respuestas ");// si no conside el numero manda este error 
		}
	}
	/** metodo puntaje donde se hara la operacion basica del puntaje de las preguntas 
	 * @param correctas son las preguntas correctas y tienen un valor de 4 puntos cada 1
	 * @param incorrectas son las preguntas incorrectas y tienen un valor de -1 cada 1 
	 * @param blanco son las respuestas npo contestadas y tienen valor de 0 puntos cada 1 
	 * @return se regresa la suma de todos los puntos 
	 */

	private static int puntaje(int correctas, int incorrectas, int blanco) {
		int res=((correctas*4)+((incorrectas*(-1))+(blanco*0)));//la operacion que saca los puntos 
		return res;
	}

}
