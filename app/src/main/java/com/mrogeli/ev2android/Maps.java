package com.mrogeli.ev2android;

public class Maps {

    private String lugar;
    private String datos;

    public Maps(String lugar, String datos) {
        this.lugar = lugar;
        this.datos = datos;
    }

    public Maps() {
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
}