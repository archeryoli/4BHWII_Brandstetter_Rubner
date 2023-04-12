package PizzeriaFactoryPattern;

public class Factory {
    public static Pizzeria getInstance(PizzaTyp typ){
        Pizzeria p = null;
        switch(typ){
            case BerlinSalami:
                p = new BerlinPizzeria(new PizzaSalami("BerlinSalami"));
                break;
            case BerlinHawaii:
                p = new BerlinPizzeria(new PizzaHawaii("BerlinHawaii"));
                break;
            case BerlinCalzone:
                p = new BerlinPizzeria(new PizzaCalcone("BerlinCalcone"));
                break;
            case HamburgSalami:
                p = new HamburgPizzeria(new PizzaSalami("HamburgSalami"));
                break;
            case HamburgHawaii:
                p = new HamburgPizzeria(new PizzaHawaii("HamburgHawaii"));
                break;
            case HamburgCalzone:
                p = new HamburgPizzeria(new PizzaCalcone("HamburgCalcone"));
                break;
            case RostockSalami:
                p = new RostockPizzeria(new PizzaSalami("RostockSalami"));
                break;
            case RostockHawaii:
                p = new RostockPizzeria(new PizzaHawaii("RostockHawaii"));
                break;
            case RostockCalzone:
                p = new RostockPizzeria(new PizzaCalcone("RostockCalcone"));
        }
        return p;
    }
}
