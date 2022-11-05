/**
 * Die Template Method (Schablonenmethode) ist ein Entwurfsmuster welches zur Kategorie Verhaltensmuster zählt.
 * Hierbei wird in einer abstrakten Klasse die Template Methode erstellt, welche das Skelett eines Algorithmus definiert.
 * Die Template Methode enthält eine Reihe von Methodenaufrufen, die von jeder Subklasse aufgerufen werden.
 * Somit besteht die Möglichkeit, einzelne Schritte zu verändern bzw zu überschreiben.
 */
public class Main {
    public static void main(String[] args) {

        //Es wird ein neues ItalianHoagie Objekt erstellt und
        //die abstrakte Methode makeSandwich() aufgerufen
        Hoagie customerMeat = new ItalianHoagie();
        customerMeat.makeSandwich();

        System.out.println();

        //Es wird ein neues VeggieHoagie Objekt erstellt und
        //die abstrakte Methode makeSandwich() aufgerufen
        Hoagie customerVeggie = new VeggieHoagie();
        customerVeggie.makeSandwich();

    }
}
