/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalitos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class Orejas implements ActionListener {
/**
    *Se crea clase orejas implementando un 
    *ActionListener para la reproducción del sonido
     */
    Reproductor r;
    String archivo;

    /**
     *Se crea el constructor de Orejas
     */
    public Orejas() {
    }

    /**
     *
     * @param archivo
     */
    public Orejas(String archivo) {
//    super();
        this.archivo = archivo;
        r = new Reproductor(archivo);
    }

    /**
     *
     * @param nombre
     */
    public void Orejasarchivo(String nombre) {
        this.archivo = nombre;
        r = new Reproductor(archivo);
    }
/**
    * ActionPerformed se añade como evento de ActionListener. 
    * Para reproducir el sonido
    */
    public void actionPerformed(ActionEvent e) {
        if (archivo != null && r != null) {
            r.reproducirSonido();
        } else {
            System.out.println("archivo null");
        }
    }

}
