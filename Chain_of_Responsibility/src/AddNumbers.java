public class AddNumbers implements Chain {
    private Chain nextInChain;

    /**
     * Das nächste Glied in der Zuständigkeitskette wird gesetzt
     *
     * @param nextChain Nöchstes Glied in der Zuständigkeitskette
     */
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    /**
     * Führt wenn möglich die Berechnung aus, oder gibt die Berechnung an das nächste
     * Objekt in der Zuständigkeitskette weiter
     *
     * @param request - Numbers Objekt
     */
    @Override
    public void calculate(Numbers request) {
        if (request.getCalcWanted().equalsIgnoreCase("add")) {
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " + (request.getNumber1() + request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }

}
