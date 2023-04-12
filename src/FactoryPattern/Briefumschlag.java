package FactoryPattern;

public abstract class Briefumschlag {
    private double gewicht;

    public double getGewicht(){
        return this.gewicht;
    }
    public void setGewicht(double gewicht){
        this.gewicht = gewicht;
    }

    public Briefumschlag(double gewicht){
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return "Briefumschlag{" +
                "groeße='" + this.getClass().getSimpleName() +
                "'gewicht=" + gewicht +
                '}';
    }
}
