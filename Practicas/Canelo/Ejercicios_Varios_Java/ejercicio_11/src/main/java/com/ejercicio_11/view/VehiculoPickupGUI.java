package com.ejercicio_11.view;

import com.ejercicio_11.model.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class VehiculoPickupGUI extends JFrame {

    private static final long serialVersionUID = 1L;

    private static final Color COLOR_FONDO = new Color(245, 247, 250);
    private static final Color COLOR_CABECERA = new Color(33, 37, 41);
    private static final Color COLOR_PANEL = Color.WHITE;

    public List<VehiculoPickup> listaPickups = new ArrayList<>();
    public int indSeleccionado = -1;

    public JButton btnLimpiar;
    public JButton btnGuardar;
    public JButton btnActualizar;
    public JButton btnEliminar;

    // Componentes para Motor
    public JTextField txtCilindros;
    public JComboBox<TiposCombustible> cmbTiposCombustible;

    // Componentes de Vehículo
    public JTextField txtMarca;
    public JTextField txtNumeroChasis;
    public JTextField txtTraccion;
    public JTextField txtCantPuertas;
    public JTextField txtCantAsientos;
    public JTextField txtModelo;
    public JTextField txtAnioFabricacion;
    public JColorChooser jcColor;

    // Componentes de Pickup
    public JRadioButton jrDoble;
    public JTextField txtCapacidadCarga;
    public JTextField txtAlturaCajon;
    public JTextField txtLongitudCajon;
    public JTextField txtTipoCabina;
    public JTextField txtTipoCajon;

    public DefaultTableModel modeloTabla;
    public JTable tablaVehiculos;

    //Constructor
    public VehiculoPickupGUI() {

        super("Registro Pickups");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setMinimumSize(new Dimension(800, 600));
        setLayout(new BorderLayout());
        getContentPane().setBackground(COLOR_FONDO);

        add(crearPanelCabecera(), BorderLayout.NORTH);

        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(COLOR_FONDO);
        panelCentro.setLayout(new BoxLayout(panelCentro, BoxLayout.Y_AXIS));

        panelCentro.add(crearPanelVehiculo());
        panelCentro.add(Box.createVerticalStrut(10));

        panelCentro.add(crearPanelMotor());
        panelCentro.add(Box.createVerticalStrut(10));

        panelCentro.add(crearPanelPickup());
        panelCentro.add(Box.createVerticalStrut(10));

        add(crearPanelCabecera(), BorderLayout.NORTH);
        add(crearTablaVehiculos(), BorderLayout.EAST);
        add(panelCentro, BorderLayout.CENTER);
        add(crearPanelBotones(), BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
        
        btnGuardar.addActionListener(e -> guardarVehiculo());
        btnLimpiar.addActionListener(e -> limpiarFormulario());
    }

    private JPanel crearPanelVehiculo() {

        JPanel panelFormularioVehiculo = new JPanel(new GridLayout(4, 4, 10, 10));
        panelFormularioVehiculo.setBackground(COLOR_PANEL);
        panelFormularioVehiculo.setBorder(
                BorderFactory.createTitledBorder("Información del Vehículo"));

        txtMarca = new JTextField(15);
        txtModelo = new JTextField(15);
        txtAnioFabricacion = new JTextField(15);
        txtNumeroChasis = new JTextField(15);
        txtTraccion = new JTextField(15);
        txtCantPuertas = new JTextField(15);
        txtCantAsientos = new JTextField(15);

        JTextField txtColor = new JTextField(15);

        panelFormularioVehiculo.add(new JLabel("Marca:"));
        panelFormularioVehiculo.add(txtMarca);

        panelFormularioVehiculo.add(new JLabel("Tracción:"));
        panelFormularioVehiculo.add(txtTraccion);

        panelFormularioVehiculo.add(new JLabel("Modelo:"));
        panelFormularioVehiculo.add(txtModelo);

        panelFormularioVehiculo.add(new JLabel("Cantidad Puertas:"));
        panelFormularioVehiculo.add(txtCantPuertas);

        panelFormularioVehiculo.add(new JLabel("Año Fabricación:"));
        panelFormularioVehiculo.add(txtAnioFabricacion);

        panelFormularioVehiculo.add(new JLabel("Cantidad Asientos:"));
        panelFormularioVehiculo.add(txtCantAsientos);

        panelFormularioVehiculo.add(new JLabel("Número de Chasis:"));
        panelFormularioVehiculo.add(txtNumeroChasis);

        panelFormularioVehiculo.add(new JLabel("Color:"));
        panelFormularioVehiculo.add(txtColor);

        panelFormularioVehiculo.setMaximumSize(
                new Dimension(Integer.MAX_VALUE, 180));

        return panelFormularioVehiculo;
    }

    private JPanel crearPanelMotor() {

        JPanel panelFormularioMotor = new JPanel(new GridLayout(2, 2, 10, 10));
        panelFormularioMotor.setBackground(COLOR_PANEL);
        panelFormularioMotor.setBorder(
                BorderFactory.createTitledBorder("Información del Motor"));

        txtCilindros = new JTextField(15);
        cmbTiposCombustible = new JComboBox<>();

        panelFormularioMotor.add(new JLabel("Cilindros:"));
        panelFormularioMotor.add(txtCilindros);

        panelFormularioMotor.add(new JLabel("Tipo Combustible:"));
        panelFormularioMotor.add(cmbTiposCombustible);

        panelFormularioMotor.setMaximumSize(
                new Dimension(Integer.MAX_VALUE, 100));

        return panelFormularioMotor;
    }

    private JPanel crearPanelPickup() {

        JPanel panelPickup = new JPanel(new GridLayout(3, 4, 10, 10));
        panelPickup.setBackground(COLOR_PANEL);

        panelPickup.setBorder(
                BorderFactory.createTitledBorder("Información Pickup"));

        txtCapacidadCarga = new JTextField(15);
        txtAlturaCajon = new JTextField(15);
        txtLongitudCajon = new JTextField(15);
        txtTipoCabina = new JTextField(15);
        txtTipoCajon = new JTextField(15);

        jrDoble = new JRadioButton("Cabina Doble");

        panelPickup.add(new JLabel("Capacidad Carga:"));
        panelPickup.add(txtCapacidadCarga);

        panelPickup.add(new JLabel("Altura Cajón:"));
        panelPickup.add(txtAlturaCajon);

        panelPickup.add(new JLabel("Longitud Cajón:"));
        panelPickup.add(txtLongitudCajon);

        panelPickup.add(new JLabel("Tipo Cabina:"));
        panelPickup.add(txtTipoCabina);

        panelPickup.add(new JLabel("Tipo Cajón:"));
        panelPickup.add(txtTipoCajon);

        panelPickup.add(new JLabel("Cabina Doble:"));
        panelPickup.add(jrDoble);

        panelPickup.setMaximumSize(
                new Dimension(Integer.MAX_VALUE, 150));

        return panelPickup;
    }

    private JScrollPane crearTablaVehiculos() {

        String[] columnas = {
            "Marca",
            "Modelo",
            "Año",
            "Número Chasis"
        };

        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaVehiculos = new JTable(modeloTabla);

        return new JScrollPane(tablaVehiculos);
    }

    private JPanel crearPanelCabecera() {

        JPanel panel = new JPanel(new BorderLayout(8, 4));
        panel.setBackground(COLOR_CABECERA);
        panel.setBorder(new EmptyBorder(14, 20, 14, 20));

        JLabel lblTitulo = new JLabel("Registro de Pickups");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        JLabel lblSubTitulo = new JLabel(
                "Registre, edite y elimine pickups desde una sola pantalla");
        lblSubTitulo.setForeground(Color.WHITE);
        lblSubTitulo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        panel.add(lblTitulo, BorderLayout.NORTH);
        panel.add(lblSubTitulo, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel crearPanelBotones() {

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBotones.setBackground(COLOR_FONDO);

        btnLimpiar = new JButton("Limpiar");
        btnGuardar = new JButton("Guardar");

        panelBotones.add(btnLimpiar);
        panelBotones.add(btnGuardar);

        return panelBotones;
    }

    private void guardarVehiculo() {

        modeloTabla.addRow(new Object[]{
            txtMarca.getText(),
            txtModelo.getText(),
            txtAnioFabricacion.getText(),
            txtNumeroChasis.getText()
        });

        limpiarFormulario();
    }

    private void limpiarFormulario() {

    // Vehículo
    txtMarca.setText("");
    txtModelo.setText("");
    txtAnioFabricacion.setText("");
    txtNumeroChasis.setText("");
    txtTraccion.setText("");
    txtCantPuertas.setText("");
    txtCantAsientos.setText("");

    // Motor
    txtCilindros.setText("");

    if (cmbTiposCombustible.getItemCount() > 0) {
        cmbTiposCombustible.setSelectedIndex(0);
    }

    // Pickup
    txtCapacidadCarga.setText("");
    txtAlturaCajon.setText("");
    txtLongitudCajon.setText("");
    txtTipoCabina.setText("");
    txtTipoCajon.setText("");

    jrDoble.setSelected(false);

    // Color (si lo estás utilizando)
    if (jcColor != null) {
        jcColor.setColor(Color.WHITE);
    }

    // Devolver el foco al primer campo
    txtMarca.requestFocus();
}
}
