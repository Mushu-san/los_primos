/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.servicio;

import com.aeropuerto.losprimos.losPrimos.dto.BoletoDto;
import com.aeropuerto.losprimos.losPrimos.modelo.Boletos;
import com.aeropuerto.losprimos.losPrimos.repositorio.BoletoRepository;
import com.aeropuerto.losprimos.losPrimos.repositorio.VueloRepository;
import java.util.Date;
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
    
    public Boletos save(BoletoDto dto){
        Boletos nuevo = new Boletos();
        nuevo.setIdVuelo(dto.getIdVuelo());
        nuevo.setIdCliente(dto.getIdCliente());
        nuevo.setFechaCreacion(new Date());
        nuevo.setFechaModifica(new Date());
        nuevo.setUsuarioCrecion("string");
        nuevo.setUsuarioModifica("string");
        
        
    return this.boletoRepository.save(nuevo);
    }
    
}
