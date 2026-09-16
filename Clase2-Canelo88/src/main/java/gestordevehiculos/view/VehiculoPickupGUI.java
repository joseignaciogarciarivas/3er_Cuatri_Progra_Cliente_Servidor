package gestordevehiculos.view;

import gestordevehiculos.model.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VehiculoPickupGUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final Color COLOR_FONDO = new Color(245, 247, 250);
    private static final Color COLOR_CABECERA = new Color(33, 37, 41);
    private static final Color COLOR_PANEL = Color.WHITE;

    public List<VehiculoPickup> listaPickups = new ArrayList<>();
    public int indSeleccionado = -1;

    //Componentes para tomar datos de Motor
    public JTextField txtCilindros;
    public JComboBox<TiposCombustible> cmbTiposCombustible;
    //componentes de vehiculo
    public JTextField txtMarca, txtNumeroChasis, txtTraccion, txtCantPuertas,
            txtCantAsientos, txtModelo, txtAnioFabricacion;
    public JColorChooser jcColor;

    //Componenetes de Pickup
    public JRadioButton jrDoble;
    public JTextField txtCapacidadCarga, txtAlturaCajon, txtLongitudCajon,
            txtTipoCabina, txtTipoCajon;

    // Constructor
    public VehiculoPickupGUI() {
        setTitle("Gestor de Vehículos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        construirInterfaz();
    }

    // Construcción de la interfaz
    private void construirInterfaz() {

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBackground(COLOR_FONDO);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        setContentPane(panel);

        // Crear campos de Vehículo
        txtMarca = new JTextField(20);
        txtModelo = new JTextField(20);
        txtAnioFabricacion = new JTextField(20);

        // Crear campos de Motor
        txtCilindros = new JTextField(20);

        cmbTiposCombustible = new JComboBox<>(TiposCombustible.values());

        // Agregar componentes de Vehículo
        panel.add(new JLabel("Marca:"));
        panel.add(txtMarca);

        panel.add(new JLabel("Modelo:"));
        panel.add(txtModelo);

        panel.add(new JLabel("Año fabricación:"));
        panel.add(txtAnioFabricacion);

        // Agregar componentes de Motor
        panel.add(new JLabel("Cilindros:"));
        panel.add(txtCilindros);

        panel.add(new JLabel("Combustible:"));
        panel.add(cmbTiposCombustible);
    }

    // Main
    public static void main(String[] args) {

        VehiculoPickupGUI ventana = new VehiculoPickupGUI();

        ventana.setVisible(true);
    }
}
