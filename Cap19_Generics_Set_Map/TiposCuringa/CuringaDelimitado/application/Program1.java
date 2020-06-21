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
public class Program1 {
    public static void main (String[] args) {
/*
fizemos uma lista e add as duas formas e queremos um metodo q retorna
o total das areas das listas.
 */
        List<Shape> myShapes = new ArrayList<> ();
        myShapes.add (new Rectangle (3.0, 2.0));
        myShapes.add (new Circle (2.0));

        System.out.println ("Total Area: " + totalArea (myShapes));
    }


    public static double totalArea(List<Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
    }

