import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Spielwiese
 */
class Spielwiese {

    private List<Artikel> warenbestand;

    public Spielwiese() {
        warenbestand = new ArrayList<Artikel>();
        warenbestand.add(new Artikel(1, "Müsli", 1.82, 3.99));    
        warenbestand.add(new Artikel(2, "Hafermilch", 0.76, 1.39));    
        warenbestand.add(new Artikel(3, "Salami", 3.99, 4.59));    
    }

    public static void main(String[] args) {

        System.out.println("Spielwiese wird gestartet!");   
        Spielwiese spielwiese = new Spielwiese();
        spielwiese.start();    
    }

    public void start() {

        Iterator<Artikel> it = this.warenbestand.iterator();
        while (it.hasNext()) {
            Artikel artikel = it.next();
            System.out.println("------------------------------------");
            System.out.println("Artikelnummer: " + artikel.getArtikelnummer());
            System.out.println("Artikel:       " + artikel.getArtikelbezeichnung());
            System.out.println("Bestand:       " + artikel.getBestand()); 
        }
    }
}
