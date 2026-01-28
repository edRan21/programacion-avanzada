/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
class persona 
{
    
    // atributos de la clase
    public String nombre;
    public int edad;
    public float estatura;
    public float peso;
    public String nacionalidad;
    public int diaNacimiento;
    public int mesNacimiento;
    public int agnoNacimiento;
    
    /* Métodos leer de la clase persona quienes modifican sus atributos. 
        lee la entrada del usuario para darles un estado a los objeto en sus atributos.
    */
    
    public void leerNombre()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tu nombre: ");
        nombre = leer.nextLine();
    }
    
    public void leerEdad()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tu Edad: ");
        edad = leer.nextInt();
    }
    
    public void leerEstatura()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tu estatura (SIN punto decimal): ");
        estatura = leer.nextFloat();
    }
    
    public void leerPeso()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tu peso: ");
        peso = leer.nextFloat();
    }
    
    public void leerNacionalidad()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tu nacionalidad: ");
        nacionalidad = leer.nextLine();
    }
    
    public void leer_diaNacimiento()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tu dia de nacimiento: ");
        diaNacimiento = leer.nextInt();
    }
    
    public void leer_mesNacimiento()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tu mes de nacimiento: ");
        mesNacimiento = leer.nextInt();
    }
    
    public void leer_agnoNacimiento()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tu año de nacimiento: ");
        agnoNacimiento = leer.nextInt();
    }
    
    /* Métodos o funciones miembro de la clase persona.
        modifican sus atributos (escribe en pantalla el estado del objeto)
    */
    public void escribir_nombre()
    {
        System.out.print("Te llamas " + nombre);
    }
    
    public void escribir_edad()
    {
        if (edad >= 50){
            System.out.print(" y tienes la edad de " + edad + " años, eres viejo");
        }
        else if (edad >= 30){
            System.out.print(" y tienes la edad de " + edad + " años, estas sabroso");
        }
        else {
            System.out.print(" y tienes la edad de " + edad + " años, eres joven");
        }
    }
    
    public void escribir_estatura()
    {
        if (estatura <= 170){
            System.out.print(" con una estatura de " + estatura + " centimetros,eres chaparro");
        }
        else {
            System.out.print(" con una estatura de " + estatura + " centimetros,eres un rascacielos");
        }
    }
    
    public void escribir_peso()
    {
        if (peso >= 90.0){
            System.out.println(" y un peso en kg de " + peso + ", eres un tinaco.");
        }
        else {
            System.out.println(" y un peso en kg de " + peso + ", tienes buen peso.");
        }
    }
    
    public void escribir_nacionalidad()
    {
        System.out.println("Nacionalidad: " + nacionalidad);
    }
    
    public void escribir_diaNacimiento()
    {
        System.out.println("Dia de nacimiento: " + diaNacimiento);
    }
    
    public void escribir_mesNacimiento()
    {
        System.out.println("Mes de nacimiento: " + mesNacimiento);
    }
    
    public void escribir_agnoNacimiento()
    {
        System.out.println("Año de nacimiento: " + agnoNacimiento);
    }
}

public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona Angel = new persona();
        
        // métodos leer del objeto Angel: solicita un estado del objeto
        
        Angel.leerNombre();
        Angel.leerEdad();
        Angel.leerEstatura();
        Angel.leerPeso();
        Angel.leerNacionalidad();
        Angel.leer_diaNacimiento();
        Angel.leer_mesNacimiento();
        Angel.leer_agnoNacimiento();
        
        // métodos escribir del objeto Angel: muestra el estado del objeto
        
        Angel.escribir_nombre();
        Angel.escribir_edad();
        Angel.escribir_estatura();
        Angel.escribir_peso();
        System.out.println("Datos extra: ");
        Angel.escribir_nacionalidad();
        Angel.escribir_diaNacimiento();
        Angel.escribir_mesNacimiento();
        Angel.escribir_agnoNacimiento();
    }
    
}
