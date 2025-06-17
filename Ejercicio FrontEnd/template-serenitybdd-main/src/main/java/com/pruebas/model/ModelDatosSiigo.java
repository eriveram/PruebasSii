package com.pruebas.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ModelDatosSiigo {
    private final String cedula;
    private final String name;
    private final String lastname;
    private final String ciudad;

    public ModelDatosSiigo(String cedula, String name, String lastname, String ciudad,String cedula1, String nombre1, String apellido1, String ciudad1) {
        this.cedula = cedula1;
        this.name = nombre1;
        this.lastname = apellido1;
        this.ciudad = ciudad1;
    }
}
