
package javaapplication16;


public class Taxi {
    private String placa;
    private int movil;
    private String conductor;
    private String modelo;
    private String marca;

    public Taxi(String placa, int movil, String conductor, String modelo, String marca) {
        this.placa = placa;
        this.movil = movil;
        this.conductor = conductor;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMovil() {
        return movil;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "placa='" + placa + '\'' +
                ", movil=" + movil +
                ", conductor='" + conductor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

