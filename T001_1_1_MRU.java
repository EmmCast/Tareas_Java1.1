/*1.-  Se desea calcular la distancia recorrida (m) por un automóvil que tiene velocidad  constante (m/s) durante un Tiempo (seg), 
 * considerar que es un MRU(Movimiento rectilíneo uniforme).por un automóvil que tiene velocidad constante (m/s) 
 * durante un Tiempo (seg), considerar que es un MRU(Movimiento rectilíneo uniforme).
 */
package Estudio;
import java.util.Scanner;//la clase que nos ayudara a capturar datos del teclado 
public class T001_1_1_MRU {//programa malo
	public static void main (String arg[]) {
		Scanner entrada=new Scanner(System.in);//se crea el objeto para poder ingresar datos del teclado 1
		StringBuffer impt=new StringBuffer();//Objeto para imprimir todo concatenado 
		
		System.out.println("introduce la velocidad si no se tiene pon un 0:");
		double Di1=entrada.nextDouble();//velociidad
		System.out.println("introduce la unidad de la distancia si no se tiene pon Km/m/cm:");
		String Di2=entrada.nextLine();//Unidad de la velocidad Km/m/cm
		System.out.println("introduce la unidad Tiempo si no se tiene pon un 0:");
		double Ti1=entrada.nextDouble();//Tiempo recorrido
		System.out.println("introduce la unidad de la Tiempo si no se tiene pon Hr/min/seg:");
		String Ti2=entrada.nextLine();//Unidad de tiempo Hr, Min ó seg
		System.out.println("introduce la distancia si no se tiene pon un 0:");
		double Ve1=entrada.nextDouble();//velocidad que tiene el objeto
		System.out.println("introduce la unidad de distancia si no se tiene pon un km/mts/cm:");
		String Ve2=entrada.nextLine();//Unidad que tiene el objeto km/mts/cm
		System.out.println("introduce la unidad que deseas saber:");
		String Saber=entrada.nextLine();
		double MRU=Proceso(Di1,Di2,Ti1,Ti2,Ve1,Ve2,Saber);// Metodo de MRU
		
		System.out.println("el resultado es: " + MRU);
		
	}
	/**
	 * Proceso es un metodo en el que se resuelve un problema de Movimiento Rectilineo uniforme y 
	 * puede resolver los 3 parametros de la formula que se desee conocer y esotos son 
	 * distancia, tioempo o velocidad y se transfoman a su minima exprecion. 
	 * @param Di1 es la velocidad que se tiene por parte del problema si es que se tiene 
	 * @param Di2 es la unidad de la velocidad y esta puede ser Km o m posterior mente se transformara a su minima exprecion 
	 * @param Ti1 es es tiempo que se tiene por parte del problema si es que se tiene.
	 * @param Ti2 es la unidad de tiempo y esta puede ser Hr, min ó seg. igual se transformara a su minima exp
	 * @param Ve1 es la distancia que se tiene el objeto segun el problma si es que se tyiene 
	 * @param Ve2 es la unidad que distancia maneja en el problema y esta sera reducida a su minima exprecion 
	 * @param Saber es el parametro que nos indica que dato es el que deseamos saber de la formula ya sea Distancia Tiempo o Velocidad 
	 * @return retornara el resultado en su minima exp
	 */
	private static double Proceso(double Di1, String Di2, double Ti1, String Ti2, double Ve1, String Ve2,String Saber) {
		double d=0.0;//la variable donde se da la distancia en su unidad basica que es Metro
		double v=0.0;//la variable donde se da la velocidad en su unidad basica velocidad 
		double t=0.0;//la variable donde se da el tiempo segundo
		double res=0.0;
		
		if(Di2.equalsIgnoreCase("Km")) {//Se hace la convercion de distancia 
			d=Di1*1000;
		}else if(Di2.equalsIgnoreCase("mts")) {
			d=Di1;
		}else if (Di2.equalsIgnoreCase("Cm")) {
			d=Di1*60;
		}
		
		if(Ti2.equalsIgnoreCase("Hr")) {//Se ha la cenvercion de tiempo 
			t=Ti1*3600;
		}else if(Ti2.equalsIgnoreCase("min")){
			t=Ti1*60;
		}else if(Ti2.equalsIgnoreCase("seg")) {
			t=Ti1;
		}
		
		if(Ve2.equalsIgnoreCase("Km")){//se hace la convercion de velocidad
			v=(Di1*1000)/3600;
		}else if(Ve2.equalsIgnoreCase("cm")) {
			v=(Di1)*(1/100);
		}
		// se la operacion basica segun la formula de MRU
		if(Saber.equalsIgnoreCase("Distancia")) {
			res=v*t;
		}else if(Saber.equalsIgnoreCase("Tiempo")) {
			res=d/t;
		}else if(Saber.equals("velocidad")) {
			res=d/t;
		}
		return res;
	}

}