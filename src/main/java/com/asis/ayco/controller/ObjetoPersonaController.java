/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asis.ayco.controller;
import com.asis.ayco.model.ObjetoPersona;
import com.asis.ayco.service.IObjetoPersonaService;
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


@RestController  
@CrossOrigin (origins = "http://localhost:4200")
//@CrossOrigin (origins = "https://asis-5884e.web.app/") 
public class ObjetoPersonaController {
    
    
     @Autowired
private IObjetoPersonaService objetoPersonaServ;  
  @PostMapping ("/ObjetoPersona")
  public void agregarObjetoPersona (@RequestBody ObjetoPersona objetoPers) {
  objetoPersonaServ.agregarObjetoPersona(objetoPers);
  } 
  @GetMapping ("/ObjetoPersona") 
  @ResponseBody
  public List<ObjetoPersona> verObjetoPersona() {
 return objetoPersonaServ.verObjetoPersona();
  }
  @DeleteMapping ("/ObjetoPersona/{id}")
  public void borrarObjetoPersona (@PathVariable Long id){
  objetoPersonaServ.borrarObjetoPersona(id);
  }  
   @PutMapping ("/ObjetoPersona/{id}")
  public void editarObjetoPersona (@RequestBody ObjetoPersona objetoPers) {
  objetoPersonaServ.editarObjetoPersona(objetoPers);
  } 
  
    
    
}




   
