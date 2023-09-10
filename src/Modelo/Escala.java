/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexb
 */
public class Escala {
    
    private String ciudad;
    private int hora_llegada;
    private int hora_salida;

    public Escala(String ciudad, int hora_llegada, int hora_salida) {
        this.ciudad = ciudad;
        this.hora_llegada = hora_llegada;
        this.hora_salida = hora_salida;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(int hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }
    
    
}
