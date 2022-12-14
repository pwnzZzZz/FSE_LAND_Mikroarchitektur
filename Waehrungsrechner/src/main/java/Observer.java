public abstract class Observer {
    private WR wr;

    public Observer(WR wr){
        this.wr = wr;
    }

    public abstract void update();

    public String getString(){
        return wr.toString();
    }
}
