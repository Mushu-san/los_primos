/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.servicio;

import com.aeropuerto.losprimos.losPrimos.modelo.Aeropuertos;
import com.aeropuerto.losprimos.losPrimos.repositorio.AeropuertoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asacanoes
 */
@Service
@Slf4j
public class AeropuertoService {
    
    @Autowired
    AeropuertoRepository aeropuertoRepository;
    
    public Aeropuertos save(Aeropuertos k){
        return aeropuertoRepository.save(k);
    }
}
