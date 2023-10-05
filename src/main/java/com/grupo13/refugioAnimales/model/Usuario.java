/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.Set;
import lombok.Getter;

import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Usuarios")
public class Usuario extends Persona {

    @Email
    @NotBlank
    @Size(max = 50)
    private String email;
    private String contrasenia;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.PERSIST)
    private Set<Rol> listaRoles;
    
    
    public Usuario() {
    }

    public Usuario(String email, String contrasenia, Set<Rol> listaRoles, String nombre, String apellido, String direccion, String telefono, String sexo, String dni) {
        super(nombre, apellido, direccion, telefono, sexo, dni);
        this.email = email;
        this.contrasenia = contrasenia;
        this.listaRoles = listaRoles;
    }





}
