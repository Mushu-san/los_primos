/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeropuerto.losprimos.losPrimos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author asacanoes
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoletoDto {
    private Integer idVuelo;
    private String idCliente;
    private String idEstado;
}
