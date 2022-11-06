/**
 * Der Adapter ist ein Entwurfsmuster welches zur Kategorie Entwurfsmuster zählt.
 * Er dient zur Übersetzung einer Schnittstelle in eine andere und ermöglicht somit
 * die Kommunikation von Klassen mit ansonsten inkompatiblen Schnittstellen
 */

public class Main {
    public static void main(String[] args) {

        //Es wird eine neues Tank-Objekt erzeugt
        EnemyTank bigTank = new EnemyTank();

        //Es wird ein neues Roboter-Objekt erzeugt
        EnemyRobot geraldTheRobot = new EnemyRobot();

        //Es wird ein neues EnemyAttacker Objekt vom Typ EnemyRobotAdapter erzeugt
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(geraldTheRobot);

        System.out.println("The Robot");
        geraldTheRobot.reactToHuman("Paul");
        geraldTheRobot.walkForward();
        geraldTheRobot.smashWithHands();

        System.out.println("The Enemy Tank");
        bigTank.assignDriver("Frank");
        bigTank.driveForward();
        bigTank.fireWeapon();


        /**
         * Der Roboter versteht nun über den Adapter
         * die Methoden des Tanks und kann diese verarbeiten
         */
        System.out.println("The Robot with Adapter");
        robotAdapter.assignDriver("Marcel");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
