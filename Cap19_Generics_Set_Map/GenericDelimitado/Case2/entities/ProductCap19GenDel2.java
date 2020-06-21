package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.GenericDelimitado.Case2.entities;
/*
implementado o metodo toString e também o comparable.
 */
public class ProductCap19GenDel2 implements Comparable<ProductCap19GenDel2> {

        private String name;
        private Double price;



	public ProductCap19GenDel2 (String name, Double price) {
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
        public String toString() {
            return name + ", " + String.format("%.2f", price);
        }


/*
comparando um produto com outro e verificando o preço
 */
        @Override
        public int compareTo (ProductCap19GenDel2 other) {
            return price.compareTo(other.getPrice());
        }
}
