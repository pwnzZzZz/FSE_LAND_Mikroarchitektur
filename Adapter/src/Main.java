public class Main {
    public static void main(String[] args) {

        EnemyTank bigTank = new EnemyTank();

        EnemyRobot geraldTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(geraldTheRobot);

        System.out.println("The Robot");

        geraldTheRobot.reactToHuman("Paul");
        geraldTheRobot.walkForward();
        geraldTheRobot.smashWithHands();

        System.out.println("The Enemy Tank");

        bigTank.assignDriver("Frank");
        bigTank.driveForward();
        bigTank.fireWeapon();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Marcel");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
