/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author Portal Center
 */
public class Asignatura {
    
    
    private String profesor;
    private String nomAsignatura;
    private int horasTotales;
    
    
    public Asignatura(String profesor, String nomAsignatura, int horasTotales) {
        this.profesor = profesor;    
        this.nomAsignatura = nomAsignatura;
        this.horasTotales = horasTotales;
    } 
        
        
        
        public String getprofesor() {
        return profesor;
    }
        public String getnomAsignatura() {
        return nomAsignatura;
    }
        public int gethorasTotales() {
        return horasTotales;
    }
         
         
        
              
        public void setprofesor(String profesor) {
        this.profesor = profesor;
    } 
        public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    } 
        public void sethorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

     
        
       public String getinfoAsignatura(){
       var retorno = " que tomo la materia de " + this.nomAsignatura 
               + " con un total " + this.horasTotales + " horas "
               + " con el profesor "+this.profesor;
       return retorno;
         
         
         
        
        
        
        
  
        
        
        
        
    }
}
