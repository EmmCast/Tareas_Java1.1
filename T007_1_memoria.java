/*7.-Elaborar un algoritmo que permita calcular el numero de CDs necesarios para hacer una copia de seguridad, 
 * de la información almacenada en un disco cuya capacidad se conoce, considerar que el disco duro esta lleno 
 * de información además expresando en gb y un cd virgen tiene 700 mb de capacidad y un gb es igual a 1024 mb
 */
package Estudio;
import java.util.Scanner;
public class T007_1_memoria {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();
		Scanner entrada=new Scanner(System.in);
		System.out.println("Cuantos GB se almacenaran");
		int GB=entrada.nextInt();//introdir el espacio que se guardara en respaldo 
		int almacenaminento=discos(GB);//metodo que hara la operacion para ver cuantos discos se necesitan 
		impt.append("El numero de discos ocuparas soran: ")
		.append(almacenaminento);
		System.out.println(impt.toString());
	}
	/**
	 * discos es un metodo que nos ayudara a ver cuantos discos de 700 mb se necesitatran para almacenar 
	 * "X" Gigabyts de informacion 
	 * @param espacio es el espacio que se desea calcular 
	 * @return retornara la cantidad de discos 
	 */
	private static int discos(double GB) {
		int res=0;
		res=(int) Math.ceil((GB*1024)/700);//una operacion sencilla pero para ver cuantos discos usamos solo 
		//que usamos de la clase mat y ceil que su funcion es redondear a numeros enteros para tener los discos 
		return res;
	}

}
