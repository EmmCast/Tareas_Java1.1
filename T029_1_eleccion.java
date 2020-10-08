/*29.-Elaborer un algoritmo para obtener el resultado del escrutinio en las elecciones del delegado del colegio, 
 * considerar que hay 160 electores y se han presentado 3 candidatos, todos votaron, el algoritmo debe de declarar 
 * al ganados por mayoría simple
 */
package Estudio;
import java.util.Scanner;
public class T029_1_eleccion {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		 System.out.println("introoduce el numero de votantes");
		 int total=entrada.nextInt();
		 System.out.println("introoduce el numero de votos en blanco");
		 int bl=entrada.nextInt();
		 System.out.println("introoduce el numero de votos para el candidato 1");
		 int c1=entrada.nextInt();
		 System.out.println("introoduce el numero de votos para el candidato 2");
		 int c2=entrada.nextInt();
		 System.out.println("introoduce el numero de votos para el candidato 3");
		 int c3=entrada.nextInt();
		 
		 if((bl+c1+c2+c3)==total) {
			 int selecto=ganador(c1,c2,c3);
			 if(selecto==1) {
				 System.out.println("El candidato 1 gano");
			 }else if (selecto==2) {
				 System.out.println("El candidato 2 gano");
			 }else {
				 System.out.println("El candidato 3 gano");
			 }
		 }else {
			 System.out.println("las votos no considen con los votantes");
		 }
	}
	/**
	 * 
	 * @param c1
	 * @param c2
	 * @param c3
	 * @return
	 */
	private static int ganador(int c1, int c2, int c3) {
		if(c1>c2 && c1>c3) {
			return 1;
		}else if (c2>c1 && c2>c3) {
			return 2;
		}else {
		return 3;
		}
	}

}
