import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alumno> alumnos = new ArrayList<>();
        
        System.out.println("Introduce la cantidad de alumnos a emparejar:");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Introduce el nombre del alumno " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Introduce la materia (Español/Matemáticas) para " + nombre + ":");
            String materia = scanner.nextLine();

            System.out.println("Introduce la hora deseada (5, 6, 7) para " + nombre + ":");
            int hora = scanner.nextInt();
            scanner.nextLine(); 

            alumnos.add(new Alumno(nombre, materia, hora));
        }

        List<Profesor> profesores = new ArrayList<>();
        profesores.add(new Profesor("Profesor Juan", "Espanol", new int[]{5, 6, 7}));
        profesores.add(new Profesor("Profesor Ana", "Matematicas", new int[]{5, 6, 7}));

        // emparejas
        Emparejador emparejador = new Emparejador(alumnos, profesores);
        emparejador.emparejar();     
        scanner.close();
    }
}
