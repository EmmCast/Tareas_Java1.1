/*9.- Elabore un algoritmo que permita averiguar si una persona debe sacar su CUIL, sabiendo su año de nacimiento. 
 * El código único de identificación Laboral CUIL es el numero que se otorga a todo trabajador al inicio de su actividad 
 * laboral en relaciona de dependencia (mayores de 17 años) que pertenezca ak sustenta u terrada de jubilaciones (SIKP) 
 * y a toda otra persona que gestione alguna presentación o servicio de seguridad social en la republica de argentina.
 */
package Estudio;
import java.util.*;// importaremos la clase java.util ya que usaremos 3 parametros 
public class T009_1_CULI {
	public static void main(String[] args) {
		Calendar fecha=new GregorianCalendar();//objeto que nos permitira entrar a el año mes dia hora del sistema 
		Scanner entrada=new Scanner(System.in);//objeto que nos permitira cingresar datos 
		int Año=fecha.get(Calendar.YEAR);//variable que con ayuda de calendar solicitamos el año del sistema 
		System.out.println("Introduce el año que naciste:");//solicitamos el año de nacimiento 
		int Nac=entrada.nextInt();//introduciremos los datos 
		boolean mayor=esmayor(Nac,Año);//nos llevara al metodo 
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
	 * @param año se obtiene el año del sistema para que no se pueda modificar 
	 * @return regresara un false o un true segun sea el caso 
	 */
	private static boolean esmayor(int nac, int año) {
		int res=año-nac;//operacion basica para sacar la edad 
		if(res>17) {//el resultado es mayor que 17 es verdaddero 
			return true;
		}else {
			return false;
		}	
	}
}
