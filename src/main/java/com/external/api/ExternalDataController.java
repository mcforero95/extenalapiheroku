package com.external.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalDataController {

    @PostMapping("/api/v1/external-data")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void receiveData(@RequestBody String json) {
        // No se realiza ninguna operación con el JSON recibido
    }
}