/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.controlador;

import com.aeropuerto.losprimos.losPrimos.modelo.Vuelos;
import com.aeropuerto.losprimos.losPrimos.servicio.VueloService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asacanoes
 */
@RestController
@RequestMapping("/vuelos")
@Slf4j
public class VueloController {

    @Autowired
    VueloService vueloService;
    
    @GetMapping(path = "vuelosByState/{state}")
    public List<Vuelos> findVuelosByState(@PathVariable Integer state) {
        log.debug(""+state);
        return vueloService.findVuelosByState(state);
    }
    
    @GetMapping(path = "/all")
    public List<Vuelos> findVuelos() {
       List<Vuelos> vuelos = vueloService.findAll(); 
        return vuelos;
    }
    
    @GetMapping(path = "/byId")
    public Vuelos findById(@RequestParam Integer id, @RequestParam Integer state){
        return vueloService.findById(id, state);
    }
    
    @GetMapping(path = "/byReservation")
    public List<Vuelos> findVuelosForReservation(@RequestParam Integer aeropuertoSalida,@RequestParam Integer aeropuertoLlegada,
            @RequestParam String fechaLlegada, @RequestParam String fechaSalida){
        return vueloService.findVuelosByReservationPage(aeropuertoSalida, aeropuertoLlegada, fechaLlegada, fechaSalida);
    }
}
