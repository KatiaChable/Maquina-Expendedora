public class Billete {
    private int tipoMagnetico;
    private String nombre;
    private String tipo;
    private String papel;
    private int valor;

    public Billete(int tipoMagnetico, String nombre, String tipo, String papel, int valor) {
        this.tipoMagnetico = tipoMagnetico;
        this.nombre = nombre;
        this.tipo = tipo;
        this.papel = papel;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    public String getPapel() {
        return papel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipoMagnetico() {
        return tipoMagnetico;
    }

    public void setTipoMagnetico(int tipoMagnetico) {
        this.tipoMagnetico = tipoMagnetico;
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
    public void setValor(int valor) {
        this.valor = valor;
    }
}
