package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Comparable.entities;
/*
Interface Comparable

https://docs.oracle.com/javase/10/docs/api/java/lang/Comparable.html

implementacao basica:
public interface Comparable<T> { int compareTo (T o); }

Method compareTo:
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
public class Employee implements Comparable<Employee> {
/*
atributos
 */
        private String name;
        private Double salary;

        /*
        construtor com argumentos
         */
        public Employee(String name, Double salary) {
            this.name = name;
            this.salary = salary;
        }

        /*
        getters and setters
         */
        public String getName() {
            return name; }
        public void setName(String name) {
            this.name = name; }

        public Double getSalary() {
            return salary; }
        public void setSalary(Double salary) {
            this.salary = salary;
        }

        /*
implementacao da interface comparable  para ser ordenavel pelo
metodo collection.sort na classe principal

pra que serve - serve para comparar um objeto com o outro.
eg. temos varios funcionarios, entao vamos comparar um employee
com outro employee.

Detalhes da implementacao no topo.

Neste caso definimos que a comparacao sera pelo nome
implementacao basica:
public interface Comparable<T> { int compareTo (T o); }

public int compareTo(Employee é o 'T' e  other é o 'o') {
            return name.compareTo(other.getName()); }

traduzindo - quero implementar a comparacao de um funcionario com outro.
         */
        @Override
        public int compareTo(Employee other) {
            /*
            comparacao pelo nome entre um funcionario e outro
             */
            return - salary.compareTo(other.getSalary()); }

            /*
            posso fazer o comparativo tambem por salario só alterando o
            return para :
            return name.compareTo(other.getName());

            ordem crescente
            return salary.compareTo(other.getSalary());

            se quiser em ordem decrescente é só colocar:

            return - salary.compareTo(other.getSalary());

             */

    }

