public class Main {
    public static void main(String[] args) {

        ContoBancario conto1 = new ContoBancario("IT12A1234512345123456789012",3240);
        ContoBancario conto2 = new ContoBancario("IT12A1234512345123456890127",2566);
        ContoBancario conto3 = new ContoBancario("IT12A1234512345123456790182",5055);
        ContoBancario conto4 = new ContoBancario("IT12A1234512345123456901278",6597);
        ContoBancario conto5 = new ContoBancario("IT12A1234512345123456718902",5972);


        Banca banca1 = new Banca("Intesa", 2500);
        Banca banca2 = new Banca("Unicredit",6500);
        Banca banca3 = new Banca("BPM",5000);




        banca1.aggiungiConto(conto1);
        banca1.aggiungiConto(conto2);
        banca2.aggiungiConto(conto3);
        banca3.aggiungiConto(conto4);
        banca3.aggiungiConto(conto5);


        conto1.stampaDettagli();
        conto2.stampaDettagli();
        conto3.stampaDettagli();
        conto4.stampaDettagli();
        conto5.stampaDettagli();


        System.out.println(banca1.saldoTotale());
        System.out.println(banca2.saldoTotale());
        System.out.println(banca3.saldoTotale());


    }
}