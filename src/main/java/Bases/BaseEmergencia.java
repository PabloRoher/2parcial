package Bases;

import Bases.Base;

import java.security.PublicKey;

public class BaseEmergencia extends Base {
    private String nombre;
    private int numeroAmbulancias;
    private double tiempoAsistencia;

    public BaseEmergencia(String nombre, int numeroAmbulancias, double tiempoAsistencia) {
        this.nombre = nombre;
        this.numeroAmbulancias = numeroAmbulancias;
        this.tiempoAsistencia = tiempoAsistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroAmbulancias() {
        return numeroAmbulancias;
    }

    public void setNumeroAmbulancias(int numeroAmbulancias) {
        this.numeroAmbulancias = numeroAmbulancias;
    }

    public double getTiempoAsistencia() {
        return tiempoAsistencia;
    }

}
