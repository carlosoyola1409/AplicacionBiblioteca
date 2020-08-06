package Modelo;

public class Biblioteca {
    private int idbiblioteca;
    private String empresa;
    private String direccion;
    private int telefono;
    private int fax;

    public Biblioteca() {
    }

    public Biblioteca(int idbiblioteca, String empresa, String direccion, int telefono, int fax) {
        this.idbiblioteca = idbiblioteca;
        this.empresa = empresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fax = fax;
    }

    public int getIdbiblioteca() {
        return idbiblioteca;
    }

    public void setIdbiblioteca(int idbiblioteca) {
        this.idbiblioteca = idbiblioteca;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }
    
    
}
