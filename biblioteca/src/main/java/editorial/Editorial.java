package editorial;

public class Editorial {
    private String nombre;
    private String direccion;

    // Constructor
    public Editorial() {
        System.out.println("Editorial creada con éxito");
        
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
