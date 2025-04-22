package firmapozice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZamestnaneckySystemAPP {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Zamestnanec zamestnanec = new Zamestnanec("petr","zmrd","DOLE", 12000);
        Manager manager = new Manager("jan","kunda", "Manager", 50000, 120);
        Vyvojar vyvojar = new Vyvojar("peta", "pica", "Vyvojar", 100000, list);
        Tester tester = new Tester("marek", "parek", "Tester", 10000);
        zamestnanec.vypisInfo();
        manager.vypisInfo();
        vyvojar.vypisInfo();
        tester.vypisInfo();
        for (int i = 0; i < 20; i++) {
            tester.naselJsemNovouChybu();
        }
        tester.vypisInfo();


    }
}