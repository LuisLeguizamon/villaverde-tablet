package com.example.luis.villaverde_tablet;

/**
 * Created by luis on 22/02/16.
 */

import java.util.ArrayList;
import java.util.List;


public class DataSource {

    static List<Informes_lista> INFORMES=new ArrayList<Informes_lista>();

    static{
        INFORMES.add(new Informes_lista("CV34545", "Toyota Hilux"));
        INFORMES.add(new Informes_lista("FD4444F", "Toyota Tacoma"));
    }

}