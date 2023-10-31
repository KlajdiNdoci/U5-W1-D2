package KlajdiNdoci.entities;

import KlajdiNdoci.enums.StatoTavolo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tavolo {
    private int numeroTavolo;
    private int numeroCopertiMax;
    private StatoTavolo statoTavolo;

    public Tavolo(int numeroTavolo, int numeroCopertiMax) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCopertiMax = numeroCopertiMax;
        this.statoTavolo = StatoTavolo.LIBERO;
    }
}
