package co.edu.uniquindio;

public abstract class Servicio {

    public String descripcion;

    Servicio(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract String getDescripcion();

    public abstract void setDescripcion(String descripcion);

}