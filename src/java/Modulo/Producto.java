
package Modulo;


public class Producto {
    int id;
    String codigo;
    String titulo;
    String protagonista;
    String director;
    String marca;
    String consola;
    String cantidad;
    String precio;
    
    public Producto(){

    }
    
    public Producto(int id, String codigo, String titulo, String protagonista, String director, String marca, String consola, String cantidad, String precio){
        this.id = id;
        this.codigo = codigo;
        this.titulo = titulo;
        this.protagonista = protagonista;
        this.director = director;
        this.marca = marca;
        this.consola = consola;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
}


