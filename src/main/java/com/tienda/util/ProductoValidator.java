package com.tienda.util;

import com.tienda.productos.Producto;

public class ProductoValidator {

    public static void validate(Producto producto) {
        if (producto.getNombre() == null || producto.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío");
        }
        if (producto.getPrecio() < 0) {
            throw new IllegalArgumentException("El precio del producto no puede ser negativo");
        }
        if (producto.getStock() < 0) {
            throw new IllegalArgumentException("El stock del producto no puede ser negativo");
        }
    }
}