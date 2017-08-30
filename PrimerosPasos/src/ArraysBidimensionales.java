//===============================
// Tutorial de Java YouTube
// CLASE: ArraysBidimensionales
// Video 25
//===============================
public class ArraysBidimensionales {

	public static void main(String[] args) {
		int[][] matrix = new int[4][5];
		
		matrix[0][0] = 34;
		matrix[0][1] = 12;
		matrix[0][2] = 87;
		matrix[0][3] = 94;
		matrix[0][4] = 21;
		
		matrix[1][0] = 64;
		matrix[1][1] = 85;
		matrix[1][2] = 47;
		matrix[1][3] = 27;
		matrix[1][4] = 83;
		
		matrix[2][0] = 3;
		matrix[2][1] = 76;
		matrix[2][2] = 18;
		matrix[2][3] = 6;
		matrix[2][4] = 61;
		
		matrix[3][0] = 88;
		matrix[3][1] = 23;
		matrix[3][2] = 81;
		matrix[3][3] = 45;
		matrix[3][4] = 0;
		
		System.out.println("Valor almacenado en la posición 2-3 " + matrix[2][3]);
		
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				if(j == 4){
					System.out.println(" " + matrix[i][j]);
				}else{
					System.out.print(" " + matrix[i][j]);
				}
				//System.out.println("Valor almacenado en la posición " + i + "-" + j + " " + matrix[i][j]);
			}
		}
	}

}
