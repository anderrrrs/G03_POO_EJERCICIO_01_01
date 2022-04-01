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
        var ciudad2 = new Ciudad();
        
    ciudad.nombre = "Cuenca";
    ciudad.provincia = "Azuay";
    ciudad.pais = "Ecuador";
    ciudad.sucursal = 32;
        
    System.out.println("El nombre de la ciudad es: " +ciudad.nombre);
    System.out.println("El nombre de la provincia es: " +ciudad.provincia);
    System.out.println("El nombre de la ciudad es: " +ciudad.pais);
    System.out.println("El nombre de la provincia es: " +ciudad.sucursal);
    System.out.println("----------------------------------");
 
    ciudad2.nombre = "Loja";
    ciudad2.provincia = "Azuay";
    ciudad2.pais = "Ecuador";
    ciudad2.sucursal = 02;
    
    System.out.println("El nombre de la ciudad es: " +ciudad2.nombre);
    System.out.println("El nombre de la provincia es: " +ciudad2.provincia);
    System.out.println("El nombre de la ciudad es: " +ciudad2.pais);
    System.out.println("El nombre de la provincia es: " +ciudad2.sucursal);
    System.out.println("----------------------------------");
    
        var cliente = new Cliente();
        var cliente2 = new Cliente();
    
    cliente.id = 0133;
    cliente.nombre = "Jose";
    cliente.apellido = "Coronel";
    cliente.edad = 23;
    
    System.out.println("El nombre es: " +cliente.id);
    System.out.println("El apellido es: " +cliente.nombre);
    System.out.println("El nombre es: " +cliente.apellido);
    System.out.println("El apellido es: " +cliente.edad);
    System.out.println("----------------------------------");
    
    cliente2.id = 0234;
    cliente2.nombre = "Andres";
    cliente2.apellido = "Mejia";
    cliente2.edad = 20;
    
    System.out.println("El nombre es: " +cliente2.id);
    System.out.println("El apellido es: " +cliente2.nombre);
    System.out.println("El nombre es: " +cliente2.apellido);
    System.out.println("El apellido es: " +cliente2.edad);
    System.out.println("----------------------------------");

        var servicio = new Servicio();
        var servicio2 = new Servicio();

        
    servicio.id = 0456;
    servicio.nombreTrabajador = "Sofia";
    servicio.direccion = "Baños";
    servicio.valorPagar = 2000;

    
    System.out.println("El nombre es: " +servicio.id);
    System.out.println("La direccion es: " +servicio.nombreTrabajador );
    System.out.println("El nombre es: " +servicio.direccion);
    System.out.println("La direccion es: " +servicio.valorPagar );
    System.out.println("----------------------------------");
    
    servicio2.id = 0544;
    servicio2.nombreTrabajador = "Cristian";
    servicio2.direccion = "Ricaurte";
    servicio2.valorPagar = 4000;

    
    System.out.println("El nombre es: " +servicio2.id);
    System.out.println("La direccion es: " +servicio2.nombreTrabajador );
    System.out.println("El nombre es: " +servicio2.direccion);
    System.out.println("La direccion es: " +servicio2.valorPagar );
    System.out.println("----------------------------------");

       var trabajador = new Trabajador();
              var trabajador2 = new Trabajador();

    trabajador.id = 9786;
    trabajador.nombre = "Pablo";
    trabajador.apellido = "Eras";
    trabajador.correo = "pablo@gmail.com";

        System.out.println("El nombre es: " +trabajador.id);
        System.out.println("El apellido es: " +trabajador.nombre);
        System.out.println("El nombre es: " +trabajador.apellido);
        System.out.println("El apellido es: " +trabajador.correo);
        System.out.println("----------------------------------");

    trabajador2.id = 5643;
    trabajador2.nombre = "Alejandro";
    trabajador2.apellido = "Calle";
    trabajador2.correo = "alejo@gmail.com";

        System.out.println("El nombre es: " +trabajador2.id);
        System.out.println("El apellido es: " +trabajador2.nombre);
        System.out.println("El nombre es: " +trabajador2.apellido);
        System.out.println("El apellido es: " +trabajador2.correo);
        System.out.println("----------------------------------");
        
       var vehiculo = new Vehiculo();
              var vehiculo2 = new Vehiculo();

    vehiculo.id = 4567;
    vehiculo.placa = "ABC-456";
    vehiculo.marca = "Chevrolet";
    vehiculo.modelo = "Family";

        System.out.println("la placa es: " +vehiculo.id);
        System.out.println("El modelo es: " +vehiculo.placa);
        System.out.println("la placa es: " +vehiculo.marca);
        System.out.println("El modelo es: " +vehiculo.modelo);
        System.out.println("----------------------------------");
        
        vehiculo2.id = 4566;
    vehiculo2.placa = "ATD-446";
    vehiculo2.marca = "Chevrolet";
    vehiculo2.modelo = "Ferrari";

        System.out.println("la placa es: " +vehiculo2.id);
        System.out.println("El modelo es: " +vehiculo2.placa);
        System.out.println("la placa es: " +vehiculo2.marca);
        System.out.println("El modelo es: " +vehiculo2.modelo);
        System.out.println("----------------------------------");

        
        

    
    
    
        

    
    
        
        




    
        
               
        
}
}