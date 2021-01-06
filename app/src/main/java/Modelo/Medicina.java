package Modelo;

public class Medicina {
    private String nombre;
    private String codigo;
    private int stock;
    private float pecio;

    public Medicina(String nombre, String codigo, int stock, float pecio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.pecio = pecio;
    }

    public Medicina(String nombre, int stock, float pecio) {
        this.nombre = nombre;
        this.stock = stock;
        this.pecio = pecio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPecio() {
        return pecio;
    }

    public void setPecio(float pecio) {
        this.pecio = pecio;
    }
}
