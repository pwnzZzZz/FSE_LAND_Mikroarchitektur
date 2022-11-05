/**
 * Die Chain of Responsibility (Zuständikgeitskette) ist ein Entwurfsmuster welches zur Kategorie Verhaltensmuster zählt.
 * Hierbei werden mehrere Objekte hintereinander geschaltet und die Anfrage wird sequentiell weitergeleitet,
 * bis eines der Objekte die Anfrage bearbeiten kann.
 */

public class Main {
    public static void main(String[] args) {

        //Es werden Objekte der jeweiligen Rechenarten erstellt und dem jeweiligen Chain Objekt zugewiesen
        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new DivideNumbers();
        Chain chainCalc4 = new MultiplyNumbers();

        //Die Reihenfolge der Zuständigkeitskette wird gesetzt
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        //Erstellt ein neues Numbers Objekt, nimmt 2 Zahlen entgegen und führt die gewünschte Berechnung durch
        Numbers request = new Numbers(5, 3,"add");

        chainCalc1.calculate(request);



    }
}
