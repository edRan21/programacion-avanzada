import java.util.Scanner;

class Persona {
    public String nombre;
    public int edad;

    // Constructor parametrizado
    // Publico para poder ser modificado/manipulado desde cualquier parte del programa.
   public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
   }

    void leerNombre(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nombre = leer.nextLine();
    }

    void escribirNombre(){
        System.out.println("El nombre registrado es: "+ nombre);
    }
}

class Empleado extends Persona {
    public double sueldoBase;

    public Empleado(String nombre, int edad, double sueldoBase) {
        super(nombre, edad);
        this.sueldoBase = sueldoBase;
    }

    void leerSueldo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el sueldo del empleado: ");
        sueldoBase = leer.nextDouble();
    }

    void escribirSueldo(){
        System.out.println("El sueldo del empleado es: "+ sueldoBase);
    }
}

class Directivo extends Empleado {
    public String categoria;

    public Directivo(String nombre, int edad, double sueldoBase, String categoria) {
        super(nombre, edad, sueldoBase);
        this.categoria = categoria;
    }

    void leerCategoria(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la categoria del Directivo");
        categoria = leer.nextLine();
    }

    void escribirCategoria(){
        System.out.println("La categoria del Directivo es: "+ categoria);
    }
}

class Cliente extends Persona {
    public String telContacto;

    public Cliente(String nombre, int edad, String telContacto){
        super(nombre, edad);
        this.telContacto = telContacto;
    }

    void leerTelefono(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de contacto del cliente: ");
        telContacto = leer.nextLine();
    }

    void escribirTelefono(){
        System.out.println("El telefono del contacto del cliente es: "+ telContacto);
    }
}

public class PracticaSuper {
    public static void main(String[] args){
        // Creamos a nuestro primer objeto, una intancia de cliente
        // Desde la instancia inicializamos los tres valores/ atributos que componenen a un Cliente
        Cliente cliente = new Cliente("ana", 29, "+52 2211781925");

        Scanner teclado = new Scanner(System.in);

        String nombre;
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine();

        int edad;
        System.out.println("Ingrese la edad del empleado: ");
        edad = teclado.nextInt();

        double sueldoBase;
        System.out.println("Ingrese el sueldo del empleado: ");
        sueldoBase = teclado.nextDouble();

        Empleado empleado = new Empleado(nombre, edad, sueldoBase);

        Directivo directivo = new Directivo("papulince", 87, 1500, "CTO");
    }
}
