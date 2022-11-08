public class EURO2Dollar extends WR{
    double faktor = 1.10;
    String var = "dollar";
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
