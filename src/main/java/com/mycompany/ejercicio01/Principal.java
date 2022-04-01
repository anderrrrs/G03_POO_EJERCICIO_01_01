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
    ciudad.nombre = "Loja";
    ciudad.provincia = "Azuay";

        
    System.out.println("El nombre de la ciudad es: " +ciudad.nombre);
    System.out.println("El nombre de la provincia es: " +ciudad.provincia);
    System.out.println("El nombre de la ciudad es: " +ciudad.nombre);
    System.out.println("El nombre de la provincia es: " +ciudad.provincia);
    System.out.println("----------------------------------");
 
        var clientes = new Clientes();
        
    clientes.nombre = "Jonathan";
    clientes.apellido = "Coronel";
    clientes.nombre = "Jose";
    clientes.apellido = "Carpio";
    
    System.out.println("El nombre es: " +clientes.nombre);
    System.out.println("El apellido es: " +clientes.apellido);
    System.out.println("El nombre es: " +clientes.nombre);
    System.out.println("El apellido es: " +clientes.apellido);
    System.out.println("----------------------------------");

        var servicio = new Servicio();
        
    servicio.nombreTrabajor = "Juan";
    servicio.direccion = "Baños";
    servicio.nombreTrabajor = "Pablo";
    servicio.direccion = "Jimenez";

    
    System.out.println("El nombre es: " +servicio.nombreTrabajor);
    System.out.println("La direccion es: " +servicio.direccion );
    System.out.println("El nombre es: " +servicio.nombreTrabajor);
    System.out.println("La direccion es: " +servicio.direccion );
    System.out.println("----------------------------------");

       var trabajador = new Trabajador();
       
    trabajador.nombre = "Andres";
    trabajador.apellido = "Plaza";
    trabajador.nombre = "Sofia";
    trabajador.apellido = "Reyes";

        System.out.println("El nombre es: " +trabajador.nombre);
        System.out.println("El apellido es: " +trabajador.apellido);
        System.out.println("El nombre es: " +trabajador.nombre);
        System.out.println("El apellido es: " +trabajador.apellido);
        System.out.println("----------------------------------");

       var vehiculos = new Vehiculos();
       
    vehiculos.placa = "ABC-342";
    vehiculos.modelo = "Chevrolet";
    vehiculos.placa = "BAM-322";
    vehiculos.modelo = "Nissan";

        System.out.println("la placa es: " +vehiculos.placa);
        System.out.println("El modelo es: " +vehiculos.modelo);
        System.out.println("la placa es: " +vehiculos.placa);
        System.out.println("El modelo es: " +vehiculos.modelo);
        System.out.println("----------------------------------");

        
        

    
    
    
        

    
    
        
        




    
        
               
        
}
}