package firmapozice;

import java.time.LocalDate;

public class Tester extends Zamestnanec{
    private int pocetNalezenychChyb;
    public Tester(String jmeno, String prijmeni, String pozice, int plat, LocalDate datumNastupu) {
        super(jmeno, prijmeni, pozice, plat, datumNastupu);
        this.pocetNalezenychChyb = 0;
    }

    public void naselJsemNovouChybu() {
        pocetNalezenychChyb++;
    }

    public int getPocetNalezenychChyb() {
        return pocetNalezenychChyb;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println(pocetNalezenychChyb);
    }
    public void vypoctiOdpracovaneDny(){

    }
}
