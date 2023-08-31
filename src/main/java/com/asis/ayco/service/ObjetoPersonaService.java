/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asis.ayco.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asis.ayco.model.ObjetoPersona;
import com.asis.ayco.repository.ObjetoPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Adrian
 */
@Service
public class ObjetoPersonaService implements IObjetoPersonaService{
    
      
    @Autowired
    public ObjetoPersonaRepository ObjetoPersonaRepo; 
    
    @Override
    public List<ObjetoPersona> verObjetoPersona() {
       return ObjetoPersonaRepo.findAll();
    }

    @Override
    public void agregarObjetoPersona(ObjetoPersona ObjetoPer) {
   ObjetoPersonaRepo.save(ObjetoPer);
    }

    @Override
    public void borrarObjetoPersona(Long id) {
     ObjetoPersonaRepo.deleteById(id);
    }

    @Override
    public ObjetoPersona buscarObjetoPersona(Long id) {
         return ObjetoPersonaRepo.findById(id).orElse(null);
    }

    @Override
  public void editarObjetoPersona (ObjetoPersona ObjetoPer){
  ObjetoPersonaRepo.save(ObjetoPer);
  }

    
}









  
