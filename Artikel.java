
/**
 * Beschreiben Sie hier die Klasse Artikel.
 * 
 * @author Klaus Ritter
 * @version 1
 */
public class Artikel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int artikelnummer;
    private String artikelbezeichnung;
    private double einkaufspreis;
    private double verkaufspreis;
    private int bestand;
    private Kategorie kategorie;

    /**
     * Konstruktor für Objekte der Klasse Artikel
     */
    public Artikel(int artnr, String artbez, double ek, double vk)
    {
        artikelnummer = artnr;
        artikelbezeichnung = artbez;
        einkaufspreis = ek;
        verkaufspreis = vk;
        bestand = 1;
    }

    /**
     * 
     */
    public int getArtikelnummer()
    {
        return artikelnummer;
    }
    
    /**
     * 
     */
    public String getArtikelbezeichnung()
    {
        return artikelbezeichnung;
    }
    
    /**
     * 
     */
    public int getBestand()
    {
        return bestand;
    }
}
