package firmapozice;

import java.time.LocalDate;

public class Manager extends Zamestnanec{
    private int pocetRizenychZamestnancu;
    public Manager(String jmeno, String prijmeni, String pozice, int plat, int pocetRizenychZamestnancu, LocalDate datumNastupu) {
        super(jmeno, prijmeni, pozice, plat, datumNastupu);
        this.pocetRizenychZamestnancu = pocetRizenychZamestnancu;
    }
    public void pridatZamestnance() {
        pocetRizenychZamestnancu++;
        System.out.println("Pocet rizenhych zamestnancu: "+pocetRizenychZamestnancu);
    }
    public int getPocetRizenychZamestnancu() {
        return pocetRizenychZamestnancu;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Pocet rizenych zamestnancu: " + pocetRizenychZamestnancu);
    }
    public void vypoctiOdpracovaneDny(){

    }

}
