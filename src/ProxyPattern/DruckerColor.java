package ProxyPattern;

public class DruckerColor implements Drucker {
    @Override
    public void print(int amountOfPages) {
        System.out.printf("Ich drucke %d Seiten in Farbe aus\n", amountOfPages);
    }
}
