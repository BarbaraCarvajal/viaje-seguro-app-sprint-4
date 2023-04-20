package com.example.travels;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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

public class verVuelos extends Fragment {
    private ArrayList<Paises> paisesArrayList;
    private String[] paisesNombres;
    private String[] paisesPrecios;

    private int[] imagenPaises;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ver_vuelos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //dataInitialize();

        paisesArrayList = new ArrayList<>();

        paisesArrayList.add(new Paises(getString(R.string.destino_1),getString(R.string.precio_2), R.drawable.japon));
        paisesArrayList.add(new Paises(getString(R.string.destino_2),getString(R.string.precio_2), R.drawable.japon2));
        paisesArrayList.add(new Paises(getString(R.string.destino_3),getString(R.string.precio_3), R.drawable.japon));
        paisesArrayList.add(new Paises(getString(R.string.destino_4),getString(R.string.precio_4), R.drawable.japon2));
        paisesArrayList.add(new Paises(getString(R.string.destino_5),getString(R.string.precio_5), R.drawable.japon));



        recyclerView = view.findViewById(R.id.rv1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        Adaptador adaptador = new Adaptador(getContext(),paisesArrayList);
        recyclerView.setAdapter(adaptador);
        adaptador.notifyDataSetChanged();
    }

}