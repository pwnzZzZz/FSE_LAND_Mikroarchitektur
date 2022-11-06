public abstract class ToppingDecorator implements Pizza {

    private Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza){

        tempPizza = newPizza;

    }

    public String getDescription(){
        return tempPizza.getDescription();
    }

    public double getCost(){
        return tempPizza.getCost();
    }

}
