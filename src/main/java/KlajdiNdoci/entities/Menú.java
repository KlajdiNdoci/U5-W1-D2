package KlajdiNdoci.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class Menú {
    List<Pizza> pizzaList;
    List<Bevanda> bevandaList;
    
}
