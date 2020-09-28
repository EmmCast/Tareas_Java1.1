//17.-Se desea leer un numero entero de 2 cifras y que se muestre el numero de unidades y decenas que lo componen
package Estudio;
import java.util.Scanner;
public class T017_1_Notacion {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero menos a 100");
		int num=entrada.nextInt();
		StringBuffer imp=notacion(num);
		System.out.print(imp);
	}
	/**
	 * Metodo notacion es un metodo que descompone un numero y reasigna cuantos unidades y decenas hay
	 * @param num numero a descomponer
	 * @return objeto con el dato que deseas saber 
	 */
	private static StringBuffer notacion(int num) {
		StringBuffer impt=new StringBuffer();
		if(num<100) {
			int unidad =num%10;//esta operacion asignara que el residuo de la operacion sera la unidad 
			num=num/10;//aqui el resultado de la operacion sera la nueva asignacion del la variable num 
			int decena=num%10;//se hace la mimsa operacion el resifuo sera la decena en este caso igual que la unidad 
			
			impt.append("El numero tiene: ")
			.append("\n"+unidad)
			.append(" unidades ")
			.append("\n" +decena)
			.append(" decenas ");
			return impt;
		}else {
			impt.append(num)
			.append(" No es un numero valido");
			return impt;
		}
	}
}
