package sistemaAgenda;
import java.time.*;
import java.util.Scanner;

class Persona {
    public String nombre;
    public String apellido;
    public int edad;

    public void leerNombre(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Capture el nombre: ");
        nombre = leer.nextLine();
        System.out.println("Capture el apellido:");
        apellido = leer.nextLine();
    }

    public void leerEdad(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Capture la edad: ");
        edad = leer.nextInt();
    }

    public void escribirNombre(){
        System.out.println("Nombre registrado: "+nombre+" "+apellido);
    }

    public void escribirEdad(){
        System.out.println("Edad registrada: "+edad);
    }
}

class Vendedor extends Persona {
    private int idTrabajdor;
    private int horaIngreso;
}


public class sistemaAgenda {
    public static void main(String[] args){

    }
}