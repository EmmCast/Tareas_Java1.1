/*2.-Se desea obtener el promedio simple de un estudiante a partir de sus 3 notas parciales
*/
package Estudio;
import java.util.Scanner;// se esta importando la libreria que nos permitira agregar texto desde el teclado 
public class T002_2_Promedio {
	public static void main (String arg[]) {
		Scanner entrada=new Scanner(System.in);// se crea el objeto para la captura de datos
		System.out.println("Cuantos parciales se elaluaran");// se hace la pregunta 
		int parciales=entrada.nextInt();//se introduce el dato requerido 
		double calificaciones=0.0;// es la variable donde se guardara la suma de todas las calificaciones 
		for (int i=0;i<parciales;i++) {// con este for nos permitira hacer la pregunta N numero de veces sea necesaria 
			System.out.println("ingresa la calificacion del pacrcia "+ (i+1));//nos hace la pregunta segun las veces sea necesaria 
			calificaciones+=entrada.nextDouble();// con esta variable de incremento se guarda la suma de todos los promedios en una misma variable 
			//Nota: el unico invonveniente es que al momento de querer saber una calificacion en especifico no se podra hacer ya que solo guarda la 
			// y no las pociciones 
		}
		double promedio=curso(calificaciones,parciales);// se mandan los datos al metodo para su creacion 
		System.out.println("El promedio total es de "+promedio);//se manda a llamar el resultado funal 
	}
	/**
	 * El metodo cursp nos permita hace la operacion de las calificacion durante N numero de parciales ingresados 
	 * @param calificaciones es una variable de incremento en el que se ha guardado la suma de todas las calificaciones en n numero de parciales 
	 * @param parciales es el numero de parciales quye se han cursado y por el cual seran dividida la suma de calificaciones 
	 * @return retornara el promedio final 
	 */

	private static double curso(double calificaciones, int parciales) {
		double res=0.0;// resultado del promedio final 
		res=calificaciones/parciales;// operacion basica para obtener el promedio
		return res;//retorna el resultado al metodo main 
	}
	
}
