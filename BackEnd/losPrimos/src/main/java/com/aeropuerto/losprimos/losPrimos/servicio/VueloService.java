/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.servicio;

import com.aeropuerto.losprimos.losPrimos.modelo.Vuelos;
import com.aeropuerto.losprimos.losPrimos.repositorio.VueloRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author asacanoes
 */
@Service
@Slf4j
public class VueloService {
    
    @Autowired
    VueloRepository vueloRepository;
    
    
    public List<Vuelos> findVuelosByState(Integer state){
        return vueloRepository.findByIdEstado(state);
    }
    
    @Transactional(readOnly = true)
    public List<Vuelos> findAll(){
        log.debug("pasa por aqui");
        return vueloRepository.findAll();
    }
    
    @Transactional(readOnly = true)
    public Vuelos findById(Integer idVuelo, Integer state){
        return vueloRepository.findByIdVueloAndIdEstado(idVuelo, state).orElseThrow(() -> new RuntimeException("El vuelo que ha elegido no ha sido encontrado"));
    }
}
