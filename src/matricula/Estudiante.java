package matricula;

public class Estudiante {
    private long id;
   private String nombre, apellido, direccion, telefono;

    public Estudiante(long id, String nombre, String appellido, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = appellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Estudiante() {
    }

    public void saludar() {
        System.out.println("hola soy " + this.nombre + " " + this.apellido);
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}