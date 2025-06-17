package com.pruebas.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ModelProductos {
    private final String producto1;
    private final String producto2;
    private final String suma;
    private final String nombre;
    private final String apellido;
    private final String codigoPostal;

    public ModelProductos(String producto1, String producto2, String suma, String nombre, String apellido, String codigoPostal, String producto11, String producto21, String suma1, String nombre1, String apellido1, String codigoPostal1) {
        this.producto1 = producto11;
        this.producto2 = producto21;
        this.suma = suma1;
        this.nombre = nombre1;
        this.apellido = apellido1;
        this.codigoPostal = codigoPostal1;
    }
}