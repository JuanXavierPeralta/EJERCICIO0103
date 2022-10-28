/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author Portal Center
 */
public class Asignaturaa {
        String nombreAsignatura ;
    String nombreDocente;
    String nombreCarrera;
    public Asignaturaa (String nombreAsignatura,
            String nombreDocente,String nombreCarrera){
        this.nombreAsignatura= nombreAsignatura;
        this.nombreDocente= nombreDocente;
        this.nombreCarrera=nombreCarrera;
        
        
        
    }
    public String getinfoAsignatura(){
        var retorno= "La asignatura se llama "+ this.nombreAsignatura + "su docente es "+
                this.nombreDocente+ " y es una asignatura que pertenece a "+ this.nombreCarrera;
        return retorno ;
         
}}

