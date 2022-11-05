public abstract class Hoagie {
    boolean isNextStep = false;

    /**
     * Die Template Methode, ist final damit die Subklassen nicht den
     * Algorithmus verändern können.
     * Die abstrakten Methoden werden in den Subklassen ausimplementiert.
     */
    final void makeSandwich() {
        cutBun();

        if (customerWantsMeet()) {
            addMeat();
            isNextStep = true;
        }
        if (customerWantsCheese()) {
            if (isNextStep) {
                System.out.println();
            }
            addCheese();
            isNextStep = true;
        }
        if (customerWantsVegetables()) {
            if (isNextStep) {
                System.out.println();
            }
            addVegetables();
            isNextStep = true;
        }
        if (customerWantsCondiments()) {
            if (isNextStep) {
                System.out.println();
            }
            addCondiments();
            isNextStep = true;
        }

        wrapTheHoagie();
    }

    public void cutBun() {
        System.out.println("The Hoagie is cut");
    }

    abstract void addMeat();

    abstract void addCheese();

    abstract void addVegetables();

    abstract void addCondiments();

    boolean customerWantsMeet() {
        return true;
    }

    boolean customerWantsCheese() {
        return true;
    }

    boolean customerWantsVegetables() {
        return true;
    }

    boolean customerWantsCondiments() {
        return true;
    }

    public void wrapTheHoagie() {
        System.out.println("Wrap the Hoagie");
    }

}
