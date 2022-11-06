public class Salami extends ToppingDecorator{
    public Salami(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Salami");
    }


    public String getDescription(){
        return super.getDescription() + ", Salami";
    }

    public double getCost(){
        return super.getCost() + 1.10;
    }

}
