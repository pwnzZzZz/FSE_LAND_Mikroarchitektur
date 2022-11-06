/**
 * Der Observer (Beobachter) ist ein Entwurfsmuster welches zur Kategorie Verhaltensmuster zählt.
 * Dient zur Weitergabe von Änderungen an einem Objekt an von diesem Objekt abhängige Strukturen,
 * wird verwendet wenn (viele) andere Objekte ein Update bei Änderung eines bestimmten Objekts (Subjekt) benötigen
 */

public class Main {
    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        stockGrabber.unregister(observer1);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);


    }
}
