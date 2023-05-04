package Director;

import Bases.Base;
import Bases.BaseEmergencia;
import Builders.Builder;
import Builders.BuilderAdministrativa;

import java.util.ArrayList;

public class Director {
    public void construirBaseEmergencias(Builder builder) {
        builder.setNombre("Base de emergencias");
        builder.setNumeroAmbulancias(10);
        builder.setTiempoAsistencia(10.0);
    }

    public void construirBaseAdministrativa(BuilderAdministrativa builder) {
        builder.setNombre("Base administrativa");
        builder.setNumeroAmbulancias();
        builder.setTiempoAsistencia();
        builder.setBases(new ArrayList<Base>());
    }
}
