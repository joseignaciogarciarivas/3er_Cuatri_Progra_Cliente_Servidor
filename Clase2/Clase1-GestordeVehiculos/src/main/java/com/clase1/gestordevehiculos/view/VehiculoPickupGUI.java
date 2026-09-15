/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase1.gestordevehiculos.view;

import javax.swing.JFrame;
import com.clase1.gestordevehiculos.model.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Laboratorio
 */
public class VehiculoPickupGUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final Color COLOR_FONDO = new Color(245,247,250);
    private static final Color COLOR_CABECERA = new Color(33,37,41);
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
    
    //Componenetes de Pickup
    public JRadioButton jrDoble;
    public JTextField txtCapacidadCarga, txtAlturaCajon, txtLongitudCajon,
            txtTipoCabina, txtTipoCajon;
   

    
}
