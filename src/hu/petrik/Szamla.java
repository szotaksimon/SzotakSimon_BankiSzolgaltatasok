package hu.petrik;

public abstract class Szamla extends BankiSzolgaltatas {

    private double aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public double getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(double osszeg){
        if(osszeg>0){
            this.aktualisEgyenleg+=osszeg;
        }
    }

    protected void setAktualisEgyenleg(double osszeg) {
        this.aktualisEgyenleg = osszeg;
    }

    public abstract boolean kivesz(double osszeg);
    public Kartya ujKartya(String kartyaSzam){
        return new Kartya(this.getTulajdonos(), this, kartyaSzam);
    }
}
