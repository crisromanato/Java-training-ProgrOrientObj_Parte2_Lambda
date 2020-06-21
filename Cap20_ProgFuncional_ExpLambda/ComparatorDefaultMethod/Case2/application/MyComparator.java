package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ComparatorDefaultMethod.Case2.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ComparatorDefaultMethod.Case2.entities.ProductComparator1;

import java.util.Comparator;

public class MyComparator implements Comparator<ProductComparator1> {
/*
igual o comparate to
Parameters: o -the object to be compared.
Returns: a negative integer, zero, or a positive integer as this object
is less than, equal to, or greater than the specified object.

eg.
System.out.println("maria".compareTo("alex")); - maria é maior em rel a Alex
System.out.println("alex".compareTo("maria"));
System.out.println("maria".compareTo("maria"));

Output:
12
-12
0

 */
    @Override
    public int compare (ProductComparator1 p1, ProductComparator1 p2) {
        return p1.getName ().toUpperCase ().compareTo (p2.getName ().toUpperCase ());
    }
}
