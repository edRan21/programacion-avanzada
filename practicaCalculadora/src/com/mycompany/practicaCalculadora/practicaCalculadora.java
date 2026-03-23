//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.mycompany.practicaCalculadora;
import java.util.Scanner;

class Operaciones {

    int procesarSuma(int a, int b){
        return a + b;
    }
    double procesarSuma(double a, double b){
        double suma = a + b;
        return suma;
    }

    int procesarResta(int a, int b){
        int resta = a - b;
        return resta;
    }
    double procesarResta(double a, double b){
        double resta = a - b;
        return resta;
    }

    int procesarMultiplicacion(int a, int b) {
        return a * b;
    }
    double procesarMultiplicacion(double a, double b) {
        return a * b;
    }

    int procesarDivision(int a, int b){
        if (b == 0){
            System.out.println("No se puede dividir entre valor cero");
            return 1;
        }
        else {
            return a / b;
        }
    }
    double procesarDivision(double a, double b){
        if (b == 0){
            System.out.println("No se puede dividir entre valor cero");
            return 1;
        }
        else {
            return a / b;
        }
    }
}
public class practicaCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones calculadora = new Operaciones();
        int opcion;
        double a, b;

        do {
            System.out.println("----Calculadora Básica----");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opción de la operación que desea realizar: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Esperando dos números para la suma...");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Resultado (REDONDEADO): "+ calculadora.procesarSuma((int)a, (int)b));
                    System.out.println("Resultado doble precisión: "+ calculadora.procesarSuma(a, b)+ "\n");
                    break;
                case 2:
                    System.out.println("Esperando dos números para la resta...");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Resultado (REDONDEADO): "+ calculadora.procesarResta((int) a, (int) b));
                    System.out.println("Resultado doble precisión: "+ calculadora.procesarResta(a, b)+ "\n");
                    break;
                case 3:
                    System.out.println("Esperando dos números para la multiplicación...");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Resultado (REDONDEADO): "+ calculadora.procesarMultiplicacion((int)a, (int)b));
                    System.out.println("Resultado de doble presición: " + calculadora.procesarMultiplicacion(a, b)+ "\n");
                case 4:
                    System.out.println("Esperando dos números para la división...");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Resultado (REDONDEADO):"+ calculadora.procesarDivision((int)a, (int)b));
                    System.out.println("Resultado de doble presición: "+ calculadora.procesarDivision(a, b)+ "\n");
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción invalida, vuelve a intentarlo");
            }
        }
        while (opcion != 5);
        sc.close();
    }
}