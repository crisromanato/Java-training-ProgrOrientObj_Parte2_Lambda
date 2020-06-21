package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Map.Case3_Com_Equals_Hashcode.entities;

import java.util.Objects;

public class ProductMap {
    private String name;
    private Double price;

    public ProductMap(String name, Double price) {
        this.name = name;
        this.price = price; }


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

// equals, hashCode

    @Override
    public boolean equals (Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof ProductMap) ) return false;
        ProductMap that = ( ProductMap ) o;
        return getName ().equals (that.getName ()) &&
               getPrice ().equals (that.getPrice ());
    }

    @Override
    public int hashCode () {
        return Objects.hash (getName (), getPrice ());
    }
}
