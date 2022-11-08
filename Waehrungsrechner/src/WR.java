public abstract class WR implements IUmrechnen{
    private WR next;

    public double umrechnen(String variante, double betrag){
        if(zustaendig(variante)){
            return getFaktor()*betrag;
        }else{
            return next.umrechnen(variante, betrag);
        }
    }

    public abstract double getFaktor();

    public abstract boolean zustaendig(String variante);


    public void setNext(WR next){
        this.next = next;
    }

}
