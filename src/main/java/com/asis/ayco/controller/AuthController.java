
package com.asis.ayco.controller;


import com.asis.ayco.service.IUsersService;
import com.asis.ayco.model.Users;
import com.asis.ayco.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
  @CrossOrigin (origins = "http://localhost:4200")
 // @CrossOrigin (origins = "https://asis-5884e.web.app/") 
public class AuthController {
    @Autowired
    private IUsersService usuarioDao;  
    @Autowired
    private JWTUtil jwtUtil;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
 /*   public String login(@RequestBody Users usuario) {
        Users usuarioLogueado = usuarioDao.obtenerUsuarioPorCredenciales (usuario);
        if (usuarioLogueado != null) {
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getEmail());
         
            String prueba = usuarioLogueado.getRol() + tokenJwt;
            System.out.println(prueba);
            return tokenJwt;
        }
        return /*"FAIL"*//* null;
    } */
    
     public String []login(@RequestBody Users usuario) {
        Users usuarioLogueado = usuarioDao.obtenerUsuarioPorCredenciales (usuario);
        if (usuarioLogueado != null) {
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getEmail());
         
            String prueba = usuarioLogueado.getRol() + tokenJwt;
            String[ ] nombreT = {usuarioLogueado.getRol(), tokenJwt, usuarioLogueado.getNombre()}; 
            System.out.println(nombreT);
            return nombreT;
        }
        return /*"FAIL"*/ null;
    }
}
