package hu.petrik;

public class Kartya extends BankiSzolgaltatas {
    private final Szamla szamla;
    private final String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public Szamla getSzamla() {
        return szamla;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg) {
        return szamla.kivesz(osszeg);
    }
}
