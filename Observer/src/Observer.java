/**
 * Interface für alle Observer
 * Die Observer update Methode wird immer aufgerufen, wenn das Subject sich ändert
 */
public interface Observer {
    public void update(double ibmPrice, double aaplPrice, double googPrice);
}
