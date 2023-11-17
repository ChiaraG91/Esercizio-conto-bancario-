import java.util.Arrays;

public class Banca {

    public String nomeBanca;

    public ContoBancario[] conti;

    public int numConti;


    public Banca(String nomeBanca, int maxConti) {
        this.nomeBanca = nomeBanca;
        this.conti = new ContoBancario[maxConti];
        this.numConti = 0;
    }

    public String getNomeBanca() {
        return nomeBanca;
    }

    public ContoBancario[] getConti() {
        return conti;
    }

    public int getNumConti() {
        return numConti;
    }

    public void setNomeBanca(String nomeBanca) {
        this.nomeBanca = nomeBanca;
    }

    public void setConti(ContoBancario[] conti) {
        this.conti = conti;
    }

    public void setNumConti(int numConti) {
        this.numConti = numConti;
    }

    public void aggiungiConto(ContoBancario conto) {
        if (numConti < conti.length) {
            conti[numConti] = conto;
            numConti++;
        } else {
            System.out.println("Non è possibile aggiungere il conto");
        }
    }

    public void visualizzaInformazioniConti() {
        int i;
        for (i = 0; i <= numConti; i++) {
            conti[i].stampaDettagli();
        }
    }

    public int saldoTotale() {
        int saldo = 0;
        if (numConti != 0) {
            for (int i = 0; i < numConti; i++) {
                saldo += conti[i].getSaldo();
            }
        }
        return saldo;

    }


    @Override
    public String toString() {
        return "Banca{" +
                "nomeBanca='" + nomeBanca + '\'' +
                ", conti=" + Arrays.toString(conti) +
                ", numConti=" + numConti +
                '}';
    }
}