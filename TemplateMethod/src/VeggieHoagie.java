public class VeggieHoagie extends Hoagie {
    String[] vegetablesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};


    /**
     * Die Methode der abstrakten Klasse wird überschrieben
     * @return
     */
    boolean customerWantsMeet() {
        return false;
    }

    /**
     * Die Methode der abstrakten Klasse wird überschrieben
     * @return
     */
    boolean customerWantsCheese() {
        return false;
    }

    /**
     * Muss mit leerem Body implementiert werden
     */
    @Override
    void addMeat() {

    }

    /**
     * Muss mit leerem Body implementiert werden
     */
    @Override
    void addCheese() {

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
