package com.example.luis.villaverde_tablet;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Talleres.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Talleres#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Talleres extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


 //   private OnFragmentInteractionListener mListener;

    public Talleres() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Talleres.
     */
    // TODO: Rename and change types and number of parameters
    public static Talleres newInstance(String param1, String param2) {
        Talleres fragment = new Talleres();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.listview_talleres,container,false);

        //Instanciar el listview
        ListView lista = (ListView)view.findViewById(R.id.lista_talleres);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "Number " + position, Toast.LENGTH_LONG).show();
                Log.d("num:", String.valueOf(position));

                if(position==0) {
                    BlankFragment fragment = new BlankFragment();
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.formulario_detail_container, fragment)
                            .commit();
                }

                if(position==1){
                    Informes fragment = new Informes();
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.formulario_detail_container, fragment)
                            .commit();
                }
            }
        });

        //Inicializar el adaptador con la fuente de datos
        CustomArrayAdapter_talleres adapter = new CustomArrayAdapter_talleres(getContext(),DataSource_talleres.TALLERES);

        lista.setAdapter(adapter);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
/*    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
 /*
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

   */
}
