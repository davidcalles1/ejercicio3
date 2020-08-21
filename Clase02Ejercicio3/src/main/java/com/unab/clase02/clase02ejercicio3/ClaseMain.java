/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.clase02ejercicio3;

/**
 *
 * @author nelson
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Profesor profe = new Profesor("Nelson", "Nueva Concepcion", "30/09/1999", "M", 20, "Bachiller", "Estudiante");
        System.out.println(profe.toString());
         
        Estudiante est = new Estudiante("Ashly", "Nueva Concepcion", "14/02/2000", "F", 20,1500,"ING. sitema y computacion");
        System.out.println(est.toString());
    }
    
}
