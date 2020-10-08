/*27.-Elabore un algoritmo que solicite 2 números enteros y un operador aritmético y luego debe de mostrar 
 * el  resultado de la operación correspondiente "+" suma,  "-" resta, "*"multiplicación. " ° " Potencia.
 */
package Estudio;
import java.util.Scanner;
public class T027_1_Calculadora {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresar dato 1 \n Nota:cuando es potencia este es el dato que se resolvera");
		int num1=entrada.nextInt();
		System.out.println("Ingresar dato 2 \n Nota:cuando es potencia este es el exponente");
		int num2=entrada.nextInt();
		System.out.println("Ingresa la operacion que deseas '+=1' '-=2' '*=3' '/=4' '°=5'");
		int operador=entrada.nextInt();
		int resultado=solucion(num1,num2,operador);
		System.out.println("el resultado es :"+ resultado);
		
	}
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @param operador
	 * @return
	 */
	private static int solucion(int num1, int num2, int operador) {
		int res=0;
		if(operador==1) {
			res=num1+num2;
		}else if(operador==2){
			res=num1+num2;
		}else if (operador==3) {
			res=num1*num2;
		}else if(operador==4){
			res=num1/num2;
		}else if(operador==5) {
			res=(int) Math.pow(num1, num2);
		}
		return res;
	}
}
