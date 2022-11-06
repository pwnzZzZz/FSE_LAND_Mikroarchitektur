public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Mozzarella");
    }

    public String getDescription(){
        return super.getDescription() + ", Mozzarella";
    }

    public double getCost(){
        return super.getCost() + 0.50;
    }

}
