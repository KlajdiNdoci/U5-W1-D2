package KlajdiNdoci.entities;

import lombok.Getter;

@Getter
public class Topping extends MenúItem {

    public Topping(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    @Override
    public String toString() {
        return "Topping(nome='" + getNome()
                + "', calorie=" + getCalorie()
                + ", prezzo=" + getPrezzo()
                + ")";
    }
}
