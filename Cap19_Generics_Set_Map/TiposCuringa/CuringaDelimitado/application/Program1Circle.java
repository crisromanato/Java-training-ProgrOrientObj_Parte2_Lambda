package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.TiposCuringa.CuringaDelimitado.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.TiposCuringa.CuringaDelimitado.entities.Circle;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.TiposCuringa.CuringaDelimitado.entities.Rectangle;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.TiposCuringa.CuringaDelimitado.entities.Shape;

import java.util.ArrayList;
import java.util.List;

/*

Curingas delimitados (bounded wildcards)

Problema 1
Vamos fazer um método para retornar a soma das áreas de uma lista de figuras.

Nota 1: soluções impróprias: usar os parametros abaixo, list shape ou list '?'
public double totalArea(List<Shape> list)
public double totalArea(List<?> list)

Nota 2: não conseguiremos adicionar elementos na lista do método

https://github.com/acenelio/generics4-java

 */
public class Program1Circle {
    public static void main (String[] args) {
/*
fizemos uma lista e add as duas formas e queremos um metodo q retorna
o total das areas das listas.
 */
        List<Shape> myShapes = new ArrayList<> ();
        myShapes.add (new Rectangle (3.0, 2.0));
        myShapes.add (new Circle (2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));
/*
quando coloco o myCircles como parametro para impressoa ele da erro de casting
porque o List Shape nao é um super tipo do List Circle entao
o metodo total area vai funcionar somente para alista de shape
se for outra lista mesmo sendo sub tipo de shape nao vai funcionar.
 */
        System.out.println ("Total Area: " + totalArea (myCircles));
    }
/*
Pra funcionar teriamos q colocar o ti po curinga
public static double totalArea(List<?> list) {
o compilador reclama que os elementos nao serao necesariamente do tipo
shape.

Eu quero uma funcao que receba uma lista de shape podemos inclusive
ser uma sub lista de shape, eg. circle.
Para isso vamos trocar para: curinga ? + extends Shape.
public static double totalArea(List<? extends Shape> list) {

aogra falamos que essa lista pode ser de shape ou de qualquer subtipo
de shape.

Lembrando que nao conseguimos add elementos na lista.
 */
     
   //public static double totalArea(List<Shape> list) {
        // public static double totalArea(List<?> list) {
            public static double totalArea(List<? extends Shape> list) {
                /*
                o compilador gera um erro pq essa adicao pode ser de
                um tipo subtipo de shape porém incompativel com retangulo, pois
                a lista é de circulos. Entao esse é o preco quando fazemos
                uma lista curinga com tipo delimitado. Não podemos
                add elementos a lista.
                 */
                //list.add(new Rectangle (3.0,4.0));
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
    }

