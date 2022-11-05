public interface Chain {
    /**
     *  Das nächste Glied in der Zuständigkeitskette wird gesetzt
     */
    public void setNextChain(Chain nextChain);


    /**
     * Berechnet die Integer Werte mit der im Request enthaltenen Methode.
     *
     * @param request - Numbers Objekt
     */
    public void calculate(Numbers request);
}
