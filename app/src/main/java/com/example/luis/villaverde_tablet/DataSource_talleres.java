package com.example.luis.villaverde_tablet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 04/03/16.
 */
public class DataSource_talleres {

    static List<Talleres_lista> TALLERES = new ArrayList<>();

    static {
        TALLERES.add(new Talleres_lista("Taller A","Direccion A","021605333"));
        TALLERES.add(new Talleres_lista("Taller B","Dirección B","021443222"));

    }
}
