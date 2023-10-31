package KlajdiNdoci.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Vino extends Bevanda {
    private final double alcol;


    public Vino(String nome, int calorie, double prezzo, double litri) {
        super(nome, calorie, prezzo, litri);
        this.alcol = 13;
    }
}
