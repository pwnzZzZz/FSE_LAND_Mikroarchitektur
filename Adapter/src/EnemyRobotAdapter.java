/**
 * Der Adapter dient als Schnittstelle zwischen
 * Enemy Roboter und EnemyTank
 */
public class EnemyRobotAdapter implements EnemyAttacker{
    EnemyRobot theRobot;

    /**
     * Erzeugt ein neues EnemyRobotAdapter-Objekt
     * und weist dem Datenfeld EnemyRobot ein bereits
     * erstelltes EnemyRobot-Objekt zu
     * @param newRobot Objekt vom Typ EnemyRobot
     */
    public EnemyRobotAdapter(EnemyRobot newRobot){
        theRobot = newRobot;
    }

    /**
     * Erklärt dem Roboter was zu tun ist, wenn die Methode
     * fireWeapon (vom Interface EnemyAttacker) aufgerufen wird
     */
    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    /**
     * Erklärt dem Roboter was zu tun ist, wenn die Methode
     * driveForward (vom Interface EnemyAttacker) aufgerufen wird
     */
    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    /**
     * Erklärt dem Roboter was zu tun ist, wenn die Methode
     * assignDriver (vom Interface EnemyAttacker) aufgerufen wird
     */
    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }
}
