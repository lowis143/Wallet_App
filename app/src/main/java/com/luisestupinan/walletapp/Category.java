package com.luisestupinan.walletapp;

public class Category {
    private String nombre;

    private String descripcion;

    private String color;



    private String icon;


    public Category(String nombre, String descripcion, String color, String icon) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.icon = icon;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getColor() {
        return color;
    }

    public String getIcon() {
        return icon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
