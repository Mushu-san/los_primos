/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.repositorio;

import com.aeropuerto.losprimos.losPrimos.modelo.Vuelos;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asacanoes
 */
@Repository
public interface VueloRepository extends CrudRepository<Vuelos, Integer> {

    List<Vuelos> findByIdEstado(Integer id);

    @Override
    List<Vuelos> findAll();

    @Query(value = "select * from public.vuelos v \n"
            + "where v.aeropuerto_salida = :idAeSalida\n"
            + "and v.aeropuerto_llegada = :idAeLlegada\n"
            + "and v.fecha_salida >= :fechaSalida \n"
            + "and v.fecha_llegada <= :fechaLlegada",
             nativeQuery = true)
    List<Vuelos> findByParameters();
    
    Optional<Vuelos> findByIdVueloAndIdEstado(Integer id, Integer state);
}
