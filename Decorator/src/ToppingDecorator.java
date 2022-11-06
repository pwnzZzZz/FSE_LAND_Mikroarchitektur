/**
 * Dient als Mutterklasse für alle weiteren Dekorierer
 */
public abstract class ToppingDecorator implements Pizza {

    private Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza){

        tempPizza = newPizza;

    }

    /**
     * Die Methode wird in der Subklassen
     * erweitert
     * @return Beschreibung der Pizza
     */
    public String getDescription(){
        return tempPizza.getDescription();
    }

    /**
     * Die Methode wird in der Suklasse
     * erweitert
     * @return Kosten der Pizza
     */
    public double getCost(){
        return tempPizza.getCost();
    }

}
