package hu.szamalk;

public class MertaniHEnger {
    private static int hengerDarab = 0;
    private double sugar, magassag;

    public MertaniHEnger(double sugar, double magassag) {
        MertaniHEnger.hengerDarab++;
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return "MertaniHEnger{" +
                "hengerDarab=" + hengerDarab +
                ", sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }

    public double terfogat(){
        return  Math.pow(sugar,2) * Math.PI * magassag;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }
}
