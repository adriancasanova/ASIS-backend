/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.asis.ayco.repository;
import com.asis.ayco.model.ObjetoPersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetoPersonaRepository extends JpaRepository <ObjetoPersona, Long>{
    
}
