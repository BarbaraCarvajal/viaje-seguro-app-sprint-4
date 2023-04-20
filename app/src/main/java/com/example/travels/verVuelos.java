package com.example.travels;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link verVuelos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class verVuelos extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ArrayList<Paises> paisesArrayList;
    private String[] paisesNombres;
    private String[] paisesPrecios;

    private int[] imagenPaises;
    private RecyclerView recyclerView;

    public verVuelos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment verVuelos.
     */
    // TODO: Rename and change types and number of parameters
    public static verVuelos newInstance(String param1, String param2) {
        verVuelos fragment = new verVuelos();
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
        return inflater.inflate(R.layout.fragment_ver_vuelos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitialize();
        recyclerView = view.findViewById(R.id.rv1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        Adaptador adaptador = new Adaptador(getContext(),paisesArrayList);
        recyclerView.setAdapter(adaptador);
        adaptador.notifyDataSetChanged();
    }

    private void dataInitialize() {
        paisesArrayList = new ArrayList<>();

        paisesNombres = new String[]{
                getString(R.string.destino_1),
                getString(R.string.destino_2),
                getString(R.string.destino_3),
                getString(R.string.destino_4),
                getString(R.string.destino_5),
        };

        paisesPrecios = new String[]{
                getString(R.string.precio_1),
                getString(R.string.precio_2),
                getString(R.string.precio_3),
                getString(R.string.precio_4),
                getString(R.string.precio_5),

        };


        imagenPaises = new int[]{
                R.drawable.japon2,
                R.drawable.japon,
                R.drawable.japon2,
                R.drawable.japon,
                R.drawable.japon2
        };



        for (int i = 0; i< paisesNombres.length; i++){
            Paises paises = new Paises(paisesNombres[i], paisesPrecios[i], imagenPaises[i]);
            paisesArrayList.add(paises);
        }

    }
}