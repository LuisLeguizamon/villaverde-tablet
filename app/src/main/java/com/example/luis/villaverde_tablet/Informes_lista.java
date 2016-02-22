package com.example.luis.villaverde_tablet;

/**
 * Created by luis on 22/02/16.
 */
public class Informes_lista {
    String modelo;
    String chasis;
   // String estado;
   // String taller;

    public Informes_lista(String modelo, String chasis) {
        this.chasis = chasis;
        this.modelo = modelo;
       // this.estado = estado;
       // this.taller = taller;
    }

    public void setChasis(String chasis){
        this.chasis = chasis;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getChasis(){
        return chasis;
    }

    public String getModelo(){
        return modelo;
    }

}



