import java.util.Random;

public class Ejercicio3 {
	public static void main(String[] args) {
		int matriz1 [][] = new int [3][3];
		int matriz2 [][] = new int [3][3];
		int suma [][] = new int [3][3];
		Random aleatorio = new Random();
		int azar = 0;
		
		
		//Relleno la matriz con numeros aleatorios
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//Los numeros aleatorios se llenan de -10 a 10 (es decir, 20 numeros diferentes)
				azar = -10+(int)(aleatorio.nextDouble()*20);
				matriz1[i][j] = azar;
				matriz2[i][j] = azar;
				//Calculo de la suma de las dos matrices
				suma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
			
		}
		
	//Visualizo la matriz 1	
	System.out.println("Matriz 1");
	visualizarMatriz(matriz1);
	System.out.println("\n   +   \n");
	
	//Visualizo la matriz 2
	System.out.println("Matriz 2");
	visualizarMatriz(matriz2);
	System.out.println("\n   =   \n");
	
	//Visualizo la suma de las matrices
	System.out.println("Resultado");
	visualizarMatriz(suma);
	}
	
	//Metodo para visualizar las matrices
	public static void visualizarMatriz(int [][] mat){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j]+ "   ");
			}
			System.out.println(" ");
		}
	}
}
