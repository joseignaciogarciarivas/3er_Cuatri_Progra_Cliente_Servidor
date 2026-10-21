/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos.view;

import javax.swing.JFrame;
import com.mycompany.gestionvehiculos.model.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laboratorio
 */
public class VehiculoPickupGUI extends JFrame {

    // <editor-fold defaultstate="collapsed" desc="MACHOTE">
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="DECLARACION DE VARIABLES GLOBALES">
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

    //componentes de pickup
    public JRadioButton jrDoble;
    public JTextField txtCapacidadCarga, txtAlturaCajon, txtLongitudCajon,
            txtTipoCabina, txtTipoCajon;

    public DefaultTableModel ModeloPickup;
    public JTable TablaPickup;

    public JButton btnGuardar, btnActualizar, btnEliminar;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="VENTANA">
    public VehiculoPickupGUI() {
        super("Registro Pickups");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(0, 0, 0));
        setMinimumSize(new Dimension(1120, 760));

        add(crearPanelCabecera(), BorderLayout.NORTH);

        setLocationRelativeTo(null);
        setVisible(true);

//Configuracion Ventana
        setTitle("Vehiculo Pickup");
        //super("Componentes Básicos de Swing");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);//Centrada en la pantalla
        getContentPane().setBackground(new Color(211, 211, 211));
        setMinimumSize(new Dimension(1120, 760));

        setVisible(true);

        //Panel contenedor info del vehiculo
        JPanel panelFormularioVehiculo = new JPanel();
        panelFormularioVehiculo.setLayout(null);
        panelFormularioVehiculo.setOpaque(false);
        panelFormularioVehiculo.setBounds(30, 100, 530, 200);
        panelFormularioVehiculo.setBorder(
                BorderFactory.createTitledBorder("Informacion del vehiculo")
        );

        JLabel lblMarca = new JLabel("Marca:");
        lblMarca.setBounds(30, 40, 150, 25);
        panelFormularioVehiculo.add(lblMarca);
        
        //Campo de texto / caja texto
        JTextField txtMarca = new JTextField();
        txtMarca.setBounds(130, 40, 125, 25);
        panelFormularioVehiculo.add(txtMarca);
        
        JLabel lblModelo = new JLabel("Modelo:");
        lblModelo.setBounds(30, 70, 100, 25);
        panelFormularioVehiculo.add(lblModelo);
        //Campo de texto / caja texto
        JTextField txtModelo = new JTextField();
        txtModelo.setBounds(130, 70, 125, 25);
        panelFormularioVehiculo.add(txtModelo);
        
        JLabel lblAnioFabricacion = new JLabel("Año de Fabricacion");
        lblAnioFabricacion.setBounds(30, 100, 100, 25);
        panelFormularioVehiculo.add(lblAnioFabricacion);
        //Campo de texto / caja texto
        JTextField txtAnioFabricacion = new JTextField();
        txtAnioFabricacion.setBounds(130, 100, 125, 25);
        panelFormularioVehiculo.add(txtAnioFabricacion);
        
        JLabel lblnumchasis = new JLabel("# de Chasis:");
        lblnumchasis.setBounds(30, 130, 100, 25);
        panelFormularioVehiculo.add(lblnumchasis);
        //Campo de texto / caja texto
        JTextField txtnumchasis = new JTextField();
        txtnumchasis.setBounds(130, 130, 125, 25);
        panelFormularioVehiculo.add(txtnumchasis);
        
        JLabel lblTraccion = new JLabel("Traccion:");
        lblTraccion.setBounds(280, 40, 150, 25);
        panelFormularioVehiculo.add(lblTraccion);
        //Campo de texto / caja texto
        JTextField txtTraccion = new JTextField();
        txtTraccion.setBounds(390, 40, 125, 25);
        panelFormularioVehiculo.add(txtTraccion);
        
            JLabel lblCantPuertas = new JLabel("Cantidad de Puertas:");
        lblCantPuertas.setBounds(280, 70, 100, 25);
        panelFormularioVehiculo.add(lblCantPuertas);
        //Campo de texto / caja texto
        JTextField txtCantPuertas = new JTextField();
        txtCantPuertas.setBounds(390, 70, 125, 25);
        panelFormularioVehiculo.add(txtCantPuertas);
        
        JLabel lblCantAsientos = new JLabel("Cantidad de Asientos:");
        lblCantAsientos.setBounds(280, 100, 100, 25);
        panelFormularioVehiculo.add(lblCantAsientos);
        //Campo de texto / caja texto
        JTextField txtCantAsientos = new JTextField();
        txtCantAsientos.setBounds(390, 100, 125, 25);
        panelFormularioVehiculo.add(txtCantAsientos);
        
