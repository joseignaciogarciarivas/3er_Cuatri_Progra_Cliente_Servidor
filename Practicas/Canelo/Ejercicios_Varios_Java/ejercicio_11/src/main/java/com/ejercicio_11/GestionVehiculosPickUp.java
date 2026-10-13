
package com.ejercicio_11;

import com.ejercicio_11.view.VehiculoPickupGUI;
import javax.swing.SwingUtilities;



/**
 *
 * @author Andrés González García
 */
public class GestionVehiculosPickUp {

    public static void main(String[] args) {
        
        
        SwingUtilities.invokeLater(()->{
            new VehiculoPickupGUI();
        });
        
        
    }
}
