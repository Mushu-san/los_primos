/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.controlador;

import com.aeropuerto.losprimos.losPrimos.modelo.Aeropuertos;
import com.aeropuerto.losprimos.losPrimos.servicio.AeropuertoService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asacanoes
 */
@RestController
@RequestMapping("/aeropuertos")
public class AeropuertoController {
    @Autowired
    AeropuertoService aeropuertoServices;
    
    @PostMapping("")
    public Aeropuertos save(Aeropuertos k){
        Aeropuertos h = new Aeropuertos();
        h.setAbreviatura(k.getAbreviatura());
        h.setCiudad(k.getCiudad());
        h.setEstado(k.getEstado());
        h.setFechaCreacion(new Date());
        h.setFechaModifica(k.getFechaModifica());
        h.setIdEstado(k.getIdEstado());
        h.setNombreAeropuerto(k.getNombreAeropuerto());
        
    return aeropuertoServices.save(h);
    }
    
    @GetMapping(path = "all")
    public List<Aeropuertos> findAll(){
        return aeropuertoServices.findAll();
    }
    
    @GetMapping(path = "aeropuerto/state/{state}")
    public List<Aeropuertos> findAll(@PathVariable Integer state){
        return aeropuertoServices.findByIdEstado(state);
    }
}
