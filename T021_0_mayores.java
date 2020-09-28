//21.-Elaborar un algoritmo que solicita la edad de 200 
//personas, y que muestre cuantos son mayores y menores de edad 
package Estudio;
import java.util.Scanner;
public class T021_0_mayores {
	public void main(String arg[]) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Ingresa cuantas personas estaran sensados" );
		int personas=entrada.nextInt();
		int []edades=new int [personas];
		for(int i=0;i<personas;i++) {
			System.out.println("ingresa la edad de la persona "+ (i+1));
			edades[i]=entrada.nextInt();
		}
		System.out.println("que deseas saber que hay Mayor/Menor");
		String deseas=entrada.nextLine();
		int son=mayormenor(edades,deseas);
		if(deseas.equalsIgnoreCase("Mayor")) {
			System.out.println(" las personas mayores de edad son" + son);
		}else if(deseas.equalsIgnoreCase("Menor")) {
			System.out.println(" las personas menores de edad son " + son);
		}
	}
	/**
	 * 
	 * @param edades
	 * @param deseas
	 * @return
	 */
	private int mayormenor(int[] edades, String deseas) {
		int res=0;
		if(deseas.equalsIgnoreCase("Mayor")) {
			for (int i=0;i<edades.length;i++) {
				if(edades[i]>18) {
					res=res+1;
				}
			}
		}else if (deseas.equalsIgnoreCase("menor")) {
			for (int i=0;i<edades.length;i++) {
				if (edades[i]<18) {
					res=res+1;
				}
			}
		}
		
		return res;
    }
}