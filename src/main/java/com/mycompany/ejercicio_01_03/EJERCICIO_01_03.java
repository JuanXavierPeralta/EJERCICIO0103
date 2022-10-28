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
   
   
   
   
  
    public static void main(String[] args) {
        var universidad1 = new Universidad("Universidad Politecnica Salesiana ",
                "Calle vieja y Turuhuayco", 1994);

        var carrera1 = new Carrera("Electronica", "Ing Diego Soto ", 4);

        var asignatura1 = new Asignatura("Electronica Analogica", "ING Luis Bolaños", "Electronica");

        var universidad2 = new Universidad("Universidad de Cuenca",
                "Av Doce de Abril", 1867);

        var carrera2 = new Carrera("Telecomunicaciones", "Ing Luis Diaz ", 5);

        var asignatura2 = new Asignatura("Teoria Electromagnetica", "ING Marco Lopez", "Telecomunicaciones ");

        System.out.println(universidad1.getinfoUniversidad());
        System.out.println(carrera1.getinfoCarrera());
        System.out.println(asignatura1.getinfoAsignatura());
        System.out.println(universidad2.getinfoUniversidad());
        System.out.println(carrera2.getinfoCarrera());
        System.out.println(asignatura2.getinfoAsignatura());

    }
}                                               
   public static void main(String[] args) {
               
        var pais1 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad1 = new Ciudad("Cuenca","Pedro Palacios");
        
        var provincia1 = new Provincia("Azuay",ciudad1,909.585);
        
        pais1.addProvince(provincia1);
        
        
        var pais2 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad2 = new Ciudad("Ambato","Javier Altamirano");
        
        var provincia2 = new Provincia("Tungurahua",ciudad2,489.537);
        
        pais2.addProvince(provincia2);
        
        
        var pais3 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad3 = new Ciudad("Azogues","Romel Sarmiento Castro");
        
        var provincia3 = new Provincia("Cañar",ciudad3,281.396);
        
        pais3.addProvince(provincia3);
        
        
        var pais4 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad4 = new Ciudad("Santa Elena","Otto Vera Palacios");
        
        var provincia4 = new Provincia("Santa Elena",ciudad4,164.196);
        
        pais4.addProvince(provincia4);
        
        
        var pais5 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad5 = new Ciudad("Ibarra","Andrea Scacco");
        
        var provincia5 = new Provincia("Imbabura",ciudad5,184.457);
        
        pais5.addProvince(provincia5);
        
        
        var pais6 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad6 = new Ciudad("Guayaquil","Cynthia Viteri");
        
        var provincia6 = new Provincia("Guayas",ciudad6,2.644891);
        
        pais6.addProvince(provincia6);
        
        
        System.out.println(ciudad1.getinfoCiudad());
        System.out.println(provincia1.getinfoProvincia());
        System.out.println(pais1.getinfoPais());
        
        System.out.println(ciudad2.getinfoCiudad());
        System.out.println(provincia2.getinfoProvincia());
        System.out.println(pais2.getinfoPais());
        
        System.out.println(ciudad3.getinfoCiudad());
        System.out.println(provincia3.getinfoProvincia());
        System.out.println(pais3.getinfoPais());
        
        System.out.println(ciudad4.getinfoCiudad());
        System.out.println(provincia4.getinfoProvincia());
        System.out.println(pais4.getinfoPais());
        
        System.out.println(ciudad5.getinfoCiudad());
        System.out.println(provincia5.getinfoProvincia());
        System.out.println(pais5.getinfoPais());
        
        System.out.println(ciudad6.getinfoCiudad());
        System.out.println(provincia6.getinfoProvincia());
        System.out.println(pais6.getinfoPais());
    }
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
}
