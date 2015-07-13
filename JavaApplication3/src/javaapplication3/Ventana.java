/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Panel;
import javax.swing.JFrame;

/**
 *
 * @author JoséM
 */

public class Ventana extends JFrame {
    
    private Panel _panel;
    
    public Ventana(){
        crearVentana();
        _panel = new Panel();
        add(_panel);
    }
    private void crearVentana(){
        setTitle("Hola Mundo");
        setSize(640,480);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}

