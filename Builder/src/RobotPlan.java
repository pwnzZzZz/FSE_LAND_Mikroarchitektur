public interface RobotPlan {

    /**
     * Setzt den Namen für den Kopf des Roboters
     * @param head String Kopf
     */
    public void setRobotHead(String head);

    /**
     * Setzt den Namen für den Rumpf des Roboters
     * @param torso String Rumpf
     */
    public void setRobotTorso(String torso);

    /**
     * Setzt den Namen für dir Arme des Roboters
     * @param arms String Arme
     */
    public void setRobotArms(String arms);

    /**
     * Setzt den Namen für die Beine des Roboters
     * @param legs String Beine
     */
    public void setRobotLegs(String legs);

}
