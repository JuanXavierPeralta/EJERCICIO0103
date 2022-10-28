/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author Portal Center
 */
public class Estudiante {
    
    
    String nombreEstudiante;
    String cedula;
    String universidad;
    String sede;
    int numMatricula;
        
    
    public  Estudiante(String nombreEstudiante, String cedula, String universidad, String sede, int numMatricula){
        this.nombreEstudiante = nombreEstudiante;
        this.cedula = cedula;
        this.universidad = universidad;
        this.sede = sede;
        this.numMatricula = numMatricula;    
    }            
    
    
    
    
    
    public String getnombreEstudiante(){
        return nombreEstudiante;
    }
    public String getcedula(){
        return cedula;
    }
    public String getuniversidad(){
        return universidad;
    }
    public String getSede(){
        return sede;
    }
    public int getnumMatricula(){
        return numMatricula;
    }
    
    
    
    
    
    public void setnombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    public void setcedula(String cedula) {
        this.cedula = cedula;
    }
    public void setuniversidad(String universidad) {
        this.universidad = universidad;
    }
    public void setsede(String sede) {
        this.sede = sede;
    }
    public void setmatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
    
    
    
    
    
    public String getinfoEstudiante(){
        var retorno = " El estudiante "+ this.nombreEstudiante 
                + " con un numero de cédula de " + this.cedula 
                + ", que asiste a la universidad " + this.universidad 
                + " en la sede de " + this.sede;
        return retorno;    
    }
}