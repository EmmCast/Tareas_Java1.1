/*11.-Se tiene registrado la producción (unidades) logradas por un operario a lo largo de la semana (lunes a sábado).
 * Elaborar un algoritmo que nos muestre o nos diga si el operario recibirá incentivos sabiendo que el promedio de producción mina es 
 * de 100 unidades.
 */
package Estudio;
import java.util.Scanner;
public class T011_1_produccion {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la meta:");
		int meta=entrada.nextInt();
		System.out.println("Introduce lo alcanzado:");
		int produccion=entrada.nextInt();
		
		boolean bono=logro(meta,produccion);
		if(bono==true) {//si se alcanza la meta
			System.out.println("se alcanzo la meta ");
		}else {// si no se alcanza la meta 
			System.out.println("No se alcanzo la meta");
		}
	}
	/**
	 * logro es un metodo sensillo en el que se evaluan los 2 datos de meta y bono y se verifica que se cumpla 
	 * @param meta la meta a llegar 
	 * @param produccion lo producido de "X" empleado
	 * @return true si se alcanzo la meta false si no se alcanzo
	 */
	private static boolean logro(int meta, int produccion) {
		if(produccion>meta) {
			return true;
		}else {
		return false;
		}
	}
}
