/*14.-Elabore un algoritmo que permita ingresar un numero entero (1 a 10), y muestre su equivalente en romano 
 */
package Estudio;
import java.util.Scanner;
public class T014_1_NRomano {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce un numero menor a 11");
		int num=entrada.nextInt();
		String roman=convierte(num);
		impt.append("la convercion del numero ")
		.append(num)
		.append(" a romano es ")
		.append(roman);
		System.out.print(impt.toString());
	}
	/**
	 * convierte un metodo que convierte los numeros arabigos a romanos con condiciones 
	 * y ciclos de incremento 
	 * @param num es el numero arabido a convertir 
	 * @return retorna el romano 
	 */
	private static String convierte(int num) {
		String roman=" ";// ya que los romanos son letras se asignaran en String ya que son mas de 1 letra en ocaciones 
		if(num<11 && num>0){// primner condicion que se debe cumplir el num debe ser menor a 11 
			if(num==10){// es una condicion sencilla ya que el num tiene que ser solo igual a 10 
				roman="X";//retornara el num 
			}else if(num==9){// es una condicion sencilla ya que el num tiene que ser solo igual a 9
				roman="IX";//retornara el num
			}else if(num>=5){//aqui ya se ve algo interesante ya que el num inicial tiene que ser igual 5 si es mayor entrara en un ciclo agregando algo al V 
				roman="V";
				for(int i=6;i<=num;i++) {// al ser mayor a 5 se ira incrementando en 1 y se agregara I al V 
					roman+="I";// se agrega al V con la variable de incremento 
				}
			}else if(num==4){// es una condicion sencilla ya que el num tiene que ser solo igual a 4
				roman="IV";//retornara el num
			}else {
				for(int i=1;i<=num;i++){//aqui al igual que el 5 tiene que ser igual 1 si es mayor entrara en un ciclo agregando algo al I 
				roman+="I";// se agrega el + por la variable de incremento 
				}// NOTA: se inicia de el mayor al menor ya que si ingreso desde el menor la condicion en el 1 se cumpliria y seria 10 "I"
			}
		}else {
			return "no es un numero valido";
		}
		return roman; 
	}
}
