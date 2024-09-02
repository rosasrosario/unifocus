public class Alumno {
    private String nombre;
    private String materia;
    private int hora;

    public Alumno(String nombre, String materia, int hora) {
        this.nombre = nombre;
        this.materia = materia;
        this.hora = hora;
    }
    public String getNombre() {
        return nombre;
    }
    public String getMateria() {
        return materia;
    }
    public int getHora() {
        return hora;
    }
}
