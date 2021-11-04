import java.text.DecimalFormat;
import java.util.Random;

public class Ejercicio2 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		String pattern="###,##0.00";
		DecimalFormat df=new DecimalFormat(pattern);
		int matriz [][] = new int [15][3];
		int azar1 = 0, azar2 = 0;
		int col = 0, fila = 0;
		double cont_hombres = 0, cont_mujeres = 0;
		int trabaja_hombre = 0, trabaja_mujer = 0;
		int sueldo_hombre = 0, sueldo_mujer = 0;
		
		
		for (fila = 0; fila < 15; fila++) {
			for (col = 0; col < 3; col++) {
				if (col == 0 || col == 1) {
					//si es la columna 1 o la columa 2 la llena de 1 a 2
					azar1 = 1+(int)(aleatorio.nextDouble()*2);
					matriz[fila][col] = azar1;
					
					//lineas para contar el numero de hombres y numero de mujeres.
					if (col == 0) {
						if (azar1 == 1) {
							cont_hombres++;
						} else {
							cont_mujeres++;
						}
					}
					
					//si es la tercera columna la llena de entre 600 a 2000 (euros)
				} else if (col == 2) {
					azar2 = 600+(int)(aleatorio.nextDouble()*1400);
					matriz[fila][col] = azar2;
					
				} 
				//muestro la matriz
			System.out.print(matriz[fila][col] + " ");
			
			}//acaba el for interior.
			System.out.println("");
		
			//lineas para contar los hombres y mujeres que trabajan
			if (matriz[fila][0] == 1 && matriz[fila][1] == 1) {
				trabaja_hombre++;
				//acumulo el sueldo de los hombres trabajadores
				sueldo_hombre+=matriz[fila][2];
			} else if (matriz[fila][0] == 2 && matriz[fila][1] == 1) {
				trabaja_mujer++;
				//acumulo el sueldo de las mujeres trabajadoras
				sueldo_mujer+=matriz[fila][2];
			}
		}// llave de cierre de el primer for
		
		
		//calculo del porcentaje de hombres y de mujeres
		double porcentaje_hombres = (cont_hombres/15)*100;
		double porcentaje_mujeres = (cont_mujeres/15)*100;
		
		//muestro el numero de hombres y de mujeres
		System.out.println("\nN de hombres: "+cont_hombres);
		System.out.println("Nde mujeres: "+cont_mujeres);
		
		
		
		//muestro el porcentaje de hombres y de mujeres
		System.out.println ("\nEl porcentaje de hombres es: " +df.format(porcentaje_hombres)+ "%");
		System.out.println("El porcentaje de mujeres es: "+df.format(porcentaje_mujeres)+ "%");
		
		
		
		//muestro el numero de hombres y de mujeres que trabaja
		System.out.println("\nNumero de hombres que trabaja: "+trabaja_hombre);
		System.out.println("Numero de mujeres que trabaja: "+trabaja_mujer);
		
		//calculo del porcentaje de hombres trabajadores y mujeres trabajadoras
		int porcentaje_hombres_trabajadores = trabaja_hombre*10;
		int porcentaje_mujeres_trabajadoras = trabaja_mujer*10;
		
		//muestro el porcentaje de hombres y mujeres que trabajan
		System.out.println ("\nEl porcentaje de hombres que trabajan es: " +df.format(porcentaje_hombres_trabajadores)+ "%");
		System.out.println("El porcentaje de mujeres que trabajan es: "+df.format(porcentaje_mujeres_trabajadoras)+ "%");
			
		
		
		//calculo del promedio del sueldo de trabajadores y trabajadoras
		int sueldo_promedio_hombres = sueldo_hombre/trabaja_hombre;
		int sueldo_promedio_mujeres = sueldo_mujer/trabaja_mujer;
		
		//muestro el promedio de sueldo de trabajadores y trabajadoras
		System.out.println ("\nEl sueldo promedio de los hombres que trabajan es: " +sueldo_promedio_hombres);
		System.out.println ("El sueldo promedio de las mujeres que trabajan es: " +sueldo_promedio_mujeres);	
	}	
}
