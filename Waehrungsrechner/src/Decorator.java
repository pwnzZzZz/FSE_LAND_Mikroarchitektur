public class Decorator extends WR{
    private WR wr;


    public Decorator(WR wr){
        this.wr = wr;
    }
    @Override
    public double getFaktor() {
        return wr.getFaktor();
    }

    @Override
    public boolean zustaendig(String variante) {
        return wr.zustaendig(variante);
    }

    public double umrechnen(String variante, double betrag){
        return wr.umrechnen(variante, betrag);
    }
}
