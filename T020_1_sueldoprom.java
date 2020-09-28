//20..-Elabora un algoritmo que permita mostrar el sueldo promedio de un grupo de empleados 
package Estudio;
import java.util.Scanner;
public class T020_1_sueldoprom {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();
		Scanner entrada=new Scanner(System.in);
		System.out.println("Cuantos empleados se tienes");
		int empleados=entrada.nextInt();
		double [] salarios=new double[empleados];
		for(int i =0;i<empleados;i++) {
			System.out.println("salario del empleado " + (i+1));
			salarios[i]=entrada.nextDouble();
		}
		double Sueldo_promedio=promedio(salarios);	
		impt.append("el salario promedio de ")
		.append(empleados)
		.append(" es de ")
		.append(Sueldo_promedio);
		System.out.println(impt.toString());
	}
	/**
	 * un metodo que hace la suma del los salarios 
	 * @param salarios suma del arreglo salarios y almacenados en una variable interna al metodo 
	 * @return salario promedio
	 */
	private static double promedio(double[] salarios) {
		double total=0.0;// variabkle donde se guardata la suma de todos los datos del arreglo 
		double promedio=0.0;//sera el salario promedio de N numero de empleados 
		for(int i=0;i<salarios.length;i++) {//ir leyendo todos los lugares del arreglo
			total+=salarios[i];// suma cada dato del arrelgo y es almacenado en total
			promedio=total/salarios.length;// se divide el total por el numero de datos 
		}
		return promedio;
	}
}
