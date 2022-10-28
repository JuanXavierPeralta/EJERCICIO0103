/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author Portal Center
 */
public class Calificacion {
    
    
    private Estudiante nomEstudiante;
    private Asignatura nomAsignatura;
    private int totalPreguntas;
    private int preguntasCorrectas;
 
    
    public Calificacion( Estudiante nomEstudiante, Asignatura nomAsignatura, int totalPreguntas, int preguntasCorrectas ) {
        this.nomEstudiante = nomEstudiante;
        this.nomAsignatura = nomAsignatura;
        this.totalPreguntas = totalPreguntas;
        this.preguntasCorrectas = preguntasCorrectas;
    }




    
    public Estudiante getnomEstudiante() {
        return nomEstudiante;
    }
    public Asignatura getnomAsignatura() {
        return nomAsignatura;
    }
    public int gettotalPreguntas() {
        return totalPreguntas;
    }
    public int getpreguntasCorrectas() {
        return preguntasCorrectas;
    }
    
    
    
    
    
    public void setnomEstudiante(Estudiante nomEstudiante) {
        this.nomEstudiante = nomEstudiante;
    }
    public void setnomAsignatura(Asignatura nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }
     public void settotalPreguntas(int totalPreguntas) {
        this.totalPreguntas = totalPreguntas;
    }
      public void setpreguntasCorrectas(int preguntasCorrectas) {
        this.preguntasCorrectas = preguntasCorrectas;
    }
     
     
    
     
      
     public String apruebaMateria() {
        var retorno = " ";
        var nota=(this.preguntasCorrectas*10)/this.totalPreguntas;
        if(nota<7 && this.nomEstudiante.numMatricula<3){
          retorno=" perdio la materia. ";
        }
        if(nota>=7){
        retorno= " aprobo la materia. " ;
        }
        if(nota<7 && this.nomEstudiante.numMatricula>=3){
        retorno= " reprobo la materia. ";
        }
        return retorno; 
    }   
     
     
     
    
   
     public String getinfoCalificacion() {
        var retorno = this.nomEstudiante.getinfoEstudiante() 
                + this.nomAsignatura.getinfoAsignatura()
                + this.apruebaMateria();
        return retorno;
    }
}