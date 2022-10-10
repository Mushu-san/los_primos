/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.controlador;

import com.aeropuerto.losprimos.losPrimos.modelo.Asientos;
import com.aeropuerto.losprimos.losPrimos.servicio.AsientoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asacanoes
 */
@RestController
@RequestMapping("/asientos")
public class AsientoController {
    
    @Autowired
    AsientoService asientoService;
    
    @GetMapping(path = "findByAvion")
    public List<Asientos> findAsientosByIdAvion(@RequestParam Integer idAvion){
        return asientoService.findAsientosByIdAvion(idAvion);
    }
    
    
}
