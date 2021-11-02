package hu.petrik;

public class MegtakaritasSzamla extends Szamla {
    private double kamat;
    private static double alapkamat = 1.1;

    public MegtakaritasSzamla(Tulajdonos tulajdonos){
        super(tulajdonos);
        this.kamat = alapkamat;
    }

    public  double getKamat() { return kamat;}
    public void setKamat(double kamat) { this.kamat = kamat;}

    @Override
    public boolean kivesz(double osszeg){
        boolean siker = true;
        if (osszeg > getAktualisEgyenleg()){
            siker = false;
        } else{
            setAktualisEgyenleg(getAktualisEgyenleg() - osszeg);
        }
        return siker;
    }
    public void kamatJovairas() {
        setAktualisEgyenleg(getAktualisEgyenleg() * kamat);
    }
}
