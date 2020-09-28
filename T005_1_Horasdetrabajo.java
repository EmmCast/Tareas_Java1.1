/*5.-Se requiere un algoritmo para elaborar la plantilla de un empleado. Para ello se dispone de sus horas 
 * laboradas en el mes asi como la tarifa por hora.
 */
package Estudio;
import java.util.*;//exportacion de la libreria para usar calender gregorian calender y scanner
public class T005_1_Horasdetrabajo {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);//objeto que nos permite ingresar datos del teclado 
		Calendar fecha = new GregorianCalendar();//objeto que nos permite importar el calendario del sistema 
		StringBuffer impt=new StringBuffer();
		int año = fecha.get(Calendar.YEAR); //variable que esta solisitando el año en espesifico del sistema 
		System.out.println("cuanto es el sueldo mensual?");//se pregunta de cuanto es el sueldo mensual 
		int  sueldo=entrada.nextInt();// que tendra el salario mensual 
		//System.out.println("cuantas faltas junto por el mes?");//se preguntara si el empleado tuvo faltas 
		//int faltas=entrada.nextInt();//variable que tendra las faltas 
		System.out.println("De cuanto es tu jornada laboral?");// se regintara la jornada lavoral por horas al dia 
		int jornada=entrada.nextInt();//se dara el valor a este dato 
		System.out.println("que mes es el que deseas verifica?");//se preguntara el mes 
		int mes=entrada.nextInt();//se dara el mes que se desea saber 

		int dias=diasmes(mes,año);// metodo que nos dara los dias exactos del mes deseado 
		int horas=desempeño(jornada,dias);// metodo que dira cuantas horas al mes se han trabajado 
		double paga=remuneracion(sueldo,jornada);//metodo donde se dira canto dinero se ha generado en el mes 
		
		impt.append("las horas laborales del mes es ")
		.append(horas)
		.append(" lo que se cobra por hora es ")
		.append(paga);
		System.out.print(impt.toString());
		
	}
	/**
	 * metodo sencillo en el que nos dira cuantos dias tiene "X" numero del mes 
	 * @param mes se introducira el mes con numero 
	 * @param año el año se agrega directamente del sistema por lo que no hay que hacerlo manual 
	 * @return retornara los dias del mes 
	 */
	private static int diasmes(int mes, int año) {
		int res=0;
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ) {//con la condicion or solo una opcion es valida 
			res=31;
		}else if (mes==4 || mes==6 || mes==9 || mes==11) {
			res=30;
		}else if (mes==2) {
            if ( ((año%100==0) && (año%400==0)) || ((año%100!=0) && (año%4==0)))
                res=29;// si es biciesto   
            else
                res=28;// año normal
		}
		return res;
	}
	/**
	 * es un metodo sensillo en el cual se indicara cuanto se gano en el mes 
	 * @param sueldo  se introducira el sueldo total del mes 
	 * @param jornada las horas de su jornada oficial 
	 * @return retornara salartio por hora 
	 */
	private static double remuneracion(int sueldo, int jornada) {
		double res=0.0;
			res=(sueldo/26)/jornada;//el sueldo por hora se visualisa asi y se toma por la razon 	
			//todos los contratos son de 15 dias es decir 30 dias laborales por mes independiente
			//de que tenga 31 dias y 1 dia de descanso por semana por lo que son 26 dias laborales 
		return res;
	}
	/**
	 * metodo sencillo que nos indicara las horas que se laboran de manrea estandar por mes 
	 * @param jornada las horas por jornada diaria 
	 * @param dias dias que tiene "X"  mes 
	 * @return las horas trabajadas por mes 
	 */
	private static int desempeño(int jornada,int dias) {
		int res=0;
		res=(dias-4)*jornada;//las horas laboradas por mes 
		return res;
	}

}
