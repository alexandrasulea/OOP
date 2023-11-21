public class MatriceNumere {
    NumereComplexe[][] matrice;

    public MatriceNumere( int linii, int coloane)
    {
        matrice=new NumereComplexe[linii][coloane];
    }
    public MatriceNumere adunare(MatriceNumere a)
    {   int linii=matrice.length;
        int coloane=matrice[0].length;
        MatriceNumere rez=new MatriceNumere(linii,coloane);
        for( int i=0; i<linii;i++)
        {
            for (int j=0; j<coloane; j++)
            {
                rez.matrice[i][j] = matrice[i][j].adunare(a.matrice[i][j]);


            }
        }
        return rez;
    }
    public MatriceNumere scadere(MatriceNumere a)
    {   int linii=matrice.length;
        int coloane=matrice[0].length;
        MatriceNumere rez=new MatriceNumere(linii,coloane);
        for( int i=0; i<linii;i++)
        {
            for (int j=0; j<coloane; j++)
            {
                rez.matrice[i][j] = matrice[i][j].scadere(a.matrice[i][j]);


            }
        }
        return rez;
    }
    public MatriceNumere inmultire(MatriceNumere a)
    {   int linii=matrice.length;
        int coloane=matrice[0].length;
        MatriceNumere rez=new MatriceNumere(linii,coloane);
        for( int i=0; i<linii;i++)
        {
            for (int j=0; j<coloane; j++)
            {
                rez.matrice[i][j] = matrice[i][j].inmultire(a.matrice[i][j]);


            }
        }
        return rez;
    }
    public MatriceNumere inmultireScalar(int x)
    {   int linii=matrice.length;
        int coloane=matrice[0].length;
        MatriceNumere rez=new MatriceNumere(linii,coloane);
        for( int i=0; i<linii;i++)
        {
            for (int j=0; j<coloane; j++)
            {
                rez.matrice[i][j] = matrice[i][j].inmultireScalar(x);


            }
        }
        return rez;
    }
}