//24.-elabora un algoritmo que muestre los términos 
//de la serie que sean menores a 10001,2,5,26…
package Estudio;
import java.util.ArrayList;
import java.util.Scanner;
public class T024_0_secuencia {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();
		Scanner entrada=new Scanner (System.in);
		System.out.print("introduce el inicio del ciclo: ");
		int ciclo=entrada.nextInt();
		ArrayList<Integer> secuencia=proceso(ciclo);
		impt.append("el ciclo completo es: ")
		.append(secuencia);
		System.out.print(impt.toString());
	}

	private static ArrayList<Integer> proceso(int ciclo) {
		ArrayList arre=new ArrayList();
		for(int i=ciclo;i<1000;i=i*i+1) {	
			arre.add(i);
		}
		return arre;
	}

}
