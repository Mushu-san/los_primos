/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.servicio;

import com.aeropuerto.losprimos.losPrimos.repositorio.BoletoRepository;
import com.aeropuerto.losprimos.losPrimos.repositorio.VueloRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asacanoes
 */
@Service
@Slf4j
public class BoletoService {
    
    @Autowired
    BoletoRepository boletoRepository;
    
    @Autowired
    VueloRepository vueloRepository;
    
    
    
}
