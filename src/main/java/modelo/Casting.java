package modelo;

public class Casting {
	int idCasting; 
	String nombre;
	String Descripcion;
	String fechaContratacion;
	float precio;
	TipoCasting tipoCasting;
	

	public Casting() {

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

        public float getPrecio() {
            return precio;
        }

        public TipoCasting getTipoCasting() {
            return tipoCasting;
        }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTipoCasting(TipoCasting tipoCasting) {
        this.tipoCasting = tipoCasting;
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