        JLabel lblColor = new JLabel("Color:");
        lblColor.setBounds(280, 130, 100, 25);
        panelFormularioVehiculo.add(lblColor);
        //Campo de texto / caja texto
        JTextField txtColor = new JTextField();
        txtColor.setBounds(390, 130, 125, 25);
        panelFormularioVehiculo.add(txtColor);
        
        
        
       

        //Panel contenedor info del motor
        JPanel panelFormularioMotor = new JPanel();
        panelFormularioMotor.setLayout(null);
        panelFormularioMotor.setOpaque(false);
        panelFormularioMotor.setBounds(30, 310, 530, 100);
        panelFormularioMotor.setBorder(
                BorderFactory.createTitledBorder("Informacion del motor")
        );

        JLabel lblCilindros = new JLabel("Cilindros:");
        lblCilindros.setBounds(30, 40, 100, 25);
        panelFormularioMotor.add(lblCilindros);
        //Campo de texto / caja texto
        JTextField txtcilindros = new JTextField();
        txtcilindros.setBounds(130, 40, 125, 25);
        panelFormularioMotor.add(txtcilindros);
        
        
        
        JLabel lblTipoCombustible = new JLabel("Tipo de Combustible:");
        lblTipoCombustible.setBounds(280, 40, 100, 25);
        panelFormularioMotor.add(lblTipoCombustible);
        
        String[] combustible = {
            "Seleccione la provincia",
            "Gasolina",
            "Diesel",
            "Super"
 
        };
        
        
        JComboBox<String> txtTipoCombustible = new JComboBox<>(combustible);
        txtTipoCombustible.setBounds(390, 40, 125, 25);
        panelFormularioMotor.add(txtTipoCombustible);
        
        
         //Panel contenedor info del motor
        JPanel panelFormularioPickup = new JPanel();
        panelFormularioPickup.setLayout(null);
        panelFormularioPickup.setOpaque(false);
        panelFormularioPickup.setBounds(30, 430, 530, 150);
        panelFormularioPickup.setBorder(
                BorderFactory.createTitledBorder("Informacion de la Pickup")
        );
        
        JLabel lblTipoCabina = new JLabel("Tipo de Cabina:");
        lblTipoCabina.setBounds(30, 40, 100, 25);
        panelFormularioPickup.add(lblTipoCabina);
        //Campo de texto / caja texto
        JTextField txtTipoCabina = new JTextField();
        txtTipoCabina.setBounds(130, 40, 125, 25);
        panelFormularioPickup.add(txtTipoCabina);
        
        JLabel lblTipoCajon = new JLabel("Tipo de Cajon:");
        lblTipoCajon.setBounds(30, 70, 100, 25);
        panelFormularioPickup.add(lblTipoCajon);
        //Campo de texto / caja texto
        JTextField txtTipoCajon = new JTextField();
        txtTipoCajon.setBounds(130, 70, 125, 25);
        panelFormularioPickup.add(txtTipoCajon);
        
        JLabel lblCapacidadCarga = new JLabel("Capacidad de Carga(kg):");
        lblCapacidadCarga.setBounds(30, 100, 100, 25);
        panelFormularioPickup.add(lblCapacidadCarga);
        //Campo de texto / caja texto
        JTextField txtCapacidadCarga = new JTextField();
        txtCapacidadCarga.setBounds(130, 100, 125, 25);
        panelFormularioPickup.add(txtCapacidadCarga);
        
         JLabel lblAlturaCajon = new JLabel("Altura de Cajon(m):");
        lblAlturaCajon.setBounds(280, 40, 150, 25);
        panelFormularioPickup.add(lblAlturaCajon);
        //Campo de texto / caja texto
        JTextField txtAlturaCajon = new JTextField();
        txtAlturaCajon.setBounds(390, 40, 125, 25);
        panelFormularioPickup.add(txtAlturaCajon);
        
        JLabel lblLongCajon = new JLabel("Longitud del Cajon(m):");
        lblLongCajon.setBounds(280, 70, 100, 25);
        panelFormularioPickup.add(lblLongCajon);
        //Campo de texto / caja texto
        JTextField txtLongCajon = new JTextField();
        txtLongCajon.setBounds(390, 70, 125, 25);
        panelFormularioPickup.add(txtLongCajon);
        
        JLabel lblDoblecabina = new JLabel("Doble Cabina:");
        lblDoblecabina.setBounds(280, 100, 100, 25);
        panelFormularioPickup.add(lblDoblecabina);
        //Campo de texto / caja texto
        
