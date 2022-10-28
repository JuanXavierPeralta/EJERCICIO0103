/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author Portal Center
 */
public class Ciudad {
    String nombreCiudad;
    Provincia perteneceProv;
    String nombreAutoridad;
 
    public Ciudad(String nombreCiudad,String nombreAutoridad){
        this.nombreCiudad = nombreCiudad;
        this.nombreAutoridad = nombreAutoridad;
}
    
    public void setProvince(Provincia perteneceProv){
        this.perteneceProv = perteneceProv;
    }
    public String getinfoCiudad(){   
        
        var retorno = "El nombre de la ciudad es :"+this.nombreCiudad+ " , ademas pertenece a la provincia del "
                +this.perteneceProv.nombreProvincia+" , siendo su alcande "+this.nombreAutoridad;
       return retorno; 
    
    }
}
