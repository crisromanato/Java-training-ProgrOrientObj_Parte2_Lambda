package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.TreeSet.entities;

import java.util.Objects;
/*
implementacao do comparable
 */
public class ProductTreeSet implements Comparable<ProductTreeSet>{

    private String name;
    private Double price;

    public ProductTreeSet(String name, Double price) {
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
        if ( !(o instanceof ProductTreeSet) )
            return false;
        ProductTreeSet that = ( ProductTreeSet ) o;
        return getName ().equals (that.getName ()) &&
               getPrice ().equals (that.getPrice ());
    }

    @Override
    public int hashCode () {

        return Objects.hash (getName (), getPrice ());
    }



/*
como comparar um produto com outro.
O criterio vai depender do negocio.
VAmos fazer a comapracao para ordenar por nome.
 */
    @Override
    public int compareTo (ProductTreeSet other) {
       //        return 0;
        return name.toUpperCase ().compareTo (other.getName().toUpperCase ());
    }

    @Override
    public String toString () {
        return "Product [" +
               "name=" + name +
               ", price=" + price +
               ']';
    }

}
