
package com.asis.ayco.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asis.ayco.model.IngresoPersona;
import com.asis.ayco.repository.IngresoPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class IngresoPersonaService implements IIngresoPersonaService{
    
    @Autowired
    public IngresoPersonaRepository ingresoPersonaRepo; 
    
    @Override
    public List<IngresoPersona> verIngresoPersona() {
       return ingresoPersonaRepo.findAll();
    }

    @Override
    public void agregarIngresoPersona(IngresoPersona IngresoPer) {
    ingresoPersonaRepo.save(IngresoPer);
    }

    @Override
    public void borrarIngresoPersona(Long id) {
     ingresoPersonaRepo.deleteById(id);
    }

    @Override
    public IngresoPersona buscarIngresoPersona(Long id) {
         return ingresoPersonaRepo.findById(id).orElse(null);
    }

    @Override
  public void editarIngresoPersona (IngresoPersona IngresoPer){
  ingresoPersonaRepo.save(IngresoPer);
  }
}






