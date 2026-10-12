/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos.view;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laboratorio
 */
public class PantallaEjemplo extends JFrame {
    
    public PantallaEjemplo(){
        //Configuracion Ventana
        setTitle("Componentes Básicos de Swing");
        //super("Componentes Básicos de Swing");
        setSize(1000,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);//Centrada en la pantalla
        getContentPane().setBackground(new Color(211,211,211));
        
        setVisible(true);
        
        //Etiqueta
        JLabel lblTitulo = new JLabel("Registro Persona");
        lblTitulo.setBounds(390, 15, 300, 35);
        lblTitulo.setFont(
                new Font("Arial",Font.BOLD,24)
        );
        lblTitulo.setForeground(Color.BLUE);
        add(lblTitulo);
        
        //Panel contenedor
        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(null);
        panelFormulario.setOpaque(false);
        panelFormulario.setBounds(30,70,430,500);
        panelFormulario.setBorder(
                BorderFactory.createTitledBorder("Datos de la persona")
        );
        
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30,40,100,25);
        panelFormulario.add(lblNombre);
        //Campo de texto / caja texto
        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(130, 40, 250, 25);
        panelFormulario.add(txtNombre);
        
        JLabel lblContrasenia = new JLabel("Contraseña:");
        lblContrasenia.setBounds(30,80,100,25);
        panelFormulario.add(lblContrasenia);
        //campo de contraseña
        JPasswordField txtContrasenia = new JPasswordField();
        txtContrasenia.setBounds(130,80, 250, 25);
        panelFormulario.add(txtContrasenia);
        
        //combobox/dropdown/select
        JLabel lblProvincia = new JLabel("Provincia:");
        lblProvincia.setBounds(30,120,100,25);
        panelFormulario.add(lblProvincia);
        
        String[] provincias = {
            "Seleccione la provincia",
            "San José",
            "Alajuela",
            "Cartago",
            "Heredia",
            "Guanacaste",
            "Puntarenas",
            "Limón"
        };
        
        JComboBox<String> cmbProvincia = new JComboBox<>(provincias);
        cmbProvincia.setBounds(130, 120, 250, 25);
        panelFormulario.add(cmbProvincia);
        
        //RadioButton
        JLabel lblGenero = new JLabel("Género:");
        lblGenero.setBounds(30,160,100,25);
        panelFormulario.add(lblGenero);
        
        JRadioButton rbFemenino = new JRadioButton("Femenino");
        rbFemenino.setBounds(130, 160, 90, 25);
        rbFemenino.setBackground(new Color(211,211,211));
        
        JRadioButton rbMasculino = new JRadioButton("Masculino");
        rbMasculino.setBounds(220, 160, 100, 25);
        rbMasculino.setBackground(new Color(211,211,211));
        
        JRadioButton rbOtro = new JRadioButton("Otro");
        rbOtro.setBounds(320, 160, 70, 25);
        rbOtro.setBackground(new Color(211,211,211));
        
        //ButtonGroup hace que solo se pueda seleccionar uno
        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(rbFemenino);
        grupoGenero.add(rbMasculino);
        grupoGenero.add(rbOtro);
        
        panelFormulario.add(rbFemenino);
        panelFormulario.add(rbMasculino);
        panelFormulario.add(rbOtro);
        
        //checkbox
        JCheckBox chkTerminos = new JCheckBox("Acepto los términos y condiciones");
        chkTerminos.setBounds(130,200,250,25);
        chkTerminos.setBackground(new Color(211,211,211));
        panelFormulario.add(chkTerminos);
        
        //Jslider
        JLabel lblNivel = new JLabel("Nivel:");
        lblNivel.setBounds(30,240,100,25);
        panelFormulario.add(lblNivel);
        
        JSlider sldNivel = new JSlider(0,100,50);
        sldNivel.setMajorTickSpacing(25);
        sldNivel.setPaintTicks(true);
        sldNivel.setPaintLabels(true);
        sldNivel.setBounds(130, 240, 250, 60);
        sldNivel.setBackground(new Color(211,211,211));
        panelFormulario.add(sldNivel);
        
        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(30,320,100,25);
        panelFormulario.add(lblEdad);
        
        //Spinner
        JSpinner spEdad = new JSpinner(
                new SpinnerNumberModel(18,1,120,1)
        );
        spEdad.setBounds(130, 320, 250, 25);
        panelFormulario.add(spEdad);
        
        //Area Texto
        JLabel lblNotas = new JLabel("Notas:");
        lblNotas.setBounds(30,360,100,25);
        panelFormulario.add(lblNotas);
        
        JTextArea txtNotas = new JTextArea();
        txtNotas.setLineWrap(true);
        txtNotas.setWrapStyleWord(true);
        
        //JScrollPane 
        JScrollPane scrollTxt = new JScrollPane(txtNotas);
        scrollTxt.setBounds(130,360,250,60);
        panelFormulario.add(scrollTxt);
        
        //Botones
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(130, 430, 110, 35);
        panelFormulario.add(btnGuardar);
        
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(250, 430, 110, 35);
        panelFormulario.add(btnLimpiar);
        
        add(panelFormulario);
        
        //Panel Tabla
        JPanel panelTabla = new JPanel();
        panelTabla.setLayout(null);
        panelTabla.setOpaque(false);
        panelTabla.setBounds(480,70,480,500);
        panelTabla.setBorder(
                BorderFactory.createTitledBorder("Lista de Personas")
        );
        
        //Modelo Tabla
        String[] columnas = {
            "Nombre",
            "Provincia",
            "Edad",
            "Género"
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
        
        //Scroll
        JScrollPane scrollTabla = new JScrollPane(tablaPersonas);
        scrollTabla.setBounds(20, 40, 440, 420);
        panelTabla.add(scrollTabla);
        
        add(panelTabla);
        
        btnGuardar.addActionListener(e->{
            String nombre = txtNombre.getText();
            String provincia = cmbProvincia.getSelectedItem().toString();
            int edad = (int) spEdad.getValue();
            
            String genero = "No indicado";
            
            //determinar cual es el seleccionado
            if(rbFemenino.isSelected()){
                genero = "Femenino";
            }
            
            if(rbMasculino.isSelected()){
                genero = "Masculino";
            }
            
            if(rbOtro.isSelected()){
                genero = "Otro";
            }
            
            //crear la fila
            Object[] fila = {
                nombre,
                provincia,
                edad,
                genero
            };
            
            //agregar la fila a la tabla
            modeloTabla.addRow(fila);
            
            JOptionPane.showMessageDialog(
                    this, 
                    nombre + " registrado correctamente.", 
                    "Registro Personas", 
                    JOptionPane.INFORMATION_MESSAGE);
        });
        
        btnLimpiar.addActionListener(e->{
            txtNombre.setText("");
            txtContrasenia.setText("");
            cmbProvincia.setSelectedIndex(0);
            grupoGenero.clearSelection();
            chkTerminos.setSelected(false);
            spEdad.setValue(18);
            sldNivel.setValue(50);
            txtNotas.setText("");
        });
        
    }
    
}
