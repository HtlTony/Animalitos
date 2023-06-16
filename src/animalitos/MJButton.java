/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalitos;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Cruz Islas Andrés Manuel 2213001160
 * @author Del Olmo Olvera Edwin 2193003773
 * @author Guiterrez Garcia Andre Yanelli 2192000938
 * @author Anthony Tadeo Cerqueda Martinez 2193041273
 * @author Ibarra Gonzales Daniel Idai 2193079704
 * @author Gabriela Judith Blanco Rodriguez 2213031319
 * @author Perez Jimenez Juan Leonardo 2182005798
 * @author Ian Quitze Mendez Dominguez 2193040749
 * @author Kain Obed Ramirez Villa 2182005529
 * @author Cuevas Hernadez Eder 2193045011
 * @author Sergio Delgadillo Marín 2162000251
 * @author Edgar Basilio Oritiz 2193079688
 * @author Arellano Guzman Alondra Lizbeth 2193040098
 *
 */
public class MJButton extends JButton {
/*
    *
    *Se crea clase extendida de JButton         
    *    
        */
    private String nombre;

    /**
     *Se crea constructor de MJButton
     */
    public MJButton() {


    }
/*
    *
    *La clase MJButton Contrendra el tamaño de imagen y
    *la respectiva presentación de cada animal    
        */

    /**
     *
     * @param nombre
     */
    public MJButton(String nombre) {
        this();
        this.nombre = nombre;
        //Agrega la imagen al boton
        String imgicon = "Animales/" + nombre + ".png";
        System.out.println("looking for " + imgicon);
        ImageIcon iconA = new ImageIcon(imgicon);
        Image icon = iconA.getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH);
        iconA.setImage(icon);
        this.setPreferredSize(new Dimension(100, 80));
        this.setIcon(iconA);
    }
}
