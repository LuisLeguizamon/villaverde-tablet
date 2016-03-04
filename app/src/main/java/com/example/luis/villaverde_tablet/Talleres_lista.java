package com.example.luis.villaverde_tablet;

/**
 * Created by luis on 04/03/16.
 */
public class Talleres_lista {
    String taller;
    String direccion;
    String numero;

    public Talleres_lista(String taller, String direccion, String numero){

        this.taller=taller;
        this.direccion=direccion;
        this.numero=numero;
    }

    public void setTaller(String taller){this.taller = taller;}

    public void setDireccion(String direccion){this.direccion = direccion;}

    public void setNumero(String numero){this.numero=numero;}

    public String getTaller(){return taller;}

    public String getDireccion(){return direccion;}

    public String getNumero(){return numero;}

}

