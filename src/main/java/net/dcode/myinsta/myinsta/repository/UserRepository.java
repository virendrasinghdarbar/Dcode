package net.dcode.myinsta.myinsta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.dcode.myinsta.myinsta.entity.UserRegister;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserRegister, Long> {

    Optional<UserRegister> findByEmail(String email);
}