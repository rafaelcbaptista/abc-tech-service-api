package br.com.fiap.abctechservice.controller;

import br.com.fiap.abctechservice.application.PropertiesComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@RestController
@RequestMapping(value = "/")


public class HealthCheckController {

    private PropertiesComponent propertiesComponent;
    public HealthCheckController(@Autowired PropertiesComponent propertiesComponent){

        this.propertiesComponent = propertiesComponent;
    }

    @GetMapping()
    public ResponseEntity<String> status(){

        return ResponseEntity.ok("Sucesso !");
    }

    @GetMapping(value = "version")
    public ResponseEntity<String> version() {

        return ResponseEntity.ok(this.propertiesComponent.getName() + " - " + this.propertiesComponent.getVersion());
    }


}
