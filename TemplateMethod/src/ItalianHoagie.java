public class ItalianHoagie extends Hoagie{
    String[] meatsUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] vegetablesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};
    @Override
    void addMeat() {
        System.out.println("Adding the meat:");
        for(String meat : meatsUsed){
            System.out.print(meat + " ");
        }
    }

    @Override
    void addCheese() {
        System.out.println("Adding the cheese:");
        for(String cheese : cheeseUsed){
            System.out.print(cheese + " ");
        }
    }

    @Override
    void addVegetables() {
        System.out.println("Adding the Vegetables:");
        for(String vegetables : vegetablesUsed){
            System.out.print(vegetables + " ");
        }
    }

    @Override
    void addCondiments() {
        System.out.println("Adding the Condiments:");
        for(String condiments : condimentsUsed){
            System.out.print(condiments + " ");
        }
    }
}
