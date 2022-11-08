public class EUR2YEN extends WR{
    double faktor = 146.30;
    String var = "yen";


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
