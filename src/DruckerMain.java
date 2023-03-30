public class DruckerMain {
    public static void main(String[] args) {
        Drucker d = Drucker.getInstance();
        Drucker d2 = Drucker.getInstance();
        d.drucken();
        d2.drucken();
    }
}
class Drucker{
    private static Drucker instance;

    public void drucken(){
        System.out.println("ich drucke, ich bin die Instanz " + getInstance().hashCode());
    }

    private Drucker(){}
    public static Drucker getInstance(){
        if(instance == null){
            instance = new Drucker();
        }
        return instance;
    }

}