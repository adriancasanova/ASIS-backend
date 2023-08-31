/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asis.ayco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HoraIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;     
     private String nombre;          
     private String rol;
     private String hora;   
 
     
  

    public HoraIngreso(long id, String nombre, String rol, String hora) {
        this.id = id;       
        this.nombre = nombre;       
        this.rol = rol;   
        this.hora = hora; 
               
    }       
   /*  private long id;
     private String horaIngresoVendedor; 
      public HoraIngreso(long id, String horaIngresoVendedor) {
        this.id = id;       
        this.horaIngresoVendedor = horaIngresoVendedor;       
      
               
    }   */
    
    public HoraIngreso() {
    }     
     
}
