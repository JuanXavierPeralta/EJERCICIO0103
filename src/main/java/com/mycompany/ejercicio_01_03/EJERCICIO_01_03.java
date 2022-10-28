/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_03;

/**
 *
 * @author Portal Center
 */
public class EJERCICIO_01_03 {

    public static void main(String[] args) {
       
   var estudiante1 = new Estudiante("Mauricio Torres","0125474809","UPS","Cuenca",1);
   var asignatura1 = new Asignatura("Daniel Delgado", "Algebra Lineal",110);
   var calificacion1 = new Calificacion(estudiante1, asignatura1, 100, 40);
   
   System.out.println(calificacion1.getinfoCalificacion());
   
   
   
   
   var estudiante2 = new Estudiante("Santiago Andrade","0105472809","UPS","Cuenca",2);
   var asignatura2 = new Asignatura("Pedro Andrade","Calculo Diferencial",220);
   var calificacion2 = new Calificacion(estudiante2, asignatura2, 50, 20);
   
   System.out.println(calificacion2.getinfoCalificacion());
   
   
   
   
   var estudiante3 = new Estudiante("Pedro Perez","0102452309","UPS","Cuenca",3);
   var asignatura3 = new Asignatura(" Xavier Aguirre "," Quimica ",230);
   var calificacion3 = new Calificacion(estudiante3, asignatura3, 20, 20);
   
   System.out.println(calificacion3.getinfoCalificacion());
   
   
   
   
   var estudiante4 = new Estudiante("David Berrezueta","0105278809","UPS","Cuenca",4);
   var asignatura4 = new Asignatura("Joaquin Andrade", "Antropologia", 430);
   var calificacion4 = new Calificacion(estudiante4, asignatura4, 10, 2);
   
   System.out.println(calificacion4.getinfoCalificacion());
   
   
   
   
   var estudiante5 = new Estudiante("Carlos Peralta","0109472809","UPS","Cuenca",5);
   var asignatura5 = new Asignatura("Paul Ochoa", "Calculo Integral",420);
   var calificacion5 = new Calificacion(estudiante5, asignatura5, 30, 29);
   
   System.out.println(calificacion5.getinfoCalificacion());
   
   
   
   
   var estudiante6 = new Estudiante("","0125172859","UPS","Cuenca",6);
   var asignatura6 = new Asignatura("Pablo Aguirre", "Circuitos Electronicos",90);
   var calificacion6 = new Calificacion(estudiante6, asignatura6, 150, 140);
   
   System.out.println(calificacion6.getinfoCalificacion());
   
   
   
   
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
}
