package com.aeropuerto.losprimos.losPrimos.modelo;
// Generated 8/10/2022 11:02:40 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vuelos generated by hbm2java
 */
@Entity
@Table(name="vuelos"
    ,schema="public"
)
public class Vuelos  implements java.io.Serializable {


     private int idVuelo;
     private int aeropuertoSalida;
     private int aeropuertoLlegada;
     private int idAvion;
     private int idTripulacion;
     private int idEstado;
     private Date fechaSalida;
     private Date fechaLlegada;
     private String usuarioCrea;
     private String usuarioModifica;
     private Date fechaCreacion;
     private Date fechaModifica;
     private int idPuertaAbordaje;

    public Vuelos() {
    }

	
    public Vuelos(int idVuelo, int aeropuertoSalida, int aeropuertoLlegada, int idAvion, int idTripulacion, int idEstado, int idPuertaAbordaje) {
        this.idVuelo = idVuelo;
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoLlegada = aeropuertoLlegada;
        this.idAvion = idAvion;
        this.idTripulacion = idTripulacion;
        this.idEstado = idEstado;
        this.idPuertaAbordaje = idPuertaAbordaje;
    }
    public Vuelos(int idVuelo, int aeropuertoSalida, int aeropuertoLlegada, int idAvion, int idTripulacion, int idEstado, Date fechaSalida, Date fechaLlegada, String usuarioCrea, String usuarioModifica, Date fechaCreacion, Date fechaModifica, int idPuertaAbordaje) {
       this.idVuelo = idVuelo;
       this.aeropuertoSalida = aeropuertoSalida;
       this.aeropuertoLlegada = aeropuertoLlegada;
       this.idAvion = idAvion;
       this.idTripulacion = idTripulacion;
       this.idEstado = idEstado;
       this.fechaSalida = fechaSalida;
       this.fechaLlegada = fechaLlegada;
       this.usuarioCrea = usuarioCrea;
       this.usuarioModifica = usuarioModifica;
       this.fechaCreacion = fechaCreacion;
       this.fechaModifica = fechaModifica;
       this.idPuertaAbordaje = idPuertaAbordaje;
    }
   
     @Id 

    
    @Column(name="id_vuelo", unique=true, nullable=false)
    public int getIdVuelo() {
        return this.idVuelo;
    }
    
    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    
    @Column(name="aeropuerto_salida", nullable=false)
    public int getAeropuertoSalida() {
        return this.aeropuertoSalida;
    }
    
    public void setAeropuertoSalida(int aeropuertoSalida) {
        this.aeropuertoSalida = aeropuertoSalida;
    }

    
    @Column(name="aeropuerto_llegada", nullable=false)
    public int getAeropuertoLlegada() {
        return this.aeropuertoLlegada;
    }
    
    public void setAeropuertoLlegada(int aeropuertoLlegada) {
        this.aeropuertoLlegada = aeropuertoLlegada;
    }

    
    @Column(name="id_avion", nullable=false)
    public int getIdAvion() {
        return this.idAvion;
    }
    
    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    
    @Column(name="id_tripulacion", nullable=false)
    public int getIdTripulacion() {
        return this.idTripulacion;
    }
    
    public void setIdTripulacion(int idTripulacion) {
        this.idTripulacion = idTripulacion;
    }

    
    @Column(name="id_estado", nullable=false)
    public int getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_salida", length=22)
    public Date getFechaSalida() {
        return this.fechaSalida;
    }
    
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_llegada", length=22)
    public Date getFechaLlegada() {
        return this.fechaLlegada;
    }
    
    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    
    @Column(name="usuario_crea", length=50)
    public String getUsuarioCrea() {
        return this.usuarioCrea;
    }
    
    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
    }

    
    @Column(name="usuario_modifica", length=50)
    public String getUsuarioModifica() {
        return this.usuarioModifica;
    }
    
    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_creacion", length=22)
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_modifica", length=22)
    public Date getFechaModifica() {
        return this.fechaModifica;
    }
    
    public void setFechaModifica(Date fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

    
    @Column(name="id_puerta_abordaje", nullable=false)
    public int getIdPuertaAbordaje() {
        return this.idPuertaAbordaje;
    }
    
    public void setIdPuertaAbordaje(int idPuertaAbordaje) {
        this.idPuertaAbordaje = idPuertaAbordaje;
    }




}

