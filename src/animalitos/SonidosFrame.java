package animalitos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class SonidosFrame extends JFrame {
/**
 * Se implementa la clase SonidosFrame extendido de JFrame
 * 
 */
    MJButton m;
    Lectura L = new Lectura();
//private Animal cosa;

    /**
     *Se añaden botones correspondientes al sonido que debería 
     * contener cada animal
     */
    public SonidosFrame() {
        setTitle("Animales");
        setSize(300, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<String> anim = L.leer("Animales.txt");

        Iterator it = anim.iterator();
        while (it.hasNext()) {
            String fi = (String) it.next();

            try {
                String nombre;
                nombre = fi.substring(0, fi.length() - 4);
                m = new MJButton(nombre);
                Class c = Class.forName("orejas.Orejas" + nombre);
                Object obj = c.newInstance();
                Orejas ore = (Orejas) obj;
                ore.Orejasarchivo(nombre);
                m.addActionListener(ore);

                //Agrega el boton al frame
                getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
                getContentPane().add(m);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SonidosFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(SonidosFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(SonidosFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SonidosFrame frame = new SonidosFrame();
                frame.setVisible(true);
            }
        });
    }
}
