import java.util.Random;

public class EnemyRobot {
    Random generator = new Random();
    /**
     * Es wird ein zufälliger Schadenwert zugefügt
     */
    public void smashWithHands(){
        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");
    }
    /**
     * Bewegt sich um eine zufällige Anzahl an Feldern
     */
    public void walkForward(){
        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");
    }

    /**
     * Reagiert auf die Person
     * @param driverName String Name Person
     */
    public void reactToHuman(String driverName){
        System.out.println("Enemy Robot Tramps On " + driverName);

    }

}
