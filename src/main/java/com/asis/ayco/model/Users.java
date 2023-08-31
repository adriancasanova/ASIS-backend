

package com.asis.ayco.model;
import com.asis.ayco.model.ObjetoPersona;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "users")
@ToString @EqualsAndHashCode
public class Users  {     
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "password")
    private String password;
    
     @Getter @Setter @Column(name = "nombre")
    private String nombre;
     
      @Getter @Setter @Column(name = "apellido")
    private String apellido;
      
       @Getter @Setter @Column(name = "ObjetoPersona")
    private String ObjetoPersona;
   
               @Getter @Setter @Column(name = "rol")
    private String rol; 

}
