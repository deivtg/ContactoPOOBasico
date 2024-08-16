/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contactos;

import java.time.LocalTime;

/**
 *
 * @author deivt
 */
public class Contacto {
    private String nombre;
    private String direccionDomiciliar;
    private String telefono;
    private String comentario;
    private LocalTime fechaHora = LocalTime.now();
    
    public Contacto(){}
    
    public Contacto(String nombre, String direccionDomiciliar, String telefono, String comentario) {
        this.nombre = nombre;
        this.direccionDomiciliar = direccionDomiciliar;
        this.telefono = telefono;
        this.comentario = comentario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionDomiciliar() {
        return direccionDomiciliar;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getComentario() {
        return comentario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccionDomiciliar(String direccionDomiciliar) {
        this.direccionDomiciliar = direccionDomiciliar;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
