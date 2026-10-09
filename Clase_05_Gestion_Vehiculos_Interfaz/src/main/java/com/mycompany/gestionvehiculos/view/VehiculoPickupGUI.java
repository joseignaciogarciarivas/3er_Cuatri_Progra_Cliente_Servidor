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
    private static final long serialVersionUID = 1L;
    private static final Color COLOR_FONDO =new Color(245,247,250);
    private static final Color COLOR_CABECERA =new Color(33,37,41);
    private static final Color COLOR_PANEL = Color.WHITE;
    
    public List<VehiculoPickup> listaPickups = new ArrayList<>();
    public int indSeleccionado =-1;
    
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
    
    public VehiculoPickupGUI(){
        super("Registro Pickups");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(COLOR_FONDO);
        setMinimumSize(new Dimension(1120,760));
        
        add(crearPanelCabecera(), BorderLayout.NORTH);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private JPanel crearPanelCabecera(){
        JPanel panel = new JPanel(new BorderLayout(8,4));
        panel.setBackground(COLOR_CABECERA);
        panel.setBorder(new EmptyBorder(14,20,14,20));
        
        JLabel lblTitulo = new JLabel("Registro de Pickups");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        
        JLabel lblSubTitulo = new JLabel("Registre, Edite y elimine pickups desde una sola pantalla");
        lblSubTitulo.setForeground(Color.WHITE);
        lblSubTitulo.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
        
        panel.add(lblTitulo, BorderLayout.NORTH);
        panel.add(lblSubTitulo, BorderLayout.SOUTH);
        return panel;
    }
}
