public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    /**
     *
     * @return Robot-Objekt des aktuellen RobotBuilders
     */
    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }

    /**
     * Es wird über den RobotBuilder ein neuer
     * Roboter zusammengebaut
     */
    public void makeRobot(){
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }

}
