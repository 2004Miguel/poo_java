package cliente;

public class Cliente {
    private String nombre;
    private String numeroTelefono;
    private String direccion;

    // Constructor
    public Cliente(String nombre, String numeroTelefono, String direccion) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

