/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalitos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.SwingUtilities;

/**
 *
 * @author Cruz Islas Andrés Manuel 2213001160
 * @author Del Olmo Olvera Edwin 2193003773
 * @author Guiterrez Garcia Andrea Yanelli 2192000938
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
public class Reproductor {
/**
    *Se crea clase Reproductor
    */
    String archivo;
    private Clip clip;

    Reproductor(String fi) {
        this.archivo = fi;
    }
/**
 * Se implementa  un constructor reproucirSonido para insertar el destino
 * correspondiente 
 */
    void reproducirSonido() {
        try {
            if (clip != null && clip.isRunning()) {
                clip.stop();
            }
            String ds = "Sonidos/";
            File archivoSonido = new File(ds + archivo + ".wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoSonido);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
    }
    }
