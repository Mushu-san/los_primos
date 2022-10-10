/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.repositorio;

import com.aeropuerto.losprimos.losPrimos.modelo.Asientos;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author asacanoes
 */
public interface AsientoRepository extends CrudRepository<Asientos, Integer> {

    @Query(value = "select * from public.asientos a \n"
            + "where a.id_avion = :idAvion\n"
            + "and a.id_estado <> 3", nativeQuery = true)
    List<Asientos> findAsientosByIdAvion(@Param("idAvion") Integer idAvion);
}
