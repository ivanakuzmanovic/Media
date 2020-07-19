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
public class Television {
   private int volume;
   private int currentProgram;
   private boolean turnOn;
    
    public int getVolume(){
        return this.volume;
        }
    public void setVolume(){
     this.volume = 0;
        }
    public int getCurrentProgram(){
        return this.currentProgram;
    }
    public void setCurrentProgram(){
        this.currentProgram = 1;
    }
    public boolean getTurnOn(){
        return this.turnOn;
    }
    public void setTurnOn(){
        this.turnOn = true;
    }
    public void printAttributes(){
        System.out.println("Volume is " + this.getVolume() +".");
        System.out.println("Current channel is "+ this.getCurrentProgram() +".");
        System.out.println("Tv is on:" + this.getTurnOn() +".");
    }
        
    
    }
