package hu.petrik;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Szamla> szamlaLista = new ArrayList<>();

    public Szamla szamlaNyitas(Tulajdonos tulanjdonos, int hitelKeret){
        Szamla szamla;
        try {
            if(hitelKeret > 0){
                HitelSzamla hitelSzamla = new HitelSzamla(tulanjdonos, hitelKeret);
                szamlaLista.add(hitelSzamla);
                szamla = hitelSzamla;
            }else{
                MegtakaritasSzamla megtakaritasSzamla = new MegtakaritasSzamla(tulanjdonos);
                szamlaLista.add(megtakaritasSzamla);
                szamla = megtakaritasSzamla;
            }
            return szamla;
        }catch (Exception e){
            return null;
        }
    }
}