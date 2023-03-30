package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Factory f = new Factory();
        Briefumschlag b = f.getBriefUmschlag(Briefgroeße.A4, 100.5);
        Briefumschlag b1 = f.getBriefUmschlag(Briefgroeße.A5, 0);
        Briefumschlag b2 = f.getBriefUmschlag(Briefgroeße.A6, 3.333);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
    }
}
