/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Estudiante
 */
public class Utilitario {

    /*Esta funcion permite convertir un texto en numero y conrolar
    los errores que se pueden presentar a partir de ello*/
    public static int convertir(String numeroEnTexto)
            throws MiExcepcionNumerica, MiExcepcionGenerica {
        try {
            //Devuelve un valor de tipo entero
            return Integer.parseInt(numeroEnTexto);
        } catch (NumberFormatException e) {
            throw new MiExcepcionNumerica();
        } catch (Exception ex) {
            throw new MiExcepcionGenerica();
        }
    }
}
