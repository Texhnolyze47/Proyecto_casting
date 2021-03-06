package modelo;

public class Casting {

    int idCasting;
    String nombre;
    String Descripcion;
    String fechaContratacion;
    String precio;

    public Casting(String nombre, String Descripcion, String fechaContratacion, String precio) {
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.fechaContratacion = fechaContratacion;
        this.precio = precio;
    }

    public Casting() {

    }

    public Casting(int idCasting, String nombre, String descripcion, String fechaContratacion) {
        this.idCasting = idCasting;
        this.nombre = nombre;
        this.Descripcion = descripcion;
        this.fechaContratacion = fechaContratacion;
    }

    public Casting(int idCasting, String nombre, String Descripcion, String fechaContratacion, String precio) {
        this.idCasting = idCasting;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.fechaContratacion = fechaContratacion;
        this.precio = precio;
    }

    public Casting(String nombre, String descripcion, String fechaContratacion) {
        this.nombre = nombre;
        Descripcion = descripcion;
        this.fechaContratacion = fechaContratacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "casting [nombre=" + nombre + ", Descripcion=" + Descripcion + ", fechaContratacion=" + fechaContratacion
                + "]";
    }

}
