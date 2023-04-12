package PizzeriaFactoryPattern;

public abstract class Pizza {
    private String name;
    public Pizza(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
