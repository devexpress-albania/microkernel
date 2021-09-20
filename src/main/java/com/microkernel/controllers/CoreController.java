package com.microkernel.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

    @GetMapping("core")
    public ResponseEntity<?> coreExample(){
        return ResponseEntity.ok("V.1.0.0");
    }
}
