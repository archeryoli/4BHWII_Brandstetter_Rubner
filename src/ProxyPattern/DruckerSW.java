package ProxyPattern;

public class DruckerSW implements Drucker {
    @Override
    public void print(int amountOfPages) {
        System.out.printf("Ich drucke %d Seiten in Schwarz-Weiß aus\n", amountOfPages);
    }
}
