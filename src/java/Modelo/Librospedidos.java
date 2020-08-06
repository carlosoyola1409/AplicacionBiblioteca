
package Modelo;

public class Librospedidos {
    private int idlibro;
    private String titulo;
    private String autor;
    private String solicitado;
    private int fecha;
    private int precio;

    public Librospedidos() {
    }

    public Librospedidos(int idlibro, String titulo, String autor, String solicitado, int fecha, int precio) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.autor = autor;
        this.solicitado = solicitado;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSolicitado() {
        return solicitado;
    }

    public void setSolicitado(String solicitado) {
        this.solicitado = solicitado;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
