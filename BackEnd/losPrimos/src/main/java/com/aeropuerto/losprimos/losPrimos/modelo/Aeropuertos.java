package com.aeropuerto.losprimos.losPrimos.modelo;
// Generated 8/10/2022 05:04:11 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Aeropuertos generated by hbm2java
 */
@Entity
@Table(name="aeropuertos"
    ,schema="public"
)
public class Aeropuertos  implements java.io.Serializable {


     private int idAeropuerto;
     private String nombreAeropuerto;
     private String abreviatura;
     private int estado;
     private String ciudad;
     private String pais;
     private String usuarioCrea;
     private String usuarioModifica;
     private Date fechaCreacion;
     private Date fechaModifica;
     private int idEstado;

    public Aeropuertos() {
    }

	
    public Aeropuertos(int idAeropuerto, String nombreAeropuerto, String abreviatura, int estado, String ciudad, String pais, String usuarioCrea, String usuarioModifica, int idEstado) {
        this.idAeropuerto = idAeropuerto;
        this.nombreAeropuerto = nombreAeropuerto;
        this.abreviatura = abreviatura;
        this.estado = estado;
        this.ciudad = ciudad;
        this.pais = pais;
        this.usuarioCrea = usuarioCrea;
        this.usuarioModifica = usuarioModifica;
        this.idEstado = idEstado;
    }
    public Aeropuertos(int idAeropuerto, String nombreAeropuerto, String abreviatura, int estado, String ciudad, String pais, String usuarioCrea, String usuarioModifica, Date fechaCreacion, Date fechaModifica, int idEstado) {
       this.idAeropuerto = idAeropuerto;
       this.nombreAeropuerto = nombreAeropuerto;
       this.abreviatura = abreviatura;
       this.estado = estado;
       this.ciudad = ciudad;
       this.pais = pais;
       this.usuarioCrea = usuarioCrea;
       this.usuarioModifica = usuarioModifica;
       this.fechaCreacion = fechaCreacion;
       this.fechaModifica = fechaModifica;
       this.idEstado = idEstado;
    }
   
     @Id 

    
    @Column(name="id_aeropuerto", unique=true, nullable=false)
    public int getIdAeropuerto() {
        return this.idAeropuerto;
    }
    
    public void setIdAeropuerto(int idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    
    @Column(name="nombre_aeropuerto", nullable=false)
    public String getNombreAeropuerto() {
        return this.nombreAeropuerto;
    }
    
    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    
    @Column(name="abreviatura", nullable=false)
    public String getAbreviatura() {
        return this.abreviatura;
    }
    
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    
    @Column(name="estado", nullable=false)
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }

    
    @Column(name="ciudad", nullable=false)
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
    @Column(name="pais", nullable=false)
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    @Column(name="usuario_crea", nullable=false, length=50)
    public String getUsuarioCrea() {
        return this.usuarioCrea;
    }
    
    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
    }

    
    @Column(name="usuario_modifica", nullable=false, length=50)
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

    
    @Column(name="id_estado", nullable=false)
    public int getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }




}

