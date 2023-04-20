package com.example.travels;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.Shapeable;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {

    Context context;
    ArrayList<Paises> paisesArrayList;

    public Adaptador(Context context, ArrayList<Paises> paisesArrayList){
        this.context = context;
        this.paisesArrayList = paisesArrayList;


    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.lista_paises,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Paises  paises = paisesArrayList.get(position);

        // Verificar si el objeto Paises y sus campos no son nulos antes de acceder a ellos
        if (paises != null) {
            if (paises.nombre != null) {
                holder.textoPais.setText(paises.nombre);
            }
            if (paises.precio != null) {
                holder.textoPrecio.setText(paises.precio);
            }
            if (paises.imagen != 0) {
                holder.imagenPais.setImageResource(paises.imagen);
            }
        }

        holder.textoPais.setText(paises.nombre);
        holder.textoPrecio.setText(paises.precio);
        holder.imagenPais.setImageResource(paises.imagen);


    }

    @Override
    public int getItemCount() {
        return paisesArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        ShapeableImageView imagenPais;
        TextView textoPais;
        TextView textoPrecio;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textoPais = itemView.findViewById(R.id.textoPais);
            textoPrecio = itemView.findViewById(R.id.textoPrecio);
            imagenPais = itemView.findViewById(R.id.imagenPais);
        }
    }


}
