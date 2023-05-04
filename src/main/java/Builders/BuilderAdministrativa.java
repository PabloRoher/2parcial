package Builders;

import Bases.Base;

import java.util.List;

public interface BuilderAdministrativa {
    void setNombre(String nombre);

    void setNumeroAmbulancias();

    void setTiempoAsistencia();

    void setBases(List<Base> bases);

}
