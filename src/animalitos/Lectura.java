package animalitos;

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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *Se crea clase lectura para la busqueda del archivo
 *
 */
public class Lectura {

    /**
     *
     * @param nombreArchivo
     * @return
     */
    public ArrayList<String> leer(String nombreArchivo) {
        FileReader fr;
        ArrayList<String> array = new ArrayList<String>();
        try {
            fr = new FileReader(nombreArchivo);
            BufferedReader archivoLectura = new BufferedReader(fr);
            String cadenaLeida = archivoLectura.readLine();
            while (cadenaLeida != null) {
                array.add(cadenaLeida);
                cadenaLeida = archivoLectura.readLine();
            }
            archivoLectura.close();
            return array;
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("No se pudo leer del archivo");
            e.printStackTrace();
        }
        return null;
    }
}
