public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;


    /**
     * Beim erstellen eines OldRobotBuilder wird gleichzeitig
     * ein neues Roboter-Objekt erstellt
     */
    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    /**
     * Setzt den Kopf des Roboters
     */
    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    /**
     * Setzt den Rumpf des Roboters
     */
    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    /**
     * Setzt die Arme des Roboters
     */
    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch Arms");
    }

    /**
     * Setzt die Beine des Roboters
     */
    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller Skates");
    }

    /**
     * Das aktuelle Roboterobjekt wird zurückgegeben
     *
     * @return Roboter-Objekt
     */
    public Robot getRobot() {
        return this.robot;
    }


}
