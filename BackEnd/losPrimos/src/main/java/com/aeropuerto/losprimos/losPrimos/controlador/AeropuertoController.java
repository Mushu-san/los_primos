/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.controlador;

import com.aeropuerto.losprimos.losPrimos.modelo.Aeropuertos;
import com.aeropuerto.losprimos.losPrimos.servicio.AeropuertoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asacanoes
 */
@RestController("/aeropuertos")
public class AeropuertoController {
    @Autowired
    AeropuertoService aeropuertoServices;
    
    @PostMapping("")
    public Aeropuertos save(Aeropuertos k){
    
    return aeropuertoServices.save(k);
    }
}
