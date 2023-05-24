package ProxyPattern;

public class DruckerProxy implements Drucker {
    @Override
    public void print(int amountOfPages) {
        Drucker d = null;
        if(amountOfPages <= 0){
            System.out.println("Bist du dumm? Du kannst nicht weniger als eine Seite drucken... ");
            return;
        }
        if(amountOfPages > 500){
            System.out.println("Das schaff ich leider nicht mehr. Bitte drucke weniger als 500 Seiten auf einmal");
            return;
        }
        if(amountOfPages >= 50){
            d = new DruckerSW();
        }
        if(amountOfPages < 50){
            d = new DruckerColor();
        }

        d.print(amountOfPages);
    }
    public void print(int amountOfPages, PrinterType type) {
        Drucker d = null;
        if(amountOfPages <= 0){
            System.out.println("Bist du dumm? Du kannst nicht weniger als eine Seite drucken... ");
            return;
        }
        if(amountOfPages > 500){
            System.out.println("Das schaff ich leider nicht mehr. Bitte drucke weniger als 500 Seiten auf einmal");
            return;
        }
        if(amountOfPages > 50){
            if(type != PrinterType.SW){
                System.out.println("Du kannst diesen Druckertypen bei über 50 Seiten leider nicht verwenden");
                return;
            }
            d = new DruckerSW();
        }
        if(amountOfPages < 50){
            switch (type){
                case SW -> d = new DruckerSW();
                case COLOR -> d = new DruckerColor();
            }
        }

        d.print(amountOfPages);
    }
}
