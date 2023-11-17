# Esercizio-conto-bancario-
Traccia esercizio conto bancario:
Classe ContoBancario:
Definisci una classe ContoBancario con gli attributi iban (String) e saldo (double).
Crea un costruttore che prenda in input l'IBAN e il saldo iniziale del conto.
Implementa i metodi getIban, setIban, getSaldo e setSaldo per ottenere e impostare i valori degli attributi.
Classe Banca:
Definisci una classe Banca con attributi come nomeBanca (String), un array di ContoBancario e un intero numConti (per tenere traccia del numero attuale di conti).
Crea un costruttore che accetti il nome della banca e il numero massimo di conti che la banca può gestire.
Implementa un metodo aggiungiConto che aggiunga un conto alla lista dei conti se non si supera il numero massimo di conti.
Crea un metodo visualizzaInformazioniConti che stampi le informazioni (ad esempio, IBAN e saldo) di tutti i conti presenti nella banca.
Implementa un metodo saldoTotale che restituisca il saldo totale di tutti i conti presenti nella banca.
Main:
Nel metodo main, crea un'istanza della classe Banca.
Crea alcuni oggetti ContoBancario e aggiungili alla banca utilizzando il metodo aggiungiConto.
Utilizza il metodo visualizzaInformazioniConti per stampare le informazioni sui conti della banca.
Utilizza il metodo saldoTotale per stampare il saldo totale della banca.
