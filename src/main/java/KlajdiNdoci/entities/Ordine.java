package KlajdiNdoci.entities;

import KlajdiNdoci.enums.StatoOrdine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
public class Ordine {
    private long numeroOrdine;
    private List<Pizza> pizze;
    private List<Bevanda> bevande;
    private Tavolo tavolo;
    private StatoOrdine statoOrdine;
    private double importoTotale;

    public Ordine(long numeroOrdine, List<Pizza> pizze, List<Bevanda> bevande, Tavolo tavolo, StatoOrdine statoOrdine, double importoTotale) {
        Random rndm = new Random();
        this.numeroOrdine = rndm.nextInt();
        this.pizze = pizze;
        this.bevande = bevande;
        this.tavolo = tavolo;
        this.statoOrdine = statoOrdine;
        this.importoTotale = importoTotale;
    }
}
