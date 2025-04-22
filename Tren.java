public class Tren {
    // Atributos
    private int id;
    private double cargaMaximaToneladas;
    private double cargaActualToneladas;
    private String tipoCarga;

    // Constructor
    public Tren() {
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCargaMaximaToneladas() {
        return cargaMaximaToneladas;
    }

    public void setCargaMaximaToneladas(double cargaMaximaToneladas) {
        this.cargaMaximaToneladas = cargaMaximaToneladas;
    }

    public double getCargaActualToneladas() {
        return cargaActualToneladas;
    }

    public void setCargaActualToneladas(double cargaActualToneladas) {
        this.cargaActualToneladas = cargaActualToneladas;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }}