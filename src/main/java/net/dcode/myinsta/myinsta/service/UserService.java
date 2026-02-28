package net.dcode.myinsta.myinsta.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import net.dcode.myinsta.myinsta.entity.UserRegister;
import net.dcode.myinsta.myinsta.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public String register(UserRegister user) {

        if(userRepository.findByEmail(user.getEmail()).isPresent()) {
            return "Email already exists";
        }

        userRepository.save(user);
        return "User Registered Successfully";
    }

    public String login(String email, String password) {

        UserRegister user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if(!user.getPassword().equals(password)) {
            return "Invalid Password";
        }

        return "Login Successful";
    }
}