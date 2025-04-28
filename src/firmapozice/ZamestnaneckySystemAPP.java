package firmapozice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZamestnaneckySystemAPP {
    public static void main(String[] args) {
       /* List<String> list = new ArrayList<String>();
        Zamestnanec zamestnanec = new Zamestnanec("petr","zmrd","DOLE", 12000, );
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
        tester.vypisInfo();*/
        Scanner sc = new Scanner(System.in);
        List<Zamestnanec> listZamestnancu = new ArrayList<Zamestnanec>();
        while(true){
            System.out.println("Vitej v menu. ");
            System.out.println("Jaký tip zamestnance chces pridat?");
            System.out.println("Pridavani");
            System.out.println("1. Vyvojar");
            System.out.println("2. Tester");
            System.out.println("3. Manager");
            System.out.println("Funkce");
            System.out.println("4. Pocet manageru");
            System.out.println("5. Pocet vsech zamestnancu");
            System.out.println("6. Tester, ktery nalezl nejvice chyb");
            System.out.println("7. Vyvojar, ovladajici nejvetsi pocet jazyku");
            System.out.println("8. Zamestnanec s najvysim platem");
            System.out.println("9. Zamestnanec s nejvice odpracovynymi dny");
            System.out.println("10. Vsichni vyvojari, kteri ovladaji jazyk JAVA");
            System.out.println("11. ");
            int vyber = sc.nextInt();
            if(vyber < 1 || vyber > 11){
                System.err.println("Zadej cislo va vyberu.");
                break;
            }
            switch(vyber){
                case 1:
                    List<String> listJazyku = new ArrayList<String>();
                    System.out.println("Jake ma vyvojar jmeno?");
                    String jmenoV = sc.nextLine();
                    System.out.println("Jake ma vyvojar prijmeni?");
                    String prijmeniV = sc.nextLine();
                    System.out.println("Jakou ma vyvojar pozici?");
                    String poziceV = sc.nextLine();
                    System.out.println("Jaky ma vyvojar plat?");
                    int platV = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Kolik umi vyvojar jazyku?");
                    int pocet = sc.nextInt();
                    sc.nextLine();
                    for(int i=0; i<pocet; i++){
                        System.out.println("Jak se jazyk jmenuje?");
                        String jmenoJ = sc.nextLine();
                        listJazyku.add(jmenoJ);
                    }
                    System.out.println("Kdy vyvojar nastoupil?");
                    System.out.println("Den");
                    int denV = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Mesic");
                    int mesicV = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Rok");
                    int rokV = sc.nextInt();
                    sc.nextLine();
                    LocalDate datumNastoupeniV = LocalDate.of(rokV, mesicV, denV);
                    Vyvojar vyvojar = new Vyvojar(jmenoV, prijmeniV, poziceV, platV, listJazyku, datumNastoupeniV);
                    listZamestnancu.add(vyvojar);
                    break;
                case 2:
                    System.out.println("Jake ma tester jmeno?");
                    String jmenoT = sc.nextLine();
                    System.out.println("Jake ma tester prijmeni?");
                    String prijmeniT = sc.nextLine();
                    System.out.println("Jakou ma tester pozici?");
                    String poziceT = sc.nextLine();
                    System.out.println("Jaky ma tester plat?");
                    int platT = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Kdy tester nastoupil?");
                    System.out.println("Den");
                    int denT = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Mesic");
                    int mesicT = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Rok");
                    int rokT = sc.nextInt();
                    sc.nextLine();
                    LocalDate datumNastoupeniT = LocalDate.of(rokT, mesicT, denT);
                    Tester tester = new Tester(jmenoT, prijmeniT, poziceT, platT, datumNastoupeniT);
                    listZamestnancu.add(tester);
                    break;
                case 3:
                    System.out.println("Jake ma manager jmeno?");
                    String jmenoM = sc.nextLine();
                    System.out.println("Jake ma manager prijmeni?");
                    String prijmeniM = sc.nextLine();
                    System.out.println("Jakou ma manager pozici?");
                    String poziceM = sc.nextLine();
                    System.out.println("Jaky ma manager plat?");
                    int platM = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Kolik ma manager na starosti zamestnancu?");
                    int pocetZamestnancuM = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Kdy manager nastoupil?");
                    System.out.println("Den");
                    int denM = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Mesic");
                    int mesicM = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Rok");
                    int rokM = sc.nextInt();
                    sc.nextLine();
                    LocalDate datumNastoupeniM = LocalDate.of(rokM, mesicM, denM);
                    Manager manager = new Manager(jmenoM, prijmeniM, poziceM, platM, pocetZamestnancuM, datumNastoupeniM);
                    listZamestnancu.add(manager);
                    break;
                case 4:
                    int pocetManageru = 0;
                    for(int i=0; i<listZamestnancu.size(); i++){
                        if(listZamestnancu.get(i) instanceof Manager){
                            pocetManageru++;
                        }
                    }
                    System.out.println("Pocet manageru je: " + pocetManageru);
                    break;
                case 5:
                    System.out.println("Pocet vsech zamestnancu je: " + listZamestnancu.size());
                    break;
                case 6:
                    int nejlepsiTester = 0;
                    String jmenoNejlepsiho = " ";
                    String prijmeniNejlepsiho = " ";
                    for(int i=0; i<listZamestnancu.size(); i++){
                        if(listZamestnancu.get(i) instanceof Tester){
                            if (((Tester) listZamestnancu.get(i)).getPocetNalezenychChyb() > nejlepsiTester){
                                nejlepsiTester = ((Tester) listZamestnancu.get(i)).getPocetNalezenychChyb();
                                jmenoNejlepsiho = ((Tester) listZamestnancu.get(i)).getJmeno();
                                prijmeniNejlepsiho = ((Tester) listZamestnancu.get(i)).getPrijmeni();
                            }
                        }
                    }
                    System.out.println("Tester s nejvice nalezenymi chybami je "+ jmenoNejlepsiho +" "+prijmeniNejlepsiho+" a nasel "+nejlepsiTester+" chyb");

            }


        }
    }
}