/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.multimedia;

/**
 *
 * @author Ivana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5;
        Television tv1 = new Television();
        tv1.currentProgram = 1;
        tv1.turnOn = true;
        tv1.volume = 0;
        System.out.println("Program na Tv je " + tv1.currentProgram);
        
       int y = 29; 
        Radio carradio = new Radio();
        carradio.amFrequency = 600;
        carradio.fmFrequency = 91.8;
        carradio.band = 'B';
   }
    
}
