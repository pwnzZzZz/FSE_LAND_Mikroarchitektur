public class DecoratorGebuehrenProzent extends Decorator{
    public DecoratorGebuehrenProzent(WR wr) {
        super(wr);
    }

    public double umrechnen(String variante, double betrag){
        return ((super.umrechnen(variante, betrag) * 0.5)/100) + super.umrechnen(variante, betrag);
    }

    @Override
    public void setFaktor(double faktor) {
        this.setFaktor(faktor);
    }


}
