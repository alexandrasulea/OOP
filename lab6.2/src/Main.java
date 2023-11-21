// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan();
        Caiet Caiet1 =new Caiet("romana");
        Caiet Caiet2 =new Caiet("matematica");
        Manual Manual1=new Manual("engleza");
        Manual Manual2=new Manual("sport");
        Manual Manual3=new Manual("geografie");



        ghiozdan.addCaiet(Caiet1);
        ghiozdan.addCaiet(Caiet2);
        ghiozdan.addManual(Manual1);
        ghiozdan.addManual(Manual2);
        ghiozdan.addManual(Manual3);
        ghiozdan.listeazaLista();
        ghiozdan.getNrCaiete();
        ghiozdan.getNrManuale();


    }
}


