import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RegistroEstudiantes {
    // Lista para almacenar los objetos Estudiante en ejecución.
    ArrayList<Estudiante> Estudiantes = new ArrayList<>();
    private JPanel ventanaUI;
    private JButton ALTAESTUDIANTE;
    private JButton BAJAESTUDIANTE;
    private JButton CONSULTAESTUDIANTE;
    private JPanel cuadro_boton1;
    private JPanel cuadro_boton2;
    private JPanel cuadro_boton3;
    private JPanel titulo_cuadro;
    private JPanel info_cuadro;
    private JPanel panelAlta;
    private JPanel panelBaja;
    private JPanel panelConsulta;
    private JTextField textNombre;
    private JTextField textMatricula;
    private JTextField textCarrera;
    private JTextField textSemestre;
    private JTextField textPromedio;
    private JTextField textDireccion;
    private JTextField textTelefono;
    private JButton btnGuardarAlta;
    private JList listEstudiantes;
    private JButton btnBaja;
    private JTextField textID_baja;
    private JTable tabla_estudiantes;
    private JTextField textBusquedaMatricula;
    private JButton btnBusqueda;

    // constructor de la ventana, si se llama el método se abre la ventana | se definien las propiedades de la ventana
    public RegistroEstudiantes() {
        // creamos el marco de la ventana
        JFrame frame = new JFrame("Registro Estudiantes - Autoservicios");
        // asignar el panel principal (ventanaUI) que mostrará el contenido de la ventana al crear el objeto de la ventana
        frame.setContentPane(ventanaUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        CardLayout cardLayout = (CardLayout) info_cuadro.getLayout();

        // Escuchadores para el botón de ALTAESTUDIANTE
        ALTAESTUDIANTE.addActionListener(e -> {
            cardLayout.show(info_cuadro, "Alta");
        });

        // Registro: El botón lee los registro y guarda al estudiante
        btnGuardarAlta.addActionListener(e -> {
            try {
                String nombreIngresado = textNombre.getText();
                String matriculaIngresada = textMatricula.getText();
                double promedioIngresado = Double.parseDouble(textPromedio.getText());
                String carreraIngresada = textCarrera.getText();
                String semestreIngresado = textSemestre.getText();
                String direccionIngresada = textDireccion.getText();
                String telefonoIngresado = textTelefono.getText();

                Estudiante nuevoAlumno = new Estudiante();
                nuevoAlumno.setNombre(nombreIngresado);
                nuevoAlumno.setMatricula(matriculaIngresada);
                nuevoAlumno.setPromedio(promedioIngresado);
                nuevoAlumno.setCarrera(carreraIngresada);
                nuevoAlumno.setSemestre(semestreIngresado);
                nuevoAlumno.setDireccion(direccionIngresada);
                nuevoAlumno.setTelefono(telefonoIngresado);

                Estudiantes.add(nuevoAlumno);

                JOptionPane.showMessageDialog(null, "¡Estudiante " + nombreIngresado + " registrado con éxito!");

                textNombre.setText("");
                textMatricula.setText("");
                textPromedio.setText("");
                textCarrera.setText("");
                textSemestre.setText("");
                textDireccion.setText("");
                textTelefono.setText("");

            } catch (NumberFormatException ex) {
                // Previene que el programa explote si dejan el promedio vacío o ponen letras
                JOptionPane.showMessageDialog(null, "Error: El promedio debe ser un número válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        });

        BAJAESTUDIANTE.addActionListener(e -> {
            cardLayout.show(info_cuadro, "Baja");
        });
    }
    public static void main(String[] args) {
        // llamamos al constructor donde se construye los valores  para ejecutar la ventana
        new RegistroEstudiantes();
    }
}
