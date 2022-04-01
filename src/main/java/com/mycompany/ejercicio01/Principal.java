/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio01;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Principal {
    
    Date horaEntrada;
    
    public static void main (String[] args){
        
        var ciudad = new Ciudad();
        
    ciudad.nombre = "Cuenca";
    ciudad.provincia = "Azuay";
    
        
    System.out.println("El nombre de la ciudad es: " +ciudad.nombre);
    System.out.println("El nombre de la provincia es: " +ciudad.provincia);
    
        var clientes = new Clientes();
        
    clientes.nombre = "Jose";
    clientes.apellido = "Coronel";
    
    System.out.println("El nombre es: " +clientes.nombre);
    System.out.println("El apellido es: " +clientes.apellido);
    
        var servicio = new Servicio();
        
    servicio.nombreTrabajor = "Juan";
    servicio.direccion = "Baños";
    
    System.out.println("El nombre es: " +servicio.nombreTrabajor);
    System.out.println("La direccion es: " +servicio.direccion );
    
       var trabajador = new Trabajador();
       
    trabajador.nombre = "Andres";
    trabajador.apellido = "Plaza";
    
        System.out.println("El nombre es: " +trabajador.nombre);
        System.out.println("El apellido es: " +trabajador.apellido);
        
       var vehiculos = new Vehiculos();
       
    vehiculos.placa = "ABC-342";
    vehiculos.modelo = "Chevrolet";
    
        System.out.println("la placa es: " +vehiculos.placa);
        System.out.println("El modelo es: " +vehiculos.modelo);

        
        

    
    
    
        

    
    
        
        




    
        
               
        
}
}