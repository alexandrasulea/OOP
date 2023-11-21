package lab5;

public class MatriceComplexa {
      NumarComplex[][] matrice;
      
      MatriceComplexa( int rows, int cols){
      matrice=new NumarComplex[rows][cols];
      

}
      NumarComplex[][] add(MatriceComplexa a) {
    	  int rows=matrice.length;
    	  int cols=matrice[0].length;
    	  MatriceComplexa rez= new MatriceComplexa(rows, cols);
    	  for(int i=0;i<rows;i++)
    	  {
    		  for(int j=0;j<cols;j++)
    		  {
    			  
				rez.matrice[i][j]=matrice[i][j].adunare(a.matrice[i][j]);
    		  }
    	  }
    	  return matrice;
      }
      NumarComplex[][] scadere(MatriceComplexa a) {
    	  int rows=matrice.length;
    	  int cols=matrice[0].length;
    	  MatriceComplexa rez= new MatriceComplexa(rows, cols);
    	  for(int i=0;i<rows;i++)
    	  {
    		  for(int j=0;j<cols;j++)
    		  {
    			  
				rez.matrice[i][j]=matrice[i][j].scadere(a.matrice[i][j]);
    		  }
    	  }
    	  return matrice;
      }
      NumarComplex[][] inmultire(MatriceComplexa a) {
    	  int rows=matrice.length;
    	  int cols=matrice[0].length;
    	  MatriceComplexa rez= new MatriceComplexa(rows, cols);
    	  for(int i=0;i<rows;i++)
    	  {
    		  for(int j=0;j<cols;j++)
    		  {
    			  
				rez.matrice[i][j]=matrice[i][j].inmultire(a.matrice[i][j]);
    		  }
    	  }
    	  return matrice;
      }
      NumarComplex[][] inmultireScalar(MatriceComplexa a) {
    	  int rows=matrice.length;
    	  int cols=matrice[0].length;
    	  MatriceComplexa rez= new MatriceComplexa(rows, cols);
    	  for(int i=0;i<rows;i++)
    	  {
    		  for(int j=0;j<cols;j++)
    		  {
    			  
				rez.matrice[i][j]=matrice[i][j].inmultireScalar(a);
    		  }
    	  }
    	  return matrice;
      }
     
      
}
