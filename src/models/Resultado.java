package models;

public class Resultado {
    private String algoritmo;
    private String escenario;
    private int sample;
    private double tiempoNano;
    private double tiempoMilis;

    public Resultado(String algoritmo, String escenario, int sample, double tiempoNano) {
        this.algoritmo = algoritmo;
        this.escenario = escenario;
        this.sample = sample;
        this.tiempoNano = tiempoNano;
        this.tiempoMilis = tiempoNano / 1_000_000.0; // Conversión manual a milisegundos
    }

    public void mostrarInfo() {
        System.out.printf("| %-15s | %-12s | %-10d | %-15.0f | %-15.4f |\n", 
                algoritmo, escenario, sample, tiempoNano, tiempoMilis);
    }
}