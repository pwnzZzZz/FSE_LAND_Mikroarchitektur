/**
 * Diese Klasse erstellt die Observer, welche die
 * Änderungen im Subject überwachen
 */
public class StockObserver implements Observer{
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    //counter
    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;

        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);
    }


    /**
     * Diese Methode updatet alle Observer
     * @param ibmPrice double IBM Preis
     * @param aaplPrice double Apple Preis
     * @param googPrice double Google Preis
     */
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    public void printThePrices(){
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
    }
}
