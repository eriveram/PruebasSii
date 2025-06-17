package com.pruebas.model;

import lombok.*;

@AllArgsConstructor
@Data
public class ModelCredenciales {
    private final String usuario;
    private final String contrasenia;


    public ModelCredenciales(String usuario, String contrasenia, String usuario1, String contrasenia1) {
        this.usuario = usuario1;
        this.contrasenia = contrasenia1;
    }
}