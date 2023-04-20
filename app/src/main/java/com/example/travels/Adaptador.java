package com.example.travels;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.Shapeable;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {

    Context context;
    ArrayList<Paises> paisesArrayList;

    public Adaptador(Context context, ArrayList<Paises> paisesArrayList) {
        this.context = context;
        this.paisesArrayList = paisesArrayList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.tarjeta, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.MyViewHolder holder, int position) {

        String txtPais = paisesArrayList.get(position).nombre;
        String txtPrecio = paisesArrayList.get(position).precio;
        int paisImagen = paisesArrayList.get(position).imagen;
        // Verificar si el objeto Paises y sus campos no son nulos antes de acceder a ellos
        holder.textoPais.setText(txtPais);
        holder.textoPrecio.setText(txtPrecio);
        holder.imagenPais.setImageResource(paisImagen);

    }

    @Override
    public int getItemCount() {
        return paisesArrayList.size();
    }

public static class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imagenPais;
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
