package KlajdiNdoci;

import KlajdiNdoci.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    @Scope("prototype")
    Topping mozzarellaTopping() {
        return new Topping("mozzarella", 92, 0.69);
    }

    @Bean
    @Scope("prototype")
    Topping prosciuttoTopping() {
        return new Topping("prosciutto", 35, 0.99);
    }

    @Bean
    @Scope("prototype")
    Topping cipollaTopping() {
        return new Topping("cipolla", 22, 0.69);
    }

    @Bean
    @Scope("prototype")
    Topping ananasTopping() {
        return new Topping("ananas", 24, 0.79);
    }

    @Bean
    @Scope("prototype")
    Topping salameTopping() {
        return new Topping("salame", 86, 0.99);
    }

    @Bean
    Pizza margherita() {
        return new Pizza("margherita", 1104, 4.99);
    }

    @Bean
    Pizza hawaiana() {
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(ananasTopping());
        toppingList.add(prosciuttoTopping());
        return new Pizza("hawaiana", 1024, 6.49, toppingList);
    }

    @Bean
    Pizza diavola() {
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(salameTopping());
        return new Pizza("diavola", 1160, 5.99, toppingList);
    }

    @Bean
    Bevanda limonata() {
        return new Bevanda("limonata", 128, 1.29, 0.33);
    }

    @Bean
    Bevanda acqua() {
        return new Bevanda("acqua", 0, 1.29, 0.5);
    }

    @Bean
    Vino vino() {
        return new Vino("vino", 128, 1.29, 0.75);
    }

    @Bean
    Menú getMenu(){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Bevanda> bevandaList = new ArrayList<>();
        pizzaList.add(margherita());
        pizzaList.add(diavola());
        pizzaList.add(hawaiana());
        bevandaList.add(limonata());
        bevandaList.add(acqua());
        bevandaList.add(vino());
        return new Menú(pizzaList, bevandaList);

    }
}
