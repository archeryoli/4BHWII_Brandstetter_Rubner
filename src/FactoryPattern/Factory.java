package FactoryPattern;

public class Factory {
    public Briefumschlag getBriefUmschlag(Briefgroeße groeße, double gewicht){
        Briefumschlag b = null;
        switch(groeße){
            case A4:
                b = new A4(gewicht);
                break;
            case A5:
                b = new A5(gewicht);
                break;
            case A6:
                b = new A6(gewicht);
                break;
        }
        return b;
    }
}
