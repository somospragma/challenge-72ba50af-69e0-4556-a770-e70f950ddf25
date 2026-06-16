package com.tienda.productos;

public class Libro extends Producto {

    private String autor;

    public Libro(String nombre, double precio, int stock, String categoria, String autor) {
        super(nombre, precio, stock, categoria);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Libro: " + getNombre() + ", Autor: " + autor + ", Precio: " + getPrecio() + ", Stock: " + getStock() + ", Categoría: " + getCategoria());
    }
}