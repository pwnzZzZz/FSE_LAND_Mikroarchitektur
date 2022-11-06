/**
 * Der Decorator (Dekorierer) ist ein Entwurfsmuster welches zur Kategorie Strukturmuster zählt.
 * Das Muster ist eine flexible Alternative zur Unterklassenbildung, um eine Klasse um zusätzliche
 * Funktionalitäten zu erweitern Der Aufrufer bekommt nicht mit, dass ein Dekorierer vorgeschaltet ist.
 */

public class Main {
    public static void main(String[] args) {

        //Es wird ein neues Pizza-Objekt erstellt und die Preise und Zutateten
        //werden über den super-Aufruf  an den Decorator weitergegeben
        Pizza pizza1 = new Mozzarella(new TomatoSauce(new PlainPizza()));

        System.out.println("Ingredients: " + pizza1.getDescription());
        System.out.println("Price: " + pizza1.getCost());


        //Es wird ein neues Pizza-Objekt erstellt und die Preise und Zutateten
        //werden über den super-Aufruf an den Decorator weitergegeben
        Pizza pizza2 = new Salami(new Mozzarella(new TomatoSauce(new PlainPizza())));

        System.out.println("Ingredients: " + pizza2.getDescription());
        System.out.println("Price: " + pizza2.getCost());


    }
}
