/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.repositorio;

import com.aeropuerto.losprimos.losPrimos.modelo.Vuelos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asacanoes
 */
@Repository
public interface VueloRepository extends CrudRepository<Vuelos, Integer>{
    
    List<Vuelos> findByIdEstado(Integer id);
    
    @Override
    List<Vuelos> findAll();
}
