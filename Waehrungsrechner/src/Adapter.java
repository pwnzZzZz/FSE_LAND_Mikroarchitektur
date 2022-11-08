public class Adapter implements ISammelumrechnung{
    private WR wr;

    public Adapter(WR wr){
        this.wr = wr;
    }
    @Override
    public double sammelumrechnen(double[] betraege, String variante) {
        double summe = 0;
        for(double betrag : betraege){
            summe += betrag;
        }
        return wr.umrechnen(variante, summe);
    }
}
