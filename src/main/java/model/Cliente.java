package model;

import java.util.Date;

public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String correoCliente;
    private Date fechaNacimiento;
    private String apellidoCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

}
