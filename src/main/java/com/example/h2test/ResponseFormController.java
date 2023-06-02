package com.example.h2test;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ResponseFormController {
    @Autowired
    private ResponseFormService responseFormService;

    @GetMapping("/responses")
	public List<ResponseForm> allResponses(){
		return responseFormService.getAllResponeses();
	}

    @GetMapping("/responsesByMusic/{id}")
	public List<ResponseForm> allResponses(@PathVariable long id){
		return responseFormService.getResponsesByMusic(id);
	}

    @PostMapping("/responses")
    void addResponse(@RequestBody Vote vote) {
        System.out.println("llamada a add responses");
    }
}
