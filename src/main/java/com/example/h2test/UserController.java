package com.example.h2test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ResponseFormService responseFormService;

    @Autowired
    private MusicService musicService;

    @GetMapping("/usuarios")
	public List<User> allUsers(){
		return userService.getAllUsers();
	}

    @PostMapping("/usuarios/{id}")
    ResponseEntity<User> addUser(@RequestBody User user, @PathVariable String id) {
        //el usuario viene sin id desde el submit front
        //el id del path es el id de music seleccionado
        if(userService.findByEmail(user.getEmail()) != null){
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
        else{
            Music music = musicService.getMusicById(Integer.parseInt(id));
            ResponseForm responseForm = new ResponseForm(user,music);
            responseFormService.insertResponse(responseForm);
            user.setResponse(responseForm);
            userService.insertUser(user);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
    }
}
