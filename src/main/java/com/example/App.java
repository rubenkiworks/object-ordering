package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
         * 
         */

        String[] arrayDeNombres = {"Ruben", "Juan", "Antonio", "Ivan", "Marcos", "Ruben", "Ivan", "Juan"};
        List<String> nombres = Arrays.asList(arrayDeNombres);

        /* System.out.println("Lista sin ordenar: " + nombres);
        
        Collections.sort(nombres);

        System.out.println("Lista ordenada: " + nombres); */

        /*
         * Si quisieramos mostrar la lista de nombres ordenada pero que no se modificase la lista original
         * 
         */

        nombres.stream().sorted().forEach(nombre -> System.out.println(nombre));

        /*
         * Si la expresion lambda lo unico que va a hacer es invocar al metodo que realizara el trabajo
         * es mas eficiente pasar el metodo por referencia
         */
        nombres.stream().sorted().forEach(System.out::println);

        /*
         * Iterar la lista de nombres y obtener una nueva coleccion sin nombres repetidos
         */

        Set<String> nombresSinDuplicado = nombres.stream().collect(Collectors.toSet());

        System.out.println(nombresSinDuplicado);

        /*
         * Ordenar la lista de personas
         */

        List<Persona> personas = Persona.getPersonas();
        
        Collections.sort(personas);

        System.out.println(personas);

        Collections.sort(personas, 
        (Persona persona1, Persona persona2) -> persona1.getGenero().compareTo(persona2.getGenero()));
    }
}
