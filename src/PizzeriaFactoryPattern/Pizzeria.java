package PizzeriaFactoryPattern;

public abstract class Pizzeria {
    private Pizza pizza;

    public Pizzeria(Pizza pizza){
        this.pizza = pizza;
    }

    public void backen(){
        System.out.println("Backe backe " + pizza + ", die Pizzeria " + this.getClass().getSimpleName() + " hat gerufen");
    }
    public void schneiden(){
        System.out.println("Achtung scharfes Messer! Die Pizzeria " + this.getClass().getSimpleName() + " schneidet gerade die Pizza " + pizza);
    }
    public void einpacken(){
        System.out.println("Mhhhh Lecker! Die Pizzeria " + this.getClass().getSimpleName() + " packt gerade die Pizza " + pizza + " ein");
    }
}
