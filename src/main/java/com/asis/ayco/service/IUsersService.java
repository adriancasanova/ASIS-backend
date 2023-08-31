/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.asis.ayco.service;
import com.asis.ayco.model.Users;
import java.util.List;

public interface IUsersService {
  public  List<Users> getUsuarios();
  //   public  void getUsuarios();
   public void eliminar(Long id);
   public void registrar(Users usuario);
   public Users obtenerUsuarioPorCredenciales(Users usuario);    
}
