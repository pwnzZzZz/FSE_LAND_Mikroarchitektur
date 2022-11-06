/**
 * Der Observer (Beobachter) ist ein Entwurfsmuster welches zur Kategorie Verhaltensmuster zählt.
 * Dient zur Weitergabe von Änderungen an einem Objekt an von diesem Objekt abhängige Strukturen,
 * wird verwendet wenn (viele) andere Objekte ein Update bei Änderung eines bestimmten Objekts (Subjekt) benötigen
 */

public class Main {
    public static void main(String[] args) {

        //Erzeugt das Subjekt-Objekt welches sich um die Observer kümmert
        StockGrabber stockGrabber = new StockGrabber();

        //Erzeugt ein neues StockObserver-Objekt das Updates vom stockGrabber (Subjekt) erhält
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        //Erzeugt ein neues StockObserver-Objekt das Updates vom stockGrabber (Subjekt) erhält
        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(200.00);
        stockGrabber.setAAPLPrice(700.00);
        stockGrabber.setGOOGPrice(680.00);

        //Löscht den ersten Observer und somit
        //bekommt nur noch Observer2 die Benachrichtigungen
        stockGrabber.unregister(observer1);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);


    }
}
