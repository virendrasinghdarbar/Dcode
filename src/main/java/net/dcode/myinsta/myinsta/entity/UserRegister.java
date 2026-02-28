package net.dcode.myinsta.myinsta.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
//import net.dcode.myinsta.myinsta.enums.Role;

@Data
@Table(name = "users")
@Entity
public class UserRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank(message="Name is required")
    private String name;

   // @Email(message="Invalid email")
    @Column(unique = true)
    private String email;

  //  @NotBlank(message="Password required")
    private String password;

}
