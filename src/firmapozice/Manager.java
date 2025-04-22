package firmapozice;

public class Manager extends Zamestnanec{
    private int pocetRizenychZamestnancu;
    public Manager(String jmeno, String prijmeni, String pozice, int plat, int pocetRizenychZamestnancu) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetRizenychZamestnancu = pocetRizenychZamestnancu;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Pocet rizenych zamestnancu: " + pocetRizenychZamestnancu);
    }

}
