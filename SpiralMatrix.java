package spiralMatrix.com;

public class SpiralMatrix {
	public static void main(String[] args)  {

	        int n = 5;
	        
	        int count = 1;
	        int rowLast = n - 1;
	        int colLast = n - 1;
	        int rowFirst = 0;
	        int colFirst = 0;
	        int[][] matrix = new int[n][n];

	        while(rowFirst<=rowLast && colFirst <= colLast){

	            for(int i = colFirst; i <= colLast; i++){
	                matrix[rowFirst][i] = count;
	                count ++ ;
	            }
	            rowFirst ++ ;
	            
	            for(int i = rowFirst; i <= rowLast; i++){
	                matrix[i][colLast] = count;
	                count ++ ;
	            }
	         colLast -- ;

	            for(int i = colLast; i >= colFirst; i--){
	                matrix[rowLast][i] = count;
	                count ++ ;
	            }
	            rowLast -- ;

	            for(int i = rowLast; i >= rowFirst; i--){
	                matrix[i][colFirst] = count;
	                count ++ ;
	            }
	            colFirst ++ ;
	        }

	        for(int i = 0; i < n; i++){
	            for(int j = 0; j < n; j++){
	                System.out.print(matrix[i][j]);
	                System.out.print(" ");
	            }
	            System.out.println("");
	        }
	    }

}
