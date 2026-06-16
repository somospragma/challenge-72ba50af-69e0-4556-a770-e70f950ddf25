package com.tienda.productos;

public class Electronico extends Producto {

    private String marca;

    public Electronico(String nombre, double precio, int stock, String categoria, String marca) {
        super(nombre, precio, stock, categoria);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónico: " + getNombre() + ", Marca: " + marca + ", Precio: " + getPrecio() + ", Stock: " + getStock() + ", Categoría: " + getCategoria());
    }
}