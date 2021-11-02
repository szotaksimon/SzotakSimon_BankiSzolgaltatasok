package hu.petrik;

import static javax.swing.UIManager.get;

public class Main {

    public static void main(String[] args) {
        Tulajdonos t1 = new Tulajdonos("Gipsz Jakab");
        Tulajdonos t2 = new Tulajdonos("Virág Föld");
        Tulajdonos t3 = new Tulajdonos("Izom Agy");

        HitelSzamla h1 = new HitelSzamla(t1, 50000);
        System.out.println(h1.kivesz(25000));

        Kartya k1 = h1.ujKartya("987654321");
        System.out.println(k1.getKartyaSzam());
        System.out.println(k1.getTulajdonos().getNev());

        System.out.println("Fizetés: 10000ft : " + (k1.vasarlas(10000) ? "sikeres" : "sikertelen"));
        System.out.println("Aktuális egyenleg: " + k1.getSzamla().getAktualisEgyenleg());
        System.out.println("Fizetés: 45000ft : " + (k1.vasarlas(45000) ? "sikeres" : "sikertelen"));
        System.out.println("Aktuális egyenleg: " + k1.getSzamla().getAktualisEgyenleg());
        System.out.println("\n");

        MegtakaritasSzamla m1 = new MegtakaritasSzamla(t2);
        System.out.println("Kamat: " + m1.getKamat());
        m1.setKamat(0.9);
        System.out.println("Kamat: " + m1.getKamat());
        m1.befizet(20000);
        System.out.println("Aktuális egyenleg: " + m1.getAktualisEgyenleg());
        m1.kamatJovairas();
        System.out.println("Aktuális egyenleg: " + m1.getAktualisEgyenleg());


        Bank b1 = new Bank();
        b1.szamlaNyitas(t1, 50000);
        b1.szamlaNyitas(t1, 10000);
        b1.szamlaNyitas(t1, 0);
        b1.szamlaNyitas(t1, 0);
        b1.szamlaNyitas(t2, 0);
        b1.szamlaNyitas(t3, 500000);

        b1.szamlaLista.get(0).befizet(30000);
        b1.szamlaLista.get(0).befizet(10000);
        b1.szamlaLista.get(0).befizet(10000);

        System.out.println(t1.getNev() + "legnagyobb egyenlegű számla: " + b1.getLegnagyobbEgyenlegoSzamla(t1));
        System.out.println(t1.getNev() + "össz egyenleg: " + b1.osszEgyenleg(t1));
        System.out.println("Össz hitelkeret: " + b1.getOsszHitelKeret());

    }
}
