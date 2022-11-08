public class Main {
    public static void main(String[] args) {
        WR wrYen = new EUR2YEN();
        WR wrDol = new EURO2Dollar();

        Decorator dr = new DecoratorGebuehrenProzent(wrYen);
        Decorator dr2 = new DecoratorGebuehrenFix(wrYen);

        wrYen.setNext(wrDol);

        System.out.println(dr.umrechnen("yen", 10));
        System.out.println(wrYen.umrechnen("dollar", 10));

        System.out.println(dr2.umrechnen("yen", 20));


        WR wr2 = new EURO2Dollar.Builder().setFaktor(15).setWR(wrYen).build();
        System.out.println(wr2.umrechnen("yen", 100.0));
    }
}
