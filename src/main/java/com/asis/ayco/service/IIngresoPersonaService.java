/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.asis.ayco.service;

import com.asis.ayco.model.IngresoPersona;
import java.util.List;

/**
 *
 * @author Adrian
 */
public interface IIngresoPersonaService {
     public  List<IngresoPersona> verIngresoPersona();
      public void agregarIngresoPersona(IngresoPersona usuario);
   public void borrarIngresoPersona(Long id);    
    public IngresoPersona buscarIngresoPersona (Long id); 
    public void editarIngresoPersona (IngresoPersona edu);
}
