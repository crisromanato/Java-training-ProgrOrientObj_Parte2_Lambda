package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.CaseTestIgualdade.Case2_ComHashcodeEquals.entities;

import java.util.Objects;

public class Product5_TestIgualdade {

    private String name;
    private Double price;

    public Product5_TestIgualdade (String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public Double getPrice() {

        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals (Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Product5_TestIgualdade) ) return false;
        Product5_TestIgualdade that = ( Product5_TestIgualdade ) o;
        return getName ().equals (that.getName ()) &&
               getPrice ().equals (that.getPrice ());
    }

    @Override
    public int hashCode () {
        return Objects.hash (getName (), getPrice ());
    }
}
