package autor;

public class Autor {
    private String nombre;
    private String nacionalidad;

    // Constructor
    public Autor() {
        System.out.println("Autor creado con éxito");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}

