
public class Main {
    public static void main(String[] args) {

        MatriceNumere n1 = new MatriceNumere(2, 2);
        MatriceNumere n2 = new MatriceNumere(2, 2);


        int linii = n1.matrice.length;
        int coloane = n1.matrice[0].length;
        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                NumereComplexe nr = new NumereComplexe(i + 1, j + 1);
                n1.matrice[i][j] = nr;
            }
        }
        n2 = n1;
      /* n2= n2.adunare(n1);
        for(int i=0;i<linii;i++)
        {
            for(int j=0;j<coloane;j++)
            {
                System.out.print(n1.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }
        for(int i=0;i<linii;i++)
        {
            for(int j=0;j<coloane;j++)
            {
                System.out.print(n2.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }*/
       /* n2= n2.scadere(n1);
        for(int i=0;i<linii;i++)
        {
            for(int j=0;j<coloane;j++)
            {
                System.out.print(n1.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }
        for(int i=0;i<linii;i++)
        {
            for(int j=0;j<coloane;j++)
            {
                System.out.print(n2.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }


    }
    */
        n2 = n2.inmultire(n1);
        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                System.out.print(n1.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                System.out.print(n2.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
