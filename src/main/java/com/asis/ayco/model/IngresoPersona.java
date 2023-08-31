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
public class IngresoPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;     
     private String tipoDeProspecto;          
     private String nombreApellido;
     private int dni;   
     private int nroContacto;     
     private String motivo;     
     private String departamento;     
     private String procedencia;     
     private String empleado;     
     private String observaciones;     
     
  

    public IngresoPersona(long id, String tipoDeProspecto, String nombreApellido, int dni, int nroContacto, String motivo,  
     String departamento, String procedencia, String empleado, String observaciones ) {
        this.id = id;       
        this.tipoDeProspecto = tipoDeProspecto;       
        this.nombreApellido = nombreApellido;   
        this.dni = dni; 
        this.nroContacto = nroContacto;   
        this.motivo = motivo;
        this.departamento = departamento;
        this.procedencia = procedencia;
        this.empleado = empleado;
        this.observaciones = observaciones;
        
        
    }
        
  

    public IngresoPersona() {
    }     
     
}







