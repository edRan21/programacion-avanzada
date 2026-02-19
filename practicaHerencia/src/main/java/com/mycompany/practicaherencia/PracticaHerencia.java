/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaherencia;

/**
 *
 * @author SALON206
 */
import java.util.Scanner;

class Biblioteca{
    public String nombre;
    
    public void escribirNombre(){
        nombre = "Alejandro Reyes Cristiani";
        System.out.println("Bliblioteca: "+ nombre);
    }
}

class Libro{
    // Atributos
    public String titulo;
    public String autor;
    public String editorial;
    public int añoPublicacion;
    public int edicion;
    public int ISBN;
    
    // Métodos leer (actuan sobre las varibles de la clase Libro)
    public void leerTitulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro: ");
        titulo = leer.nextLine();
    }
    
    public void leerAutor(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el autor del libro: ");
        autor = leer.nextLine();
    }
    
    public void leerEditorial(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la editorial del libro: ");
        editorial = leer.nextLine();
    }
    
    public void leerAñoPublicacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el año de publicación del libro: ");
        añoPublicacion = leer.nextInt();
    }
    
    public void leerEdicion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la edición del libro: ");
        edicion = leer.nextInt();
    }
    
    public void leerISBN(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBNA del libro: ");
        ISBN = leer.nextInt();
    }
    
    // Métodos escribir
    public void escribirTitulo(){
        System.out.println("El Titulo es: "+ titulo);
    }
    
    public void escribirAutor(){
        System.out.println("El Autor es: "+ autor);
    }
    
    public void escribirEditorial(){
        System.out.println("La Editorial es: "+ editorial);
    }
    
    public void escribirAñoPublicacion(){
        System.out.println("El año de publicación es: "+ añoPublicacion);
    }
    
    public void escribirEdicion(){
        System.out.println("La edición es: "+ edicion);
    }
    
    public void escribirISBN(){
        System.out.println("El ISBN es: "+ ISBN);
    }
}
class Tesis extends Libro{
    public String asesor;
    public String coAsesor;
    public String carreras;
    
    public void leerAsesor(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Asesor: ");
        asesor= leer.nextLine();
    }
    
    public void leerCoAsesor(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Co-asesor: ");
        coAsesor= leer.nextLine();
    }
    
    public void leerCarreras(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la carrera: ");
        carreras = leer.nextLine();
    }
    
    public void escribirAsesor(){
        System.out.println("El Aseosr es: "+ asesor);
    }
    
    public void escribirCoAsesor(){
        System.out.println("El co Asesor es: "+ coAsesor);
    }
    
    public void escribirCarreras(){
        System.out.println("La carrera de la tesis es: "+ carreras);
    }
}

public class PracticaHerencia {

    public static void main(String[] args) {
         = new Libro();
    }
}
