package br.edu.uepb.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.edu.uepb.library.domain.User;
import br.edu.uepb.library.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private UserRepository userRepository;
    private BCryptPasswordEncoder encoder;

    public void signUpUser(User userDTO) {
        userDTO.setPassword(encoder.encode(userDTO.getPassword()));
        userRepository.save(userDTO);
    }
    
}
