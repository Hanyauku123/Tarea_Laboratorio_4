/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author soporte
 */
public class Labo4 {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Calculadora");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        
        ventana.setVisible(true);
    }
    
}
