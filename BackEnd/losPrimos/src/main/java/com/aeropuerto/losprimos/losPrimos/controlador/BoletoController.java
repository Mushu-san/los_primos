/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.controlador;

import com.aeropuerto.losprimos.losPrimos.dto.BoletoDto;
import com.aeropuerto.losprimos.losPrimos.modelo.Boletos;
import com.aeropuerto.losprimos.losPrimos.servicio.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asacanoes
 * 
 */
@RestController
@RequestMapping("/boletos")
public class BoletoController {
    @Autowired
    BoletoService boletoService;
    
    @PostMapping(path = "save")
    public Boletos save(@RequestBody BoletoDto k){
        return boletoService.save(k);
    }
    
}
