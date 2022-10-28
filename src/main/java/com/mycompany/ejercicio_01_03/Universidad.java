/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author Portal Center
 */
public class Universidad {
    
    String nombreUniversidad;
    String direccionUniversidad;
    int fundacionUniversidad;
    
    
    public Universidad(String nombreUniversidad,String direccionUniversidad,int fundacionUniversidad){
        this.nombreUniversidad  = nombreUniversidad;
        this.direccionUniversidad = direccionUniversidad;
        this.fundacionUniversidad = fundacionUniversidad;
        
       
    }
    public String getinfoUniversidad(){
        var retorno = "La universidad "+this.nombreUniversidad+ 
                "se fundo en "+this.fundacionUniversidad+" y su direccion es"
                        + this.direccionUniversidad;
        return retorno;
        
        
    }
    
}       