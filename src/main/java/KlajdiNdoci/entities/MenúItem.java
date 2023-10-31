package KlajdiNdoci.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public abstract class MenúItem {
    private String nome;
    private int calorie;
    private double prezzo;
}
