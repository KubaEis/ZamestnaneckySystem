package firmapozice;
import java.time.LocalDate;
import java.util.List;

public class Vyvojar extends Zamestnanec{
    private List<String> listJazyku;
    public Vyvojar(String jmeno, String prijmeni, String pozice, int plat, List<String> listJazyku, LocalDate datumNastupu) {
        super(jmeno, prijmeni, pozice, plat, datumNastupu);
        this.listJazyku = listJazyku;
    }

    public List<String> getListJazyku() {
        return listJazyku;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        for (int i = 0; i < listJazyku.size(); i++) {
            System.out.println(listJazyku.get(i));
        }
    }
    public void vypoctiOdpracovaneDny(){

    }
}
