public class DecoratorGebuehrenFix extends Decorator{
    public DecoratorGebuehrenFix(WR wr) {
        super(wr);
    }

    public double umrechnen(String variante, double betrag){
        return super.umrechnen(variante, betrag) + 5.0;
    }
    @Override
    public void setFaktor(double faktor) {
        this.setFaktor(faktor);
    }

}
