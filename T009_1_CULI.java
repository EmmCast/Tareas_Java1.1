/*9.- Elabore un algoritmo que permita averiguar si una persona debe sacar su CUIL, sabiendo su a�o de nacimiento. 
 * El c�digo �nico de identificaci�n Laboral CUIL es el numero que se otorga a todo trabajador al inicio de su actividad 
 * laboral en relaciona de dependencia (mayores de 17 a�os) que pertenezca ak sustenta u terrada de jubilaciones (SIKP) 
 * y a toda otra persona que gestione alguna presentaci�n o servicio de seguridad social en la republica de argentina.
 */
package Estudio;
import java.util.*;// importaremos la clase java.util ya que usaremos 3 parametros 
public class T009_1_CULI {
	public static void main(String[] args) {
		Calendar fecha=new GregorianCalendar();//objeto que nos permitira entrar a el a�o mes dia hora del sistema 
		Scanner entrada=new Scanner(System.in);//objeto que nos permitira cingresar datos 
		int A�o=fecha.get(Calendar.YEAR);//variable que con ayuda de calendar solicitamos el a�o del sistema 
		System.out.println("Introduce el a�o que naciste:");//solicitamos el a�o de nacimiento 
		int Nac=entrada.nextInt();//introduciremos los datos 
		boolean mayor=esmayor(Nac,A�o);//nos llevara al metodo 
		if(mayor==true) {
			System.out.println("ya eres mayor de edad ");
		}else {
			System.out.println("Aun no eres mayor de edad");
		}	
	}
	/**
	 * es mayor es un metodo que regresara solo un verdadero o falso y tiene como finalidad ver si el 
	 * usuario es mayor de edad o no lo es 
	 * @param nac se introducira fecha de nacimiento mediante teclado 
	 * @param a�o se obtiene el a�o del sistema para que no se pueda modificar 
	 * @return regresara un false o un true segun sea el caso 
	 */
	private static boolean esmayor(int nac, int a�o) {
		int res=a�o-nac;//operacion basica para sacar la edad 
		if(res>17) {//el resultado es mayor que 17 es verdaddero 
			return true;
		}else {
			return false;
		}	
	}
}
