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
        System.out.println("Jacina zvuka je " + tv1.getVolume() +".");
        System.out.println("Trenutni kanal je "+ tv1.getCurrentProgram() +".");
        System.out.println("Da li je Tv upaljen?" + tv1.getTurnOn() +".");
        
    
    
    Radio radio1 = new Radio ();
    radio1.setFmFrequency();
    radio1.setAmFrequency();
    radio1.setBand();
    System.out.println("FM Frequency is: " + radio1.getFmFrequency()+".");
    System.out.println("AM Frequency is: " + radio1.getAmFrequency()+".");
    System.out.println("Band is " + radio1.getBand()+"m"+".");
    }
            
}
