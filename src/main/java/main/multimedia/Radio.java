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
public class Radio {
   private double fmFrequency;
   private int amFrequency;
   private char band;

   public double getFmFrequency(){
       return this.fmFrequency;
   }
   public void setFmFrequency(){
       this.fmFrequency = 91.8;
   }
   public int getAmFrequency(){
       return this.amFrequency;
   }
   public void setAmFrequency(){
       this.amFrequency = 600;
   }
   public char getBand(){
      return this.band;
   }
   public void setBand(){
       this.band = 'F';
   }
   public void printAttributes(){
       System.out.println("FM frequency is:"+ this.getFmFrequency());
       System.out.println("AM frequency is:" + this.getAmFrequency());
       System.out.println("Band is:" + this.getBand());
   }
}

