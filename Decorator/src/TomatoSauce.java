public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
    }

    public String getDescription(){
        return super.getDescription() + ", Tomato Sauce";
    }

    public double getCost(){
        return super.getCost() + 0.35;
    }

}
