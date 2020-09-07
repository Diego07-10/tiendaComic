
package Modulo;


public class Alquiler {
    Integer id;
    Integer id_cliente;
    Integer id_juego;
    String nombreCliente;
    String tipoConsola;
    String tituloJuego;
    Double precioAlquiler;
    String fecha;

    public Alquiler() {
    }

    public Alquiler(Integer id, Integer id_cliente, Integer id_juego, String nombreCliente, String tipoConsola, String tituloJuego, Double precioAlquiler, String fecha) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_juego = id_juego;
        this.nombreCliente = nombreCliente;
        this.tipoConsola = tipoConsola;
        this.tituloJuego = tituloJuego;
        this.precioAlquiler = precioAlquiler;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_juego() {
        return id_juego;
    }

    public void setId_juego(Integer id_juego) {
        this.id_juego = id_juego;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoConsola() {
        return tipoConsola;
    }

    public void setTipoConsola(String tipoConsola) {
        this.tipoConsola = tipoConsola;
    }

    public String getTituloJuego() {
        return tituloJuego;
    }

    public void setTituloJuego(String tituloJuego) {
        this.tituloJuego = tituloJuego;
    }

    public Double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(Double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
     
}
