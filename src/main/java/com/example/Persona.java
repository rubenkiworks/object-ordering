package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Persona implements Comparable<Persona>{

    private String nombre;
    private String primerAp;
    private String segundoAp;
    private Genero genero;
    private LocalDate fechaNac;
    private double salario;

    public static List<Persona> getPersonas() {
        List<Persona> personas = new ArrayList<>();

        personas.add(Persona.builder().nombre("Ruben").primerAp("Gomez")
                .segundoAp("Sabio").genero(Genero.HOMBRE).
                fechaNac(LocalDate.of(2000, Month.SEPTEMBER, 23))
                .salario(4500.5).build());

        personas.add(
                Persona.builder()
                        .nombre("Juan")
                        .primerAp("Guerrero")
                        .segundoAp("Leon")
                        .genero(Genero.HOMBRE)
                        .fechaNac(LocalDate.of(1997, Month.MAY, 23))
                        .salario(10000.50)
                        .build()
        );

        personas.add(
                Persona.builder()
                        .nombre("Ivan")
                        .primerAp("Reina")
                        .segundoAp("Galvez")
                        .genero(Genero.HOMBRE)
                        .fechaNac(LocalDate.of(2001, Month.OCTOBER, 10))
                        .salario(6500.50)
                        .build()
        );

        personas.add(
                Persona.builder()
                        .nombre("Antonio")
                        .primerAp("Saez")
                        .segundoAp("Vagace")
                        .genero(Genero.HOMBRE)
                        .fechaNac(LocalDate.of(1990, Month.DECEMBER, 3))
                        .salario(8500.50)
                        .build()
        );

        personas.add(
                Persona.builder()
                        .nombre("Marcos")
                        .primerAp("Perez")
                        .segundoAp("Serrano")
                        .genero(Genero.HOMBRE)
                        .fechaNac(LocalDate.of(1996, Month.APRIL, 23))
                        .salario(9500.50)
                        .build()
        );
        personas.add(
                Persona.builder()
                        .nombre("Elli")
                        .primerAp("Fdez")
                        .segundoAp("Hdez")
                        .genero(Genero.MUJER)
                        .fechaNac(LocalDate.of(2005, Month.SEPTEMBER, 14))
                        .salario(3000.50)
                        .build()
        );

        personas.add(
                Persona.builder()
                        .nombre("Paca")
                        .primerAp("Fdez")
                        .segundoAp("Hdez")
                        .genero(Genero.MUJER)
                        .fechaNac(LocalDate.of(2004, Month.JULY, 14))
                        .salario(3000.50)
                        .build()
        );

        return personas;
    }

    @Override
    public int compareTo(Persona persona) {
        // Comparamos las personas primero por el primer apellido, luego por el segundo y luego el nombre
        int cmpPrimerApellido = this.primerAp.compareTo(persona.getPrimerAp());
        int cmpSegundoApellido = this.segundoAp.compareTo(persona.getSegundoAp());
        int cmpNombre = this.nombre.compareTo(persona.getNombre());

        return cmpPrimerApellido != 0 ? cmpPrimerApellido : 
        cmpSegundoApellido != 0 ? cmpSegundoApellido : cmpNombre;
    }
}
