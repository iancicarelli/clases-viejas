public class Ingredientes {
    private String nombre;
    private String tipo ;
    private int porcion;

    public Ingredientes(String nombre,String tipo, int  porcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.porcion = porcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPorcion(int porcion) {
        this.porcion = porcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPorcion() {
        return porcion;
    }

    @Override
    public String toString() {
        return "Ingredientes{" +
                "" + nombre + '\'' +
                "" + tipo + '\'' +
                "" + porcion +
                '}';
    }
}
