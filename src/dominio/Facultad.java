
package dominio;

import java.util.ArrayList;


public class Facultad {
    String nombre;
    Universidad universidad;
    ArrayList<Profesor> profesores = new ArrayList<Profesor>();
    ArrayList<Carrera> carreras = new ArrayList<Carrera>();
    Director director;
}
