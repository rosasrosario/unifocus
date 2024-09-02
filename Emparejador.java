import java.util.List;

public class Emparejador {
    private List<Alumno> alumnos;
    private List<Profesor> profesores;

    public Emparejador(List<Alumno> alumnos, List<Profesor> profesores) {
        this.alumnos = alumnos;
        this.profesores = profesores;
    }
    public void emparejar() {
        for (Alumno alumno : alumnos) {
            boolean emparejado = false;
            for (Profesor profesor : profesores) {
                if (alumno.getMateria().equalsIgnoreCase(profesor.getMateria())) {
                    for (int hora : profesor.getHorasDisponibles()) {
                        if (alumno.getHora() == hora) {
                            System.out.println("Bien, " + alumno.getNombre() + ", tienes clase con el " + profesor.getNombre() + " a las " + hora + " horas.");
                            emparejado = true;
                            break;
                        }
                    }
                }
                if (emparejado) break;
            }
            if (!emparejado) {
                System.out.println("Lo siento, " + alumno.getNombre() + ", no hay profesores disponibles para " + alumno.getMateria() + " a las " + alumno.getHora() + " horas.");
            }
        }
    }
}
