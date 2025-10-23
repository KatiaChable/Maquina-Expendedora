public class Billete {
    private String nombre;
    private String tipo;
    private String papel;
    private double precio;

    public Billete(int tipoMagnetico, String nombre, String tipo, String papel, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.papel = papel;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getPapel() {
        return papel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Billete [nombre=" + nombre + ", tipo=" + tipo + ", papel=" + papel + ", precio=" + precio + "]";
    }
}
