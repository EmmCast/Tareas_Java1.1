/*13.-elaborar un algoritmo que sirva para identificar el tipo de triangulo conociendo sus tres lados.
 */
package Estudio;
import java.util.Scanner;//
public class T013_1_Triangulos {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();//
		Scanner entrada=new Scanner(System.in);
		System.out.println("Que tipo de triangulo es; \n1.-Obliangulo \n2.-Rectangulo");
		int opt=entrada.nextInt();//es la variable que usaremos para ingresar a un "menu y dependiendo de este
		// escojer un metodo diferente solo con un dato tambien podria ser hasta con un if  XD
		switch (opt) {//el switch es el cuerpo donde se iniciara dicho menu y tiene que ir vinculada a la variable ingresada
		case 1:// 1 es lo que denota la opcion que se ha escogido 
			System.out.println("Introduce lado A: ");
			double a=entrada.nextDouble();//lado a
			System.out.println("Introduce lado : ");
			double b=entrada.nextDouble();//lado b
			System.out.println("Introduce lado C: ");
			double c=entrada.nextDouble();//lado c
			int res=TObliguo(a,b,c);//metodo para los triangulos obligus que solo usan sus lados
			if(res==1) {
				impt.append("\n")
				.append("Es un triangulo Equlatero por que todos sus 3 lados son iguales ");
			}else if(res==2) {
				impt.append("\n")
				.append("Es un triangulo Isoceles por que 2 lados son iguales y 1 diferente  ");
			}else if (res==3) {
				impt.append("\n")
				.append("Es un triangulo Escaleno por que sus 3 lados son diferentes ");		
			}
			System.out.println(impt.toString());
			break;// cierra el proceso
		case 2://2 es la segunga opcion del menu Triangulos rectangulos 
			System.out.println("Introduce lado A: ");
			a=entrada.nextDouble();
			System.out.println("Introduce lado B: ");
			b=entrada.nextDouble();
			System.out.println("Introduce lado C: ");
			c=entrada.nextDouble();
			
			 res=TRectangulo(a,b,c);// metodo para los triangulos rectangulos 
			 if(res==1) {
				impt.append("\n")
				.append("Es un triangulo rectangulo por que la suma de los catetos es higual a la hipotenusa ");
			}else if(res==2) {
				impt.append("\n")
				.append("Es un triangulo acutangulo por que la suma de los catetos es mayor que la hipotenusa ");
			}else if (res==3) {
				impt.append("\n")
				.append("Es un triangulo obtuangulo por que la suma de los catetos es menor que la hipotenusa ");		
				}
			System.out.println(impt.toString());
			break;// cierra el proceso
			default://esa opcion es por se si ingresa un dato que no este dentro de menu "case #:"
				System.out.print("no es una opcion valida");
		}
	}
	/**
	 * TObliguo es un metodo que diferencia a los triangulos por sus lados y una gran caracteristica es que tienen 
	 * angulos de 45° 
	 * Triangulo equilatero 3 lados iguales 
	 * Triangulo Isoceles 2 lados iguales 1 diferente 
	 * Triangulo escaleno 3 lados diferentes 
	 * @param a lado a
	 * @param b lado b
	 * @param c lado c
	 * @return retornara solo un dato para diferenciar los triangulos 
	 */
	private static int TObliguo(double a, double b, double c) { 
		if(a==b&& a==c && c==b) {// los 3 lados son iguales
			return 1;
		}else if(a==c&& a!=b && b!=c) {//2 lados iguales y 1 diferente 
			return 2;
		}else if(a!=b && a!=c && c!=b) {//3 lados diferentes 
			return 3;
		}
		return 0;
	}
	/**
	 * TRectangulos es un metodo que diferencia a los triangulos rectangulos por sus lados  a pesar que 
	 * la manera mas comun es por sus angulos pero igual se puede por sus lados solo identificando la hipotenusa 
	 * que es el lado con angulos a 90°
	 * Triangulo Rectangulo solo tiene 1 angulo de 90° ó la suma de los catetos es igual a la hipotenusa 
	 * triangulo Acutangulo tiene 3 angulos de 90° ó la hipotenusa es menos a la suma de los catetos 
	 * triangulo obtusangulo tiene un angulo mayor a 90° ó la hipotenusa es mayor a la suma de los catetos 
	 * pero aqui los reconoceremos con sus lados 
	 * @param a lado a o cateto 
	 * @param b lado b o cateto 
	 * @param c lado c o hipotenusa 
	 * @return setornara solo 1 datos para diferencia 
	 */
	private static int TRectangulo(double a, double b, double c) {
		a=Math.pow(a, 2);
		b=Math.pow(b, 2);
		c=Math.pow(c, 2);
		if((a+b)==c){// la suma de los catetos es igual a la hipotenusa
			return 1;
		}else if (c<(a+b)){//la suma de los catetos es mayos a la hipotenusa
			return 2;
		}else if(c>(a+b)){//la suma de los catetos es menos a la hipotenusa
			return 3;
		}
		return 0;
	}
}
