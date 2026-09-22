
package com.mycompany.formas;
import javax.swing.*;
import java.awt.*;

public class Circulo extends Forma implements Dibujable{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo{");
        sb.append("radio=").append(radio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double getArea() {
        double area =0;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro = 0;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    @Override
    public void dibujar() {
        JFrame ventana = new JFrame("Circulo");
        
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                g.drawOval(50, 50, 150, 150);
            }
        };
        
        ventana.add(panel);
        ventana.setSize(270,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
    
    
    
}
