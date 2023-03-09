public class Mainclass {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        Threading t = new Threading(4, 10000);
        Threading t1 = new Threading(4, 9999);
        Threading t2 = new Threading(4, 9998);
        Threading t3 = new Threading(4, 9997);

        t.start();
        t1.start();
        t2.start();
        t3.start();
        while(!t.getIsFinished());
        System.out.println("done");
        while(!t1.getIsFinished());
        while(!t2.getIsFinished());
        while(!t3.getIsFinished());
        System.out.println("done");
        System.out.println(t.getSum().multiply(t1.getSum()).multiply(t2.getSum()).multiply(t3.getSum()));
        final long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime - startTime));
    }
}
