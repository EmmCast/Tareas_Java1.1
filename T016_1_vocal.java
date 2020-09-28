//16.- Elabore un algoritmo que solicite un numero entero y muestre un mensaje indicando la vocal correspondiente considerando que la vocal A=1
package Estudio;
import java.util.Scanner;
public class T016_1_vocal {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num=entrada.nextInt();// se ingresara un numero para ver que letra es 
		String vocal=vocal(num);//se crea un metodo para poder 
		impt.append("El numero: ")
		.append(num)
		.append(" tiene asignada la vocal ")
		.append(vocal);
		System.out.println(impt.toString());
	}
	/**
	 * vocal es un metodo que asigna un numero del 1 al 5 a una vocal 
	 * @param num el numero que asogmara a ima vpcal
	 * @return retornara si es una vocal
	 */
	private static String vocal(int num) {
		if(num==1) {
			return "A";
		}else if (num==2) {
			return "E";
		}else if(num==3) {
			return "I";
		}else if(num==4) {
			return "O";
		}else if (num==5) {
			return "U";
		}else {
			return "No es un numero valido para una vocal";
		}
	}

}
