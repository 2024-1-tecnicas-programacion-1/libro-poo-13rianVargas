package com.mycompany.libropoo;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int anoPublicacion;
    boolean leido;

    public Libro(String titulo, String autor, String genero, int anoPublicacion){//Complejidad Temporal: Tiempo constante O(1)
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacion = anoPublicacion;
        this.leido = false;
    }//cierra Libro

    public String mostrarInformacion(){//Complejidad Temporal: Tiempo constante O(1)
        return "Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anoPublicacion + ", Genero: " + genero;
    }//cierra mostrarInformacion

    public void marcarLeido(){//Complejidad Temporal: Tiempo constante O(1)
        leido = true;
    }//cierra marcarLeido

    public boolean esAntiguo(){//Complejidad Temporal: Tiempo constante O(1)
        return (LocalDate.now().getYear() - anoPublicacion > 50);
    }//cierra esAntiguo
}//cierra Libro
