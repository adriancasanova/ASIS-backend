/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.asis.ayco.service;

import com.asis.ayco.model.HoraIngreso;
import java.util.List;

/**
 *
 * @author Adrian
 */
public interface IHoraIngresoService {
     public  List<HoraIngreso> verHoraIngreso();
      public void agregarHoraIngreso(HoraIngreso hora);
   public void borrarHoraIngreso(Long id);    
    public HoraIngreso buscarHoraIngreso (Long id); 
    public void editarHoraIngreso (HoraIngreso hora);

    
}
