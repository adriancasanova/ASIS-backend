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
public class ObjetoPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;     
     private String token;          
     private String nombreApellido;
     private String rol;   
 
     
  

    public ObjetoPersona(long id, String token, String nombreApellido, String rol ) {
        this.id = id;   
        this.token = token;  
        this.nombreApellido = nombreApellido;   
        this.rol = rol;        
    }
        
  

    public ObjetoPersona() {
        
    }     
}
