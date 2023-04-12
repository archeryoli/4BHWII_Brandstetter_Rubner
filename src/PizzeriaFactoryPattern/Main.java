package PizzeriaFactoryPattern;

public class Main {
    public static void main(String[] args) {
        Pizzeria p1 = Factory.getInstance(PizzaTyp.BerlinCalzone);
        Pizzeria p2 = Factory.getInstance(PizzaTyp.HamburgHawaii);
        Pizzeria p3 = Factory.getInstance(PizzaTyp.RostockSalami);
        Pizzeria p4 = Factory.getInstance(PizzaTyp.BerlinHawaii);
        Pizzeria p5 = Factory.getInstance(PizzaTyp.HamburgSalami);
        Pizzeria p6 = Factory.getInstance(PizzaTyp.RostockCalzone);

        p1.backen();
        p2.schneiden();
        p3.einpacken();
        p4.backen();
        p5.schneiden();
        p6.einpacken();
    }
}
