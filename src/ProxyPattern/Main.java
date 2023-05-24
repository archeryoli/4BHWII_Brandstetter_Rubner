package ProxyPattern;

public class Main {
    public static void main(String[] args) {
        DruckerProxy proxy = new DruckerProxy();

        proxy.print(-3);
        proxy.print(5);
        proxy.print(99);
        proxy.print(501);
        proxy.print(20, PrinterType.SW);
        proxy.print(55, PrinterType.COLOR);
    }
}
