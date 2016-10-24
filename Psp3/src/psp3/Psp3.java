/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrián
 */
public class Psp3 extends Thread {
public Psp3 (String str){
        super (str);
    }
     static int hilo = 0;
     public void run () {
     if (hilo == 0){
            hilo++;
            new Psp3 ("Hilo "+hilo) .start ();
            try {
                Thread.sleep(31000);
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Psp3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 1){
            hilo++;
            new Psp3 ("Hilo "+hilo) .start ();
            try {
                Thread.sleep(25000);
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Psp3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 2){
            hilo++;
            new Psp3 ("Hilo "+hilo) .start ();
            try {
                Thread.sleep(19000);
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Psp3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 3){
            hilo++;
            new Psp3("Hilo "+hilo) .start ();
            try {
                Thread.sleep(13000);
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Psp3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 4){
            hilo++;
            new Psp3 ("Hilo "+hilo) .start ();
            try {
                Thread.sleep(7000);
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Psp3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 5){
            hilo++;
            try {
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Psp3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        System.out.println(getName()+" terminado");
    }
    /**
     * Metodo que lanza 10 veces un sleep entre 100 y 600 milisegundos aleatoriamente
     * @throws InterruptedException 
     */
    public void metodo () throws InterruptedException{
        for (int i = 0; i < 9; i++){
            int tiempoAleatorio = (int) Math.floor(Math.random()*600+100);
            Thread.sleep(tiempoAleatorio);
            System.out.println("bucle "+this.getName());
        }
    }
    public static void main(String[] args) {
       new Psp3 ("Hilo "+hilo) .start ();
    }
}





