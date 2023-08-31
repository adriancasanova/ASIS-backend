/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asis.ayco.controller;

import com.asis.ayco.model.HoraIngreso;
import com.asis.ayco.repository.HoraIngresoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tarea {
      @Autowired
    public HoraIngresoRepository horaIngresoRepo; 
  //  @Scheduled (fixedRate = 1000000)
  //  @Scheduled (cron = "0 0 5 * * *") 
     @Scheduled (cron = "0 0 5 * * *") 
    public void borrarBaseDeDatos () {
         System.out.println("Mensaje");
         horaIngresoRepo.deleteAll();
        
    }
}
