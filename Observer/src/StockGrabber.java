import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    /**
     * Der Konstruktor erzeugt eine ArrayList, die Observer-Objekte speichert
     */
    public StockGrabber(){
        observers = new ArrayList<>();
    }

    /**
     * Das Observer-Objekt wird der ArrayList hinzugefügt
     * @param newObserver Observer-Objekt
     */
    @Override
    public void register(Observer newObserver) {

        observers.add(newObserver);

    }

    /**
     * Das Observer-Objekt wird aus der ArrayList entfernt
     * @param deleteObserver Observer-Objekt
     */
    @Override
    public void unregister(Observer deleteObserver) {

        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted");

        observers.remove(observerIndex);
    }

    /**
     * Iteriert durch die ArrayList und benachrichtigt
     * alle Observer über Preisänderungen
     */
    @Override
    public void notifyObserver() {

        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice){
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGoogPrice){
        this.googPrice = newGoogPrice;
        notifyObserver();
    }

}
