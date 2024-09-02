public class Profesor {
    private String nombre;
    private String materia;
    private int[] horasDisponibles;

    public Profesor(String nombre, String materia, int[] horasDisponibles) {
        this.nombre = nombre;
        this.materia = materia;
        this.horasDisponibles = horasDisponibles;
    }
    public String getNombre() {
        return nombre;
    }
    public String getMateria() {
        return materia;
    }
    public int[] getHorasDisponibles() {
        return horasDisponibles;
    }
}