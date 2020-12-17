package com.tcs.tallerListas.beans;

public class Estudiante {

	private String identificacion;
	private String nombre;
	private int edad;
	private String grado;
	private String esAprobado;

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEsAprobado() {
        return esAprobado;
    }

    public void setEsAprobado(String esAprobado) {
        this.esAprobado = esAprobado;
    }

    @Override
    public String toString() {
        return "\nIdentificacion= " + identificacion +
                "\nNombre=" + nombre +
                "\nEdad=" + edad +
                "\nEstado=" + esAprobado;
    }
}
