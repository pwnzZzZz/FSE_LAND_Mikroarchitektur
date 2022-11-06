/**
 * Der Builder (Erbauer) ist ein Entwurfsmuster welches zur Kategorie Erzeugunsmuster zählt.
 * Trennt die Konstruktion eines komplexen Objekts von seiner Repräsentation, so dass
 * derselbe Konstruktionsprozess unterschiedliche Repräsentationen erzeugen kann.
 * Verhindert lange (unubüersichtliche) Konstruktoren und hilft bei der Fehlervermeidung!
 */
public class Main {
    public static void main(String[] args) {

        //Erzeugt ein RobotBuilder Objekt vom Typ OldRobotBuilder
        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        //Erzeugt ein RobotEngineer Objekt und übergibt als Parameter den oldStyleRobot
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        //Ein neues Roboterobjekt wird vom robotEngineer erstellt
        robotEngineer.makeRobot();

        //Der zuvor erstellte Roboter wird einem Robot-Objekt zugewiesen
        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");
        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
        System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
        System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());

    }
}
