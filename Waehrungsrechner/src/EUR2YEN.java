public class EUR2YEN extends WR{
    private double faktor = 146.30;
    private String var = "Yen";


    @Override
    public void setFaktor(double faktor) {
        this.faktor = faktor;
    }

    @Override
    public double getFaktor() {
        return faktor;
    }

    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(var)){
            return true;
        }else{
            return false;
        }
    }



}
