package com.example.travels;

import android.graphics.Bitmap;
import android.media.Image;
import android.widget.ImageView;

public class Paises {

    String nombre;
    String precio;
    int imagen;

    public Paises(String nombre, String precio, int imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public int getImagen() {
        return imagen;
    }



}
