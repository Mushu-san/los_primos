package com.aeropuerto.losprimos.losPrimos.modelo;
// Generated 8/10/2022 11:03:34 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VueloClaseId generated by hbm2java
 */
@Embeddable
public class VueloClaseId  implements java.io.Serializable {


     private int idVuelo;
     private int idClase;

    public VueloClaseId() {
    }

    public VueloClaseId(int idVuelo, int idClase) {
       this.idVuelo = idVuelo;
       this.idClase = idClase;
    }
   


    @Column(name="id_vuelo", nullable=false)
    public int getIdVuelo() {
        return this.idVuelo;
    }
    
    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }


    @Column(name="id_clase", nullable=false)
    public int getIdClase() {
        return this.idClase;
    }
    
    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VueloClaseId) ) return false;
		 VueloClaseId castOther = ( VueloClaseId ) other; 
         
		 return (this.getIdVuelo()==castOther.getIdVuelo())
 && (this.getIdClase()==castOther.getIdClase());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdVuelo();
         result = 37 * result + this.getIdClase();
         return result;
   }   


}

