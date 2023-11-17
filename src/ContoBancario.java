public class ContoBancario {

    public String iban;

    public double saldo;


    public ContoBancario(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;

    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContoBancario{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }


    public void stampaDettagli(){
        System.out.println("iban:" + iban + " " + "saldo" + "" + saldo);
    }
}



