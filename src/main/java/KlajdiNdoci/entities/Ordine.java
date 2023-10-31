package KlajdiNdoci.entities;

import KlajdiNdoci.enums.StatoOrdine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
public class Ordine {
    private long numeroOrdine;
    private LocalDateTime orarioAcquisizione;
    private List<Pizza> pizze;
    private List<Bevanda> bevande;
    private Tavolo tavolo;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private double importoTotale;
    @Value("${costo.coperto}")
    private double costoCoperto;

    public Ordine(List<Pizza> pizze, List<Bevanda> bevande, Tavolo tavolo, int numeroCoperti) {
        Random rndm = new Random();
        this.numeroOrdine = rndm.nextInt();
        this.orarioAcquisizione = LocalDateTime.now();
        this.pizze = pizze;
        this.bevande = bevande;
        this.tavolo = tavolo;
        this.numeroCoperti = numeroCoperti;
        this.statoOrdine = StatoOrdine.IN_CORSO;
        double importoPizze = 0;
        double importoBevande = 0;
        for (Pizza pizza: pizze) {
            importoPizze += pizza.getPrezzo();
        }
        for (Bevanda bevanda: bevande) {
            importoBevande += bevanda.getPrezzo();
        }
        this.importoTotale = importoPizze+importoBevande+(numeroCoperti * costoCoperto);
    }

    public double calcTotale(){

        return importoTotale;
    }
}
