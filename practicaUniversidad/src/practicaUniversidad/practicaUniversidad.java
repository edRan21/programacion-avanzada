package practicaUniversidad;
import java.util.Scanner;
import java.util.ArrayList;

class Universidad {
    private String nombre = "Benemerita Univeridad Autonoma de Puebla";
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void altaEstudiante(Estudiante nuevoEst) {
        listaEstudiantes.add(nuevoEst);
        System.out.println("Estudiante registrado... ");
    }

    public void bajaEstudiante(String busquedaEstudiante) {
        if (busquedaEstudiante.length() > 9) {
            System.out.println("Matricula invalida, no se procede con la baja...");
        } else {
            boolean encontrado = false;
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                if (busquedaEstudiante.equals(listaEstudiantes.get(i).getMatricula())) {
                    listaEstudiantes.remove(i);
                    System.out.println("Estudiante dado de baja correctamente.");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Sin estudiantes con esa matrícula.");
            }
        }
    }

    public void busquedaPorNombre(String busquedaNombre) {
        boolean encontrado = false;
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            // equalsIgnoreCase, no importe si escriben en mayúsculas o minúsculas
            if (busquedaNombre.equalsIgnoreCase(listaEstudiantes.get(i).nombre)) {
                imprimirDatosCompletos(listaEstudiantes.get(i));
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Sin estudiantes con ese nombre.");
    }

    public void busquedaPorMatricula(String busquedaMatricula) {
        boolean encontrado = false;
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (busquedaMatricula.equals(listaEstudiantes.get(i).getMatricula())) {
                imprimirDatosCompletos(listaEstudiantes.get(i));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("No se encontró ningún estudiante con esa matrícula");
    }

    public void busquedaPorPromedio(double busquedaPromedio) {
        boolean encontrado = false;
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (busquedaPromedio == listaEstudiantes.get(i).promedio) {
                imprimirDatosCompletos(listaEstudiantes.get(i));
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No hay estudiantes con ese promedio.");
    }

    public void mostrarTodos() {
        if (listaEstudiantes.size() == 0) {
            System.out.println("Registro vacío.");
        } else {
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                imprimirDatosCompletos(listaEstudiantes.get(i));
            }
        }
    }

    private void imprimirDatosCompletos(Estudiante est) {
        System.out.println("-------------------------");
        est.escribirNombre();
        System.out.println("Matrícula: " + est.getMatricula());
        est.escribirCarrera();
        System.out.println();
        est.escribirSemestre();
        System.out.println();
        est.escribirPromedio();
        System.out.println();
        System.out.println("-------------------------");
    }
}

class Estudiante {
    public String nombre;
    private String matricula;
    public double promedio;
    public String carrera;
    public String semestre;
    public String direccion;
    public String telefono;

    Scanner scanner = new Scanner(System.in);

    public void leerNombre() {
        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = scanner.nextLine();
    }

    public void escribirNombre() {
        System.out.println("Nombre: " + nombre);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula.length() > 9) {
            System.out.println("Matricula invalida.");
        } else {
            this.matricula = matricula;
        }
    }

    public void leerPromedio() {
        System.out.println("Ingrese el promedio del estudiante: ");
        promedio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer después de leer un double
    }

    public void escribirPromedio() {
        System.out.print("Promedio: " + promedio);
    }

    public void leerCarrera() {
        System.out.println("Ingrese la carrera del estudiante: ");
        carrera = scanner.nextLine();
    }

    public void escribirCarrera() {
        System.out.print("Carrera: " + carrera);
    }

    public void leerSemetre() {
        System.out.println("Ingrese el semestre del estudiante: ");
        semestre = scanner.nextLine();
    }

    public void escribirSemestre() {
        System.out.print("Semestre: " + semestre);
    }

    public void leerDireccion() {
        System.out.println("Ingrese la dirección del estudiante: ");
        direccion = scanner.nextLine();
    }

    public void escribirDireccion() {
        System.out.print("Dirección: " + direccion);
    }

    public void leerTelefono() {
        System.out.println("Ingrese el telefono del estudiante: ");
        if (telefono != null && telefono.length() > 13) {
            System.out.println("Telefono invalido, ingrese nuevamente");
        } else {
            telefono = scanner.nextLine();
        }
    }

    public void escribirTelefono() {
        System.out.print("Telefóno: " + telefono);
    }
}

public class practicaUniversidad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Universidad BUAP = new Universidad();

        int opcion;
        do {
            System.out.println("\n------Registro de Estudiantes BUAP----");
            System.out.println("Univeridad: " + BUAP.getNombre());
            System.out.println("1. Alta de Estudiantes");
            System.out.println("2. Baja de Estudiantes");
            System.out.println("3. Consulta de Estudiantes");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n----Alta del estudiante---- ");
                    Estudiante estudiante = new Estudiante();
                    estudiante.leerNombre();

                    System.out.println("Ingrese la matricula: ");
                    String matri = entrada.nextLine();
                    estudiante.setMatricula(matri);

                    estudiante.leerCarrera();
                    estudiante.leerSemetre();
                    estudiante.leerPromedio();
                    estudiante.leerDireccion();
                    estudiante.leerTelefono();

                    BUAP.altaEstudiante(estudiante);
                    break;

                case 2:
                    System.out.println("\n----Baja del estudiante---- ");
                    System.out.println("Ingrese la matricula a dar de baja: ");
                    String busquedaEstudiante = entrada.nextLine();
                    BUAP.bajaEstudiante(busquedaEstudiante);
                    break;

                case 3:
                    System.out.println("\n----Consulta de Estudiantes----");
                    System.out.println("Ingrese el inciso de consulta:");
                    System.out.println("a. Por nombre");
                    System.out.println("b. Por matricula");
                    System.out.println("c. Por promedio");
                    System.out.println("d. TODAS LAS ANTERIORES");
                    System.out.println("e. Cancelar");

                    String inciso = entrada.nextLine();

                    switch (inciso.toLowerCase()) {
                        case "a":
                            System.out.println("Ingrese el nombre a buscar: ");
                            String busquedaNombre = entrada.nextLine();
                            BUAP.busquedaPorNombre(busquedaNombre);
                            break;
                        case "b":
                            System.out.println("Ingrese la matricula a buscar: ");
                            String busquedaMatricula = entrada.nextLine();
                            BUAP.busquedaPorMatricula(busquedaMatricula);
                            break;
                        case "c":
                            System.out.println("Ingrese el promedio a buscar: ");
                            double busquedaPromedio = entrada.nextDouble();
                            entrada.nextLine();
                            BUAP.busquedaPorPromedio(busquedaPromedio);
                            break;
                        case "d":
                            System.out.println("Mostrando los estudiantes registrados:");
                            BUAP.mostrarTodos();
                            break;
                        case "e":
                            System.out.println("Cancelando consulta...");
                            break;
                        default:
                            System.out.println("Inciso no válido.");
                    }
                    break;

                case 4:
                    System.out.println("Cerrando sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        entrada.close();
    }
}