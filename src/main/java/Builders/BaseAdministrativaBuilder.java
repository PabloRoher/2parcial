package Builders;

import Bases.Base;
import Bases.BaseAdministrativa;

import java.util.List;

public class BaseAdministrativaBuilder implements BuilderAdministrativa {

    private String nombre;
    private List<Base> bases;
    private int numeroAmbulancias;
    private double tiempoAsistencia;



    public Base buildBaseAdministrativa() {
        return new BaseAdministrativa(nombre, bases, numeroAmbulancias, tiempoAsistencia);
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setNumeroAmbulancias() {
    }

    @Override
    public void setTiempoAsistencia() {
    }

    @Override
    public void setBases(List<Base> bases) {
        this.bases = bases;
    }


}
