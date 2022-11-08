public class EURO2Dollar extends WR {
    private double faktor = 1.10;
    private String var = "dollar";

    @Override
    public double getFaktor() {
        return faktor;
    }

    @Override
    public boolean zustaendig(String variante) {
        if (variante.equalsIgnoreCase(var)) {
            return true;
        } else {
            return false;
        }
    }

    public void setFaktor(double faktor){
        this.faktor = faktor;
    }

    public static class Builder{
        private double fak;
        private WR wr;

        public Builder(){

        }

        public Builder setFaktor(double fak){
            this.fak = fak;
            return this;
        }

        public Builder setWR(WR wr){
            this.wr = wr;
            return this;
        }

        public WR build(){
            WR wr = new EURO2Dollar();
            wr.setFaktor(this.fak);
            wr.setNext(this.wr);

            return wr;
        }

    }
}
