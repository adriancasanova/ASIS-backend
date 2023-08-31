/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asis.ayco.service;

import com.asis.ayco.model.HoraIngreso;
import com.asis.ayco.repository.HoraIngresoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HoraIngresoService implements IHoraIngresoService{
    
    @Autowired
    public HoraIngresoRepository horaIngresoRepo; 
    
    @Override
    public List<HoraIngreso> verHoraIngreso() {
       //  System.out.println("prueba" + horaIngresoRepo.findAll());
       return horaIngresoRepo.findAll();     
               
    }

    @Override
    public void agregarHoraIngreso(HoraIngreso Hora) {
    horaIngresoRepo.save(Hora);
    }

    @Override
    public void borrarHoraIngreso(Long id) {
     horaIngresoRepo.deleteById(id);
    }

    @Override
    public HoraIngreso buscarHoraIngreso(Long id) {
        
         return horaIngresoRepo.findById(id).orElse(null);
    }

    @Override
  public void editarHoraIngreso (HoraIngreso HoraIng){
  horaIngresoRepo.save(HoraIng);
  }
  

}




