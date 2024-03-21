package com.example.ejercicioimagen.models;

import android.graphics.Bitmap;

public class Fotografia {
    private Bitmap foto;
    private String descripcion;

    public Fotografia(){}

    public Bitmap getFoto() {
        return foto;
    }

    public void setFoto(Bitmap firma_digital) {
        this.foto = firma_digital;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
