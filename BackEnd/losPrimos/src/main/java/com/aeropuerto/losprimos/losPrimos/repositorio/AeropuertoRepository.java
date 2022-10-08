/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.repositorio;

import com.aeropuerto.losprimos.losPrimos.modelo.Aeropuertos;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author asacanoes
 */
public interface AeropuertoRepository extends CrudRepository<Aeropuertos, Integer>{
    
}
