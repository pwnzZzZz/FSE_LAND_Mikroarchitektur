public abstract class Hoagie {
    boolean isNextStep = false;
    final void makeSandwich(){
        cutBun();

        if(customerWantsMeet()){
            addMeat();
        }
        if(customerWantsCheese()){
            addCheese();
        }
        if(customerWantsVegetables()){
            addVegetables();
        }
        if(customerWantsCondiments()){
            addCondiments();
        }

        wrapTheHoagie();
    }

    public void cutBun(){
        System.out.println("The Hoagie is cut");
    }
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();

    boolean customerWantsMeet(){return true;}
    boolean customerWantsCheese(){return true;}
    boolean customerWantsVegetables(){return true;}
    boolean customerWantsCondiments(){return true;}

    public void wrapTheHoagie(){
        System.out.println("Wrap the Hoagie");
    }

}
