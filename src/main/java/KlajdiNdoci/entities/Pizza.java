package KlajdiNdoci.entities;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
public class Pizza extends MenúItem {
    private final String pomodoro;
    private final String mozzarella;
    private List<Topping> toppings;

    public Pizza(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
        this.pomodoro = "pomodoro";
        this.mozzarella = "mozzarella";
    }

    public Pizza(String nome, int calorie, double prezzo, List<Topping> toppings) {
        super(nome, calorie, prezzo);
        this.pomodoro = "pomodoro";
        this.mozzarella = "mozzarella";
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + super.getNome() + '\'' +
                ", pomodoro='" + pomodoro + '\'' +
                ", mozzarella='" + mozzarella + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
