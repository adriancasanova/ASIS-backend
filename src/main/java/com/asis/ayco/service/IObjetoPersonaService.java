/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.asis.ayco.service;
import com.asis.ayco.model.ObjetoPersona;
import java.util.List;


public interface IObjetoPersonaService {
        public  List<ObjetoPersona> verObjetoPersona();
      public void agregarObjetoPersona(ObjetoPersona usuario);
   public void borrarObjetoPersona(Long id);    
    public ObjetoPersona buscarObjetoPersona (Long id); 
    public void editarObjetoPersona (ObjetoPersona obj);
}

 

