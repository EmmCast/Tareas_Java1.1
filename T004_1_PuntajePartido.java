/*4.-Elabnora un algoritmo que permita ingresar el numero de partidos ganados perdidos y empatados, por algún equipo en el torneo de apertura, 
 * se debe de mostrar su puntaje total teniendo en cuenta que por cada partido ganado obtendrá 3 puntos, empatado 1 punto y perdido 0 puntos 
 */
package Estudio;
import java.util.Scanner;
public class T004_1_PuntajePartido {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);//objeto con el metodo Scanner para capturar datos 
		System.out.println("Introduce cuantos partidos se jugaron");
		int partidos=entrada.nextInt();//variable que asignara el numero de ppartidos jugados  
		System.out.println("Introduce cuantos partidos ganados son");
		int ganados=entrada.nextInt();// variable que asigna los partidos ganados
		System.out.println("Introduce cuantos partidos empatados son");
		int empatados=entrada.nextInt();// variable de los partidos empatados
		System.out.println("Introduce cuantss partidos perdidos son");
		int perdidos=entrada.nextInt();//variable de los partidos perdididos
		
		if((ganados+empatados+perdidos)==partidos) {//es una condicional que compruebva que la suma de los partidos
			                                           //sea igual a la suma de los puntos 
			int puntuiacion=puntaje(ganados,empatados,perdidos);//se mandan los datos al metodo 
			System.out.println("El puntaje es de "+puntuiacion);// se imprime la puntuacion 
		}else {
			System.out.println("el numero preguntas no considen con el numero de respuestas ");// si no conside el numero manda este error 
		}
	}
	/** metodo puntaje donde se ara la operacion basica del puntaje de los partidos
	 * @param ganados son los partidos ganados y tienen un valor de 3 puntos cada 1 
	 * @param empatados son los partidos empatados y tienen un valor de 1 puntos cada 1 
	 * @param perdidos son los partidos perdidos y tienen un valor de 0 puntos cada 1  
	 * @return se regresa la suma de todos los puntos 
	 */
	private static int puntaje(int ganados, int empatados, int perdidos) {
		int res=((ganados*3)+((empatados*1)+(perdidos*0)));//la operacion que saca los puntos 
		return res;
	}
}
