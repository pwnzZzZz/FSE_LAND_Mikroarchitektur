public class OldRobotBuilder implements RobotBuilder{
    private Robot robot;


    /**
     * Beim erstellen eines OldRobotBuilder wird gleichzeitig
     * ein neues Roboter-Objekt erstellt
     */
    public OldRobotBuilder(){
        this.robot = new Robot();
    }

    /**
     * Setzt den Kopf des Roboters
     */
    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller Skates");
    }

    /**
     * Das aktuelle Roboterobjekt wird zurückgegeben
     * @return Roboter-Objekt
     */
    public Robot getRobot(){
        return this.robot;
    }


}
