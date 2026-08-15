/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phaatui;

/**
 *
 * @author CompLabC209-PC8
 */
public class Phaatui {

    public static void main(String[] args) {
        displayGreetings();
        displayInfo();   
    }
    static void displayGreetings(){
        System.out.println("Welcome to Baldur's Gate");
    }
    public static void displayInfo(){
      displayCharacter();
      displayClass();
    }
    static void displayCharacter(){
        System.out.println("Lace Diallos");
        System.out.println("Born into Grace and exiled, took up the role as confessor as a covert double agent to restore the formless mother and take over.");
        System.out.println("Tarnished");
        System.out.println("Those exiled from Grace, cursed with eternal return from death. for aslong as the Erdtree stands.");
    }
    public static void displayClass(){
        displaySkills();
        System.out.println(" Spellblade ");
        System.out.println("Combining the study of magic and the study of a blade,mastering both and used in tandem.");
        System.out.println("Dynasty's finesse ");
        System.out.println("Can become intangible for a short while, unable to interact with the world while also being untouched by anything ");
        System.out.println("Bloodflame Incantations");
        System.out.println("Engulfs a held armament with Fiery storm of the users own blood.");
    }
    static void displaySkills(){
        ReduviasBloodBlade();
        EmbodiedHelice();
        BloodTax();
        DropRupture();
    }
    static void ReduviasBloodBlade(){
        System.out.println("Fling an arc of cutting blood.");
    }
    static void EmbodiedHelice(){
        System.out.println("Engulf a weapon in a helix of fiery blood.");
    }
    static void BloodTax(){
        System.out.println("A flurry of quick strikes and stabs which have lifesteal");
    }
    static void DropRupture(){
        System.out.println("Send beads of blood which explode after contact or a short duration");
    }
}
 

 
   

