/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asis.ayco.controller;
import com.asis.ayco.model.IngresoPersona;
import com.asis.ayco.service.IIngresoPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Adrian
 */
  @RestController  
@CrossOrigin (origins = "http://localhost:4200")
//  @CrossOrigin (origins = "https://asis-5884e.web.app/") 
  public class IngresoPersonaController {
    @Autowired
private IIngresoPersonaService ingresoPersonaServ;  
  @PostMapping ("/ingresoPersona")
  public void agregarIngresoPersona (@RequestBody IngresoPersona ingresoPers) {
  ingresoPersonaServ.agregarIngresoPersona(ingresoPers);
  } 
  @GetMapping ("/ingresoPersona") 
  @ResponseBody
  public List<IngresoPersona> verIngresoPersona() {
 return ingresoPersonaServ.verIngresoPersona();
  }
  @DeleteMapping ("/ingresoPersona/{id}")
  public void borrarIngresoPersona (@PathVariable Long id){
  ingresoPersonaServ.borrarIngresoPersona(id);
  }  
   @PutMapping ("/ingresoPersona/{id}")
  public void editarIngresoPersona (@RequestBody IngresoPersona ingresoPers) {
  ingresoPersonaServ.editarIngresoPersona(ingresoPers);
  } 
  
}


