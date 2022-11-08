public class Main {
    public static void main(String[] args) {
        WR wrYen = new EUR2YEN();
        WR wrDol = new EURO2Dollar();

        wrYen.setNext(wrDol);

        System.out.println(wrYen.umrechnen("yen", 10));
        System.out.println(wrYen.umrechnen("dollar", 10));



    }
}
