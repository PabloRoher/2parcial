import Bases.BaseAdministrativa;
import Bases.BaseEmergencia;
import Builders.BaseAdministrativaBuilder;
import Builders.BaseEmergenciaBuilder;
import Director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        BaseAdministrativaBuilder baseAdministrativaBuilder = new BaseAdministrativaBuilder();
        director.construirBaseAdministrativa(baseAdministrativaBuilder);

        BaseEmergenciaBuilder baseEmergenciaBuilder = new BaseEmergenciaBuilder();
        director.construirBaseEmergencias(baseEmergenciaBuilder);
    }
}
