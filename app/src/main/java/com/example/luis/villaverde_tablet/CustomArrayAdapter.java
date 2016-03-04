package com.example.luis.villaverde_tablet;

/**
 * Created by luis on 22/02/16.
 */

import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter<Informes_lista> {

    public CustomArrayAdapter(Context context, List<Informes_lista> objects) {
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
            listItemView = inflater.inflate(
                    R.layout.fragment_informes,
                    parent,
                    false);
        }

        //Obteniendo instancias de los elementos
        TextView titulo = (TextView)listItemView.findViewById(R.id.textv_title);
        TextView subtitulo = (TextView)listItemView.findViewById(R.id.textv_sub);

        //Obteniendo instancia de la Tarea en la posición actual
        Informes_lista item = getItem(position);

        titulo.setText(item.getChasis());
        subtitulo.setText(item.getModelo());

        //Devolver al ListView la fila creada
        return listItemView;

    }
}