/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

import java.util.List;

/**
 *
 * @author Portal Center
 */
public class Carrera {
   
   String nombreCarrera;
    String nombreDirector;
    int duracionCarrera;
    List<Universidad>universidad;
    public Carrera (String nombreCarrera, String nombreDirector, int duracionCarrera){
        this.duracionCarrera=duracionCarrera;
        this.nombreCarrera=nombreCarrera;
        this.nombreDirector=nombreDirector;
    }
    
    public String getinfoCarrera(){
       var retorno= "La carrera es "+this.nombreCarrera+ "el director es "+
               this.nombreDirector+" y la carrera tiene una duracion de "+ 
               this.duracionCarrera + "años.";
       return retorno;
       
}
      


     
        

      } 
