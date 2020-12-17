package com.capacitacion.excepciones.personalizadas;

public class ManejoExcepciones extends Exception {
    private String tipoFalla;
    private String causa;

    public ManejoExcepciones(String tipoFalla, String causa){
        this.tipoFalla = tipoFalla;
        this.causa = causa;
    }

    public String getTipoFalla() {
        return tipoFalla;
    }

    public void setTipoFalla(String tipoFalla) {
        this.tipoFalla = tipoFalla;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }
}
