package com.company;

public class Producto {
    private int codigoProducto;
    private String nombreProducto;
    private double precio;
    private String descripcion;
    private String color;
    private int stock;
    private String categoria;

    public Producto(int codigoProducto, String nombreProducto, double precio, String descripcion, String color, int stock, String categoria) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.descripcion = descripcion;
        this.color = color;
        this.stock = stock;
        this.categoria = categoria;
    }

    public Producto(){

    }
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return "Producto " + this.codigoProducto + " descripción: " + this.descripcion + " categoria: " + this.categoria;
     }
}
