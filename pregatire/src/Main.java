import java.awt.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rezervor rezervor=new Rezervor( 45, 9);
        Sofer conducator= new Sofer("Alexandra",29,44);
        Autovehicul masina = new Autovehicul("audi", Color.PINK, 80, 130, 3, 5,conducator, rezervor);
        masina.accelerare(30);
        System.out.println(masina);
        masina.decelerare(20);
        System.out.println(masina);
        masina.trepteViteza(2);
        System.out.println(masina);
        masina.oprire();
        System.out.println(masina);




    }
}