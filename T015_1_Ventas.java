/*15.- elabora un algoritmo que permita ingresar el monto de ventas 
 * alcanzado por un vendedor durante el mes,luego calcula la bonificación 
 * que le corresponde sabiendo que 
	       Monto	 Bonificación (%)
		   0-1000		0
		1000-5000		3
		5000-20000		5
		20000 a mas		8
 */
package Estudio;
import java.util.Scanner;
public class T015_1_Ventas {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce la produccion");
		int pro=entrada.nextInt();
		double comicion=bono(pro);
		impt.append(" tuvo la comicion de ")
		.append(comicion);
		System.out.println(impt.toString());
	}
	/**
	 * bono es un metodo sencillo en el cual nos ayudara a ver cual sera el bono adquirido segun
	 * su produccion con una comparacion 
	 * @param pro sera el producto alcanzado 
	 * @return retornadra el porcentaje de comicion 
	 */
	private static double bono(int pro) {
		double bono=0.0;
		if(pro<=1000) {
			bono=pro*0;
		}else if (pro>=1001 && pro<=5000){
			bono=pro*0.03;
		}else if (pro>=5001 && pro<=20000) {
			bono=pro*0.05;
		}else {
			bono=pro*0.08;
		}return bono;
	}
}
