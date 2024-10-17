/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica;

import igu.Pantalla;

/**
 *
 * @author Jonathan Javier Urquiza
 */
public class PruebaCapas {

    public static void main(String[] args) {
    
        /**
         * Modelo de capas IGU, LOGICA, PERSISTENCIA
         * IGU: Es la interfas grafia de usuarios, hace referencia al frontend.
         * LOGICA: se alojan todos las clases y metodos. Inicia la persistencia y hace que se muestre la IGU.
         * PERSISTENCIA: Conecta la lógica que recibe con una base de datos.
         */
        Pantalla screem = new Pantalla();
        screem.setVisible(true);
        screem.setLocationRelativeTo(null);
   
        
        
    }
}
