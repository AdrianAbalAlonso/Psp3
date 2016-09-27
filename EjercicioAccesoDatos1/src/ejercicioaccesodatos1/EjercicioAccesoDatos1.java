/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaccesodatos1;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Adrián
 */
public class EjercicioAccesoDatos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       // Crear o directorio 'arquivosdir' na ruta '/home/oracle/NetBeansProjects/arquivos/' sempre e cando dito directorio non exista
       String rutaArquivosdir = "/home/oracle/NetBeansProjects/arquivos/arquivosdir/";
       File arquivosdir = new File(rutaArquivosdir);
        arquivosdir.mkdirs();
       //Comprobar que a ruta foi creada ou existe mediante o comandos do sistema operativo
       
       //crear  o arquivo Products1.txt no directorio mencionado anteriormente (arquivosdir) sempre e cando dito arquivo non exista. 
         arquivosdir = new File(rutaArquivosdir + "Products1.txt");
        arquivosdir.createNewFile();
       //comprobar que o arquivo foi creado ou existe mediante comandos do sistema operativo        
            
        
       //comprobar que a ruta foi creada mediante o metodo da clase File axeitado .En este caso con un if , igualado a true es suficiente.
       rutaArquivosdir.
       //comprobar que o arquivo foi creado mediante o metodo da clase File axeitado
           if (arquivosdir.exists() == true) {
            System.out.println("\n Si existe el archivo Products1");
        } else {
            System.out.println("\n No existe el archivo");
        }         
       

        
        
        
        
    }
    
}
