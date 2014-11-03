/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.io.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Benjamin
 */
public class Escribir {
    public void escribirArchivo(String user, String pass,  boolean continuar) throws IOException
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("Logeo.txt", continuar);
            pw = new PrintWriter(fichero);
            String linea;
            linea = user+";"+pass;
            ValidaUsuario valida = new ValidaUsuario();
            if (valida.validae(user)){
                pw.println(linea);
                JOptionPane.showMessageDialog(null, "Usuario Creado con exito");
                
          }  
            else{
                JOptionPane.showMessageDialog(null, "El usuario YA EXISTE, intente otro");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
