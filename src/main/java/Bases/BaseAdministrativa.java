package Bases;

import java.util.List;

public class BaseAdministrativa extends Base {
    private String nombre;
    private List<Base> bases;
    int numeroAmbulancias;
    double tiempoAsistencia;

    public BaseAdministrativa(String nombre, List<Base> bases, int numeroAmbulancias, double tiempoAsistencia) {
        this.nombre = nombre;
        this.bases = bases;
        this.numeroAmbulancias = numeroAmbulancias;
        this.tiempoAsistencia = tiempoAsistencia;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNumeroAmbulancias() {
        int total = 0;
        for (Base base : bases) {
            total += base.getNumeroAmbulancias();
        }
        return total;
    }

    @Override
    public double getTiempoAsistencia() {
        Double total = 0.0;
        for (Base base : bases) {
            total += base.getTiempoAsistencia();
        }
        return total;
    }

    public void getBases() {
        for (Base base : bases) {
            System.out.println(base.getNombre());
        }
    }
}
