/*2.-Se desea obtener el promedio simple de un estudiante a partir de sus 3 notas parciales
*/
package Estudio;
import java.util.Scanner;//es la paquetereia que nos permitira ingresar datos desde teclado 
public class T002_3_Promedio {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);//objeto que nos permite capturar datos desde teclado  
		System.out.println("Cuantos parciales se elaluaran");//nos pregunta cuantos datos recibiremos 
		int parciales=entrada.nextInt();//se capturan los datos en la variable parcia 
		double [] calificaciones=new double[parciales];// aqui creamos un arreglo pero el tamaño del arreglo lo designara el numero de parciales  
		for (int i=0; i<parciales; i++) {// aqui empezaremos el almasenamiento de los datos en el arreglo empezando desde la pocicion 0 claro esta 
			System.out.println("ingresa la calificacion del pacrcia "+ (i+1));//aqui es donde nos haran la pregunta 
			calificaciones[i]=entrada.nextDouble();// aqui es donde se empieza a almacenar los datos en el arreglo 
		}
		double promedio=curso(calificaciones,parciales);// se crea el metod que hara la operacion 
		System.out.println("El promedio total es de "+promedio);// se llama el resultado del metodo 
	}
	/**
	 * El metodo curso es un metodo en el cual se hace la suma de las calificaciones y sacar su promedio de todo el curso 
	 * @param calificaciones es el arreglo donde se alojan todas las calificaciones y seran sumadas en una variable de incremento 
	 * @param parciales ess el numero por el cual se dividira la suma total de las calificacions tambien es el tamaño del arreglo 
	 * @return retornara la califacion promedio 
	 */

	private static double curso(double[] calificaciones, int parciales) {
		double res=0.0;// variable donde se dara el resultado del promedio  
		double coleccion=0.0;// es una variable donde se asignara la suma de todas las calificaciones
		for (int i=0;i<calificaciones.length;i++) {// es el ciclo que se hace el recorrido del arreglo por eso se usa el. length para que se haga el recorrido
			coleccion+=calificaciones[i];// se hace la suma del arreglo en la variable de incremento 
			res=coleccion/parciales;// y se hace la operacion reglamentaria para el promedio 
		}
		return res;// retornara el promedio 
	}

}
