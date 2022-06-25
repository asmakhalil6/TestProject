package com.example.practise.restful;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {

    private BusinessLayer businessLayer;

    @GetMapping(value = "/api/v1/hello-world")
    public ResponseEntity<String> getHelloWorld() {
        return ResponseEntity.ok(businessLayer.getHelloWorld());
    }

}
