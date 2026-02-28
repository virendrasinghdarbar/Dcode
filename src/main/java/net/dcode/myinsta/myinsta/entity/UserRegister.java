package net.dcode.myinsta.myinsta.entity;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import net.dcode.myinsta.myinsta.enums.Role;

@Data
@Table(name = "users")
@Entity
public class UserRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    @Column(unique = true)
    private String email;

    private String password;

   // @Enumerated(EnumType.STRING)
    //private Role role;
}
