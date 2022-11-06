/**
 * By going this route I'll have to create a new subclass
 * for an infinite number of pizza.
 * I'd also have to change prices in many classes
 * when just 1 Pizza topping cost changes
 *
 * Inheritance is static while composition is dynamic
 * Through composition I'll be able to add new functionality
 * by writing new code rather than by changing current code
 */

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Mozzarella(new TomatoSauce(new PlainPizza()));

        System.out.println("Ingredients: " + pizza1.getDescription());
        System.out.println("Price: " + pizza1.getCost());

        Pizza pizza2 = new TomatoSauce(new Mozzarella(new Salami(new PlainPizza())));

        System.out.println("Ingredients: " + pizza2.getDescription());
        System.out.println("Price: " + pizza2.getCost());


    }
}
