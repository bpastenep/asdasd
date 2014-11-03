/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class ValidaUsuario {
    public boolean validau (String pass, String user) throws IOException{
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String textofin="";

        try{
        // Apertura del fichero y creacion de BufferedReader para poder
        // hacer una lectura comoda (disponer del metodo readLine())
            archivo = new File ("Logeo.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

        // Lectura del fichero
            String linea;
            String comp= user+";"+pass;
            while((linea=br.readLine())!=null){
                if(linea.equalsIgnoreCase(comp)){
                    return true;
                }
            }
        }     
        catch(Exception e){
            e.printStackTrace();
        
        try{
            if( null!= fr ){
                fr.close();
            }
        }catch (Exception e2){ 
            e2.printStackTrace();
        }   
    }
        return false;
    }
    @SuppressWarnings("empty-statement")
    
    public boolean validae(String user){
    System.out.println(user);
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;

    try{
    // Apertura del fichero y creacion de BufferedReader para poder
    // hacer una lectura comoda (disponer del metodo readLine())
    archivo = new File ("Logeo.txt");
    fr = new FileReader (archivo);
    br = new BufferedReader(fr);

    // Lectura del fichero
    String linea;
    int pos=0;
    while((linea=br.readLine())!=null){
        System.out.println(linea.substring(0,user.length()));
          if((linea.substring(0,user.length())).equalsIgnoreCase(user));
            return true;
        }
    }    
    catch(Exception e){
        e.printStackTrace();
        
    try{
        if( null!= fr ){
            fr.close();
        }
    }catch (Exception e2){ 
        e2.printStackTrace();
    }   
    }
        return false;
    }
            
}
    
    
