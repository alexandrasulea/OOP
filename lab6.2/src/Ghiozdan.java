public class Ghiozdan {
    Rechizita[] lista;
    static int nrRechizite = 0;

    public Ghiozdan() {
        lista = new Rechizita[100];
    }


    public void addCaiet(Caiet caiet) {
        lista[nrRechizite] = caiet;
        nrRechizite++;
    }

    public void addManual(Manual manual) {
        lista[nrRechizite++] = manual;
    }

    public void listItems() {
        for (int i = 0; i < nrRechizite; i++)
            if (lista[i] instanceof Caiet) {
                System.out.println("Caiet" + lista[i].getNume());
            } else {
                System.out.println(("Manual" + lista[i].getNume()));
            }
    }


    public void listeazaLista() {
        for (int i = 0; i < nrRechizite; i++) {
            if (lista[i] != null) {
                System.out.println((lista[i].getNume()));
            }
        }
    }

    public int getNrCaiete() {
        int nrCaiete = 0;
        for (int i = 0; i < nrRechizite; i++) {
            if (lista[i] instanceof Caiet) {
                nrCaiete++;
            }
        }
        System.out.println(("numarul de caiete este " + nrCaiete));
        return nrCaiete;
    }

    public int getNrManuale() {
        int nrManuale = 0;
        for (int i = 0; i < nrRechizite; i++) {
            if (lista[i] instanceof Manual) {
                nrManuale++;
            }
        }
        System.out.println("numarul de manuale este " + nrManuale);
        return nrManuale;
    }
}




