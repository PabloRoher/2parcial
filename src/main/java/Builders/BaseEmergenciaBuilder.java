package Builders;

import Bases.Base;
import Bases.BaseEmergencia;

public class BaseEmergenciaBuilder implements Builder {

    private String nombre;

    private int numeroAmbulancias;

    private double tiempoAsistencia;



    public BaseEmergencia BaseBuilder() {
        return new BaseEmergencia(nombre, numeroAmbulancias, tiempoAsistencia);
    }


    @Override
    public void setNombre(String nombre) {

    }

    @Override
    public void setNumeroAmbulancias(int numeroAmbulancias) {

    }

    @Override
    public void setTiempoAsistencia(double tiempoAsistencia) {

    }
}
