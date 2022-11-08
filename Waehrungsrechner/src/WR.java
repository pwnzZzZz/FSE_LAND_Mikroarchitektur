public abstract class WR implements IUmrechnen{
    private WR next;

    public double umrechnen(String variante, double betrag){
        if(zustaendig(variante)){
            return getFaktor()*betrag;
        }else if(this.next != null){
            return next.umrechnen(variante, betrag);
        }else{
            System.out.println("Es wurde kein passender WR gefunen!");
            return 0.0;
        }
    }

    public abstract double getFaktor();

    public abstract boolean zustaendig(String variante);


    public void setNext(WR next){
        this.next = next;
    }

}
