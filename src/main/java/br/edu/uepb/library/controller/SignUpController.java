package br.edu.uepb.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.uepb.library.domain.User;
import br.edu.uepb.library.service.UserService;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8")
public class SignUpController {
    @Autowired
    private UserService userService;

    // @Autowired
    // private UserMapper userMapper;

    @PostMapping("/signup")
    public void signUp(@RequestBody User userDTO){
        // userService.signUpUser(userMapper.convertFromUserDTO(userDTO));
        userService.signUpUser(userDTO);
    }    
}
