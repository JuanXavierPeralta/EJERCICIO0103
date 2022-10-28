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
public class Pais {
    String nombrePais;
    int yearIndependencia;
    int numProvincias;
    double densidadPoblacion;
    List<Provincia> provincias;
    //Provincia provPais;
        
public Pais(String nombrePais,int yearIndependencia,int numProvincias,double densidadPoblacion){
    this.nombrePais = nombrePais;
    this.yearIndependencia = yearIndependencia;
    this.numProvincias = numProvincias ;
    //this.provPais = provPais;
    
    } 
    public void addProvince(Provincia newProvincia) {
        provincias.add(newProvincia);
    }
    
    public String getinfoPais(){
        var retorno = "El nombre del pais es :"+this.nombrePais+ ", ademas el grito de independencia fue en: "
                +this.yearIndependencia+" ,su densidad poblacional es de:"+this.densidadPoblacion+" millones de habitantes y contiene: "
                +this.numProvincias+" Provincias, siendo: "+provincias.get(0).toString()+ " una de ellas."; 
        return retorno; 
}
}
