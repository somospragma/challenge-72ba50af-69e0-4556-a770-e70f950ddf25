package com.tienda.productos;

import com.tienda.util.ProductoValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductoTest {

    @Test
    public void testProducto() {
        Libro libro = new Libro("1984", 10.0, 5, "Ciencia Ficción", "George Orwell");
        ProductoValidator.validate(libro);
        assertEquals("1984", libro.getNombre());
        assertEquals(10.0, libro.getPrecio());
        assertEquals(5, libro.getStock());
        assertEquals("Ciencia Ficción", libro.getCategoria());
        assertEquals("George Orwell", libro.getAutor());
    }

    @Test
    public void testInvalidProducto() {
        assertThrows(IllegalArgumentException.class, () -> {
            Libro libro = new Libro("", -10.0, -5, "Ciencia Ficción", "George Orwell");
            ProductoValidator.validate(libro);
        });
    }
}