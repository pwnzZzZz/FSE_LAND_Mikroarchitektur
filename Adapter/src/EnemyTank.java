import java.util.Random;

public class EnemyTank implements EnemyAttacker{

    Random generator = new Random();

    /**
     * Es wird ein zufälliger Schadenwert zugefügt
     */
    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Tank Does " + attackDamage + " Damage");
    }

    /**
     * Fährt eine zufällige Anzahl an Feldern
     */
    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Tank Moves " + movement + " spaces");
    }

    /**
     * Weist dem Tank einen Fahrer zu
     * @param driverName String Fahrername
     */
    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }
}
