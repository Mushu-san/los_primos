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
import org.springframework.data.repository.query.Param;
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
            + "and v.fecha_salida < to_date(:fechaLlegada, 'DD-MM-YYYY') \n"
            + "and v.fecha_llegada >= to_date(:fechaSalida, 'DD-MM-YYYY') \n"
            + "and v.id_estado = 1 ",
            nativeQuery = true)

    List<Vuelos> findByParameters(@Param("idAeSalida") Integer idAeropuertoSalida,
            @Param("idAeLlegada") Integer idAeropuertoLlegada, @Param("fechaLlegada") String fechaLlegada, @Param("fechaSalida") String fechaSalida);

    Optional<Vuelos> findByIdVueloAndIdEstado(Integer id, Integer state);
}
