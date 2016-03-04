package com.example.luis.villaverde_tablet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by luis on 04/03/16.
 */
public class CustomArrayAdapter_talleres extends ArrayAdapter<Talleres_lista> {

    public CustomArrayAdapter_talleres(Context context, List<Talleres_lista> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Salvando la referencia del View de la fila
        View listItemView = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo con el xml
            listItemView = inflater.inflate(R.layout.fragment_talleres,parent,false);
        }

        //Obteniendo instancias de los elementos
        TextView talleres = (TextView)listItemView.findViewById(R.id.txTaller);
        TextView direccion = (TextView)listItemView.findViewById(R.id.txDireccion);
        TextView numero = (TextView)listItemView.findViewById(R.id.txNumero);
        //Obteniendo instancia de la Tarea en la posición actual

        Talleres_lista item = getItem(position);

        talleres.setText(item.getTaller());
        direccion.setText(item.getDireccion());
        numero.setText(item.getNumero());


        //Devolver al ListView la fila creada
        return listItemView;

    }
}