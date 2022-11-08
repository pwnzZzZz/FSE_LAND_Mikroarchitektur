import java.util.ArrayList;

public abstract class WR implements IUmrechnen {
    private WR next;
    private ArrayList<Observer> observers = new ArrayList<>();
    private double ausgangsBetrag;
    private final String ausgansWaehrung = "Euro";
    private String zielWaehrung;


    private double zielBetrag;

    public void setAusgangsBetrag(double ausgangsBetrag) {
        this.ausgangsBetrag = ausgangsBetrag;
    }

    public void setZielBetrag(double zielBetrag) {
        this.zielBetrag = zielBetrag;
    }

    public void setZielWaehrung(String zielWaehrung) {
        this.zielWaehrung = zielWaehrung;
    }


    public double umrechnen(String variante, double betrag){
        if(zustaendig(variante)){
            setZielWaehrung(variante);
            setAusgangsBetrag(betrag);
            setZielBetrag(getFaktor()*betrag);
            notifyAllObservers();
            return getFaktor()*betrag;
        }else if(this.next != null){
            return next.umrechnen(variante, betrag);
        }else{
            System.out.println("Es wurde kein passender WR gefunden!");
            return 0.0;
        }
    }
    public abstract void setFaktor(double faktor);
    public abstract double getFaktor();

    public abstract boolean zustaendig(String variante);


    public void setNext(WR next){
        this.next = next;
    }

    public void registerObserver(Observer o){
        this.observers.add(o);
    }

    public void unregisterObserver(Observer o){
        this.observers.remove(o);
    }

    public void notifyAllObservers(){
        for(Observer o : observers){
            o.update();
        }
    }

    @Override
    public String toString() {
        return "Ausgangsbetrag: " + ausgangsBetrag +
                "\nAusganswaehrung: " + ausgansWaehrung  +
                "\nZielwaehrung: " + zielWaehrung +
                "\nZielbetrag: " + zielBetrag;
    }

}
