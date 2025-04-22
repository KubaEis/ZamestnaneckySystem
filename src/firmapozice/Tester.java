package firmapozice;
public class Tester extends Zamestnanec{
    private int pocetNalezenychChyb;
    public Tester(String jmeno, String prijmeni, String pozice, int plat) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetNalezenychChyb = 0;
    }
    public void naselJsemNovouChybu() {
        pocetNalezenychChyb++;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println(pocetNalezenychChyb);
    }
}
