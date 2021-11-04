import java.util.Scanner;
import java.util.Random;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz [][] = new int [5][5];
		Random aleatorio = new Random();
		int fila, col, azar = 0;
		int opcion = 0;
		
		//Llenar matriz de 5x5, valores del 1 al 100 aleatorios.
		for (fila = 0; fila < 5; fila++) {
			for (col = 0; col < 5; col++) {
				azar = 1+(int)(aleatorio.nextDouble()*100);
				matriz[fila][col] = azar;
				System.out.print(matriz[fila][col]+"  ");
			}
			System.out.println("");
		}
		
		
		//Procedemos a crear un men�u de opciones que llamar a diferentes metodos cada opcion hasta que el usuario introduzca la opcion de salir.
		do {
			System.out.println();
			System.out.println("Introduce una de las opciones del menu: ");
			System.out.println("1.Suma de una fila concreta");
			System.out.println("2.Suma de una columna concreta");
			System.out.println("3.Maximo valor y posicion de una fila concreta");
			System.out.println("4.Minimo valor y posicion de una columna concreta");
			System.out.println("5.Sumar la diagonal principal");
			System.out.println("6.Sumar la diagonal secundaria");
			System.out.println("7.Media de los valores de la matriz");
			System.out.println("8.Salir");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				do {
					System.out.println("Introduce la fila a sumar: ");
					fila = sc.nextInt();
				}while(fila < 0 || fila > 5);
				sumaFila(fila, matriz);
				break;
				
			case 2:
				do {
					System.out.println("Introduce la columna a sumar: ");
					col = sc.nextInt();
				}while(col < 0 || col > 5);
				sumaColumna(col, matriz);
				break;
				
			case 3:
				do {
					System.out.println("Introduce la fila para coger su valor maximo y posicion: ");
					fila = sc.nextInt();
				}while(fila < 0 || fila > 5);
				maxValor(fila, matriz);
				//maxMatriz(matriz);
				break;
				
			case 4:
				do {
					System.out.println("Introduce la columna para coger su valor minimo y posicion: ");
					col = sc.nextInt();
				}while(col < 0 || col > 5);
				minValor(col, matriz);
				break;
				
			case 5:
				sumaPrincipal(matriz);
				break;
				
			case 6:
				sumaSecundaria(matriz);
				break;
				
			case 7:
				mediaMatriz(matriz);
				break;
			}
		
		}while(opcion!=8);
		System.out.println("Has salido.");	
	}
	
	
	//Metodo para calcular la suma de los valores de una fila concreta.
	public static void sumaFila(int fila, int[][] matriz) {
		int acum = 0, col;
		System.out.println("Metodo para sumar la fila " +fila);
		
		for(col = 0; col < 5; col++) {
			acum+=matriz[fila][col];
		}
		System.out.println("La suma de la fila " +fila+ " es: " +acum);
	}

	
	//Metodo para calcular la suma de los valores de una columna concreta.
	public static void sumaColumna(int col, int[][] matriz) {
		int acum = 0, fila;
		System.out.println("Metodo para sumar la columna " +col);
		
		for(fila = 0; fila < 5; fila++) {
			acum+=matriz[fila][col];
		}
		System.out.println("La suma de la columna " +col+ " es: " +acum);
	}
	
	
	//Metodo para buscar el maximo valor de una fila concreta y coger su posicion.
	public static void maxValor(int fila, int[][] matriz) {
		int max = 0, colmax = 0, col;
		
		for (col = 0; col < 5; col++) {
			if (matriz[fila][col] > max) {
				max = matriz[fila][col];
				colmax = col;
			}
		}
		System.out.println("El valor maximo de la fila " +fila+ " es: " +max+ " y su posicion es: " +colmax);
	}
	
	
	//Metodo para buscar el minimo valor de una columna concreta y coger su posicion.
	public static void minValor(int col, int[][] matriz) {
		int min = 100, filamin = 0, fila;
		
		for (fila = 0; fila < 5; fila++) {
			if (matriz[fila][col] < min) {
				min = matriz[fila][col];
				filamin = min;
			}
		}
		System.out.println("El valor minimo de la columna " +col+ " es: " +min+ " y su posicion es: " +filamin);
	}
	
	
	//Metodo para buscar el valor maximo de toda la matriz y coger su posicion en la fila y en la columna.
	public static void maxMatriz(int [][] matriz) {
		int max = 0, filamax = 0, colmax = 0, col, fila;
		
		for (col = 0; col < 5; col++) {
			for (fila = 0; fila < 5; fila++) {
				if (matriz[fila][col] > max) {
					max = matriz[fila][col];
					filamax = fila;
					colmax = col;
				}
			}
		}
		System.out.println("El valor maximo de la matriz es: " +max+ " y su posicion es, en la fila: " +filamax+ " y en la columna: " +colmax);
	}
	
	
	//Metodo para hacer la suma de los valores de la diagonal principal de la matriz.
	public static void sumaPrincipal(int [][] matriz) {
	int acumulador = 0, fila;
	
		for (fila = 0; fila < 5; fila++) {
			acumulador+=matriz[fila][fila];
		}
	System.out.println("La suma total de la diagonal principal es: " +acumulador);
	}
	
	
	//Metodo para calcular la suma de los valores de la diagonal secundaria de la matriz
	public static void sumaSecundaria(int [][] matriz) {
	int acumulador = 0, fila;
		
		for (fila = 4; fila > 0; fila--) {
			acumulador+=matriz[fila][fila];
		}
	System.out.println("La suma total de la diagonal secundaria es: " +acumulador);
	}
	
	
	//Metodo para calcular la media de todos los valores de la matriz.
	public static void mediaMatriz(int [][] matriz) {
		int acumulador = 0, contador = 0, fila, col, media;
		
		for (fila = 0; fila < 5; fila++) {
			for (col = 0; col < 5; col++) {
				acumulador+=matriz[fila][col];
				contador++;
			}
		}
		media = acumulador / contador;
		System.out.println("La media de los valores de la matriz es: " +media);
	}
}
