/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asis.ayco.controller;

import com.asis.ayco.model.HoraIngreso;
import com.asis.ayco.service.IHoraIngresoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
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
//    @CrossOrigin (origins = "https://asis-5884e.web.app/") 
public class HoraIngresoController {
      
  @Autowired
private IHoraIngresoService horaIngresoServ;  
  @PostMapping ("/horaIngreso")
  public void agregarHoraIngreso (@RequestBody HoraIngreso hora) {
  horaIngresoServ.agregarHoraIngreso(hora);
  } 
  @GetMapping ("/horaIngreso") 
  @ResponseBody
  public List<HoraIngreso> verHoraIngreso() {
 return horaIngresoServ.verHoraIngreso();
  }
  @DeleteMapping ("/horaIngreso/{id}")
  public void borrarIngresoPersona (@PathVariable Long id){
  horaIngresoServ.borrarHoraIngreso(id);
  }  
   @PutMapping ("/horaIngreso/{id}")
  public void editarHoraIngreso (@RequestBody HoraIngreso horaIng) {
  horaIngresoServ.editarHoraIngreso(horaIng);
  } 
  

  

}












