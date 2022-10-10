/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.servicio;

import com.aeropuerto.losprimos.losPrimos.modelo.Asientos;
import com.aeropuerto.losprimos.losPrimos.repositorio.AsientoRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asacanoes
 */
@Service
@Slf4j
public class AsientoService {
    
    @Autowired
    AsientoRepository asientoRepository;
    
    public List<Asientos> findAsientosByIdAvion(Integer idAvion){
            
     return asientoRepository.findAsientosByIdAvion(idAvion);
    }
    
}
