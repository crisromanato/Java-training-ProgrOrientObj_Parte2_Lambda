package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Map.Case2_Sem_Equals_Hashcode.entities;

import java.util.Objects;

public class ProductMap {
    private String name;
    private Double price;

    public ProductMap (String name, Double price) {
        this.name  = name;
        this.price = price;
    }

// getters, setters,

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Double getPrice () {
        return price;
    }

    public void setPrice (Double price) {
        this.price = price;
    }

}
