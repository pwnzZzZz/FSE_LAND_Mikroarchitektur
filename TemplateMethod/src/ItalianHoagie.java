public class ItalianHoagie extends Hoagie {
    String[] meatsUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] vegetablesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    /**
     * Ausimplementierung der abstrakten Methoden
     * Es werden mit einer for-Schleife alle Zutaten ausgegeben
     */
    @Override
    void addMeat() {
        System.out.print("Adding the Meat: ");
        for (String meat : meatsUsed) {
            System.out.print(meat + " ");
        }
    }

    /**
     * Ausimplementierung der abstrakten Methoden
     * Es werden mit einer for-Schleife alle Zutaten ausgegeben
     */
    @Override
    void addCheese() {
        System.out.print("Adding the Cheese: ");
        for (String cheese : cheeseUsed) {
            System.out.print(cheese + " ");
        }
    }

    /**
     * Ausimplementierung der abstrakten Methoden
     * Es werden mit einer for-Schleife alle Zutaten ausgegeben
     */
    @Override
    void addVegetables() {
        System.out.print("Adding the Vegetables: ");
        for (String vegetables : vegetablesUsed) {
            System.out.print(vegetables + " ");
        }
    }

    /**
     * Ausimplementierung der abstrakten Methoden
     * Es werden mit einer for-Schleife alle Zutaten ausgegeben
     */
    @Override
    void addCondiments() {
        System.out.print("Adding the Condiments: ");
        for (String condiments : condimentsUsed) {
            System.out.print(condiments + " ");
        }
    }
}