        JRadioButton rbNo = new JRadioButton("No");
        rbNo.setBounds(460, 100, 50, 25);
        rbNo.setBackground(new Color(40, 40, 66));
        
        
        JRadioButton rbSi = new JRadioButton("Sí");
        rbSi.setBounds(390, 100, 50, 25);
        rbSi.setBackground(new Color(40, 40, 66));
        
        
        
        
        ButtonGroup Siono = new ButtonGroup();
        Siono.add(rbSi);
        Siono.add(rbNo);
        
        panelFormularioPickup.add(rbSi);
        panelFormularioPickup.add(rbNo);
        
        
        JPanel panelFormularioBotones = new JPanel();
        panelFormularioBotones.setLayout(null);
        panelFormularioBotones.setOpaque(false);
        panelFormularioBotones.setBounds(30, 600, 530, 100);
        panelFormularioBotones.setBorder(
                BorderFactory.createTitledBorder("Informacion del motor")
        );
        
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(90, 40, 110, 35);
        panelFormularioBotones.add(btnGuardar);
        
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(250, 40, 110, 35);
        panelFormularioBotones.add(btnLimpiar);
        
        JPanel panelTabla = new JPanel();
        panelTabla.setLayout(null);
        panelTabla.setOpaque(false);
        panelTabla.setBounds(560,100,520,600);
        panelTabla.setBorder(
                BorderFactory.createTitledBorder("Lista de Pickups")
        );
        
        //Modelo Tabla
        String[] columnas = {
            "Marca",
            "Modelo",
            "Año",
            "Combustible",
            "Traccion",
            "Cabina",
            "Carga (kg)"
        };
        
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas,0);
        JTable tablaPersonas = new JTable(modeloTabla);
        
        tablaPersonas.setDefaultEditor(Object.class, null);// bloquea edicion
        tablaPersonas.setShowHorizontalLines(true);
        tablaPersonas.setShowVerticalLines(false);
        tablaPersonas.setRowHeight(25);
        
        //estilo al encabezado de la tabla
        tablaPersonas.getTableHeader().setBackground(Color.BLACK);
        tablaPersonas.getTableHeader().setForeground(Color.WHITE);
        tablaPersonas.getTableHeader().setFont(
                new Font("Arial", Font.BOLD, 14)
        );
        
        JScrollPane scrollTabla = new JScrollPane(tablaPersonas);
        scrollTabla.setBounds(20, 40, 470, 530);
        panelTabla.add(scrollTabla);
        
        add(panelFormularioVehiculo);
        add(panelFormularioMotor);
        add(panelFormularioPickup);
        add(panelFormularioBotones);
        add(panelTabla);
        setLocationRelativeTo(null);
        setVisible(true);
        
         btnGuardar.addActionListener(e->{
            String marca = txtMarca.getText();
            String modelo = txtModelo.getText();
            String Año = txtAnioFabricacion.getText();
            String opcombustible = txtTipoCombustible.getSelectedItem().toString();
            String traccion = txtTraccion.getText();
            String cabina = txtTipoCabina.getText();
            String carga = txtCapacidadCarga.getText();
            
            
              Object[] fila = {
                marca,
                modelo,
                Año,
                opcombustible,
                traccion,
                cabina,
                carga
            };
              
            modeloTabla.addRow(fila);
            
            JOptionPane.showMessageDialog(
                    this, 
                    marca + " Se ha registrado correctamente.", 
                    "Registro de Pickup", 
                    JOptionPane.INFORMATION_MESSAGE);
              
         });
         
         btnLimpiar.addActionListener(e->{
            txtMarca.setText("");
            txtModelo.setText("");
            txtTipoCombustible.setSelectedIndex(0);
            txtAnioFabricacion.setText("");
            txtTraccion.setText("");
            txtTipoCabina.setText("");
            txtCapacidadCarga.setText("");
           
        });
         
         
          
        
        
        
        
    }

    // </editor-fold>
    
    
    
    // <editor-fold defaultstate="collapsed" desc="CABECERA">
    
    private JPanel crearPanelCabecera() {
        JPanel panel = new JPanel(new BorderLayout(8, 4));
        panel.setBackground(COLOR_CABECERA);
        panel.setBorder(new EmptyBorder(14, 20, 14, 20));

        JLabel lblTitulo = new JLabel("Registro de Pickups");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        JLabel lblSubTitulo = new JLabel("Registre, Edite y elimine pickups desde una sola pantalla");
        lblSubTitulo.setForeground(Color.WHITE);
        lblSubTitulo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        panel.add(lblTitulo, BorderLayout.NORTH);
        panel.add(lblSubTitulo, BorderLayout.SOUTH);
        return panel;
    }
    // </editor-fold>
}
