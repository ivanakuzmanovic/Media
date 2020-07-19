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
        
        Television tv1 = new Television();
        tv1.setCurrentProgram();
        tv1.setTurnOn();
        tv1.setVolume();
        tv1.printAttributes();
    
    
    Radio radio1 = new Radio ();
    radio1.setFmFrequency();
    radio1.setAmFrequency();
    radio1.setBand();
    
    radio1.printAttributes();
    }
            
}
