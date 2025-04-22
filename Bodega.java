import java.util.ArrayList;
import java.util.List;

public class Bodega {
   
    private int id;
    private String direccion;
    private double capacidadMaximaToneladas;
    private int capacidadMaximaTrenes;
    private double usoActualToneladas;
    private int usoActualTrenes;
    private String tipoCarga;
    private List<Tren> trenes;

    public Bodega() {
        trenes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCapacidadMaximaToneladas() {
        return capacidadMaximaToneladas;
    }

    public void setCapacidadMaximaToneladas(double capacidadMaximaToneladas) {
        this.capacidadMaximaToneladas = capacidadMaximaToneladas;
    }

    public int getCapacidadMaximaTrenes() {
        return capacidadMaximaTrenes;
    }

    public void setCapacidadMaximaTrenes(int capacidadMaximaTrenes) {
        this.capacidadMaximaTrenes = capacidadMaximaTrenes;
    }

    public double getUsoActualToneladas() {
        return usoActualToneladas;
    }

    public int getUsoActualTrenes() {
        return usoActualTrenes;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public void agregarTren(Tren tren) {
        if (usoActualTrenes < capacidadMaximaTrenes && 
            usoActualToneladas + tren.getCargaActualToneladas() <= capacidadMaximaToneladas && 
            tren.getTipoCarga().equals(tipoCarga)) {
            
            trenes.add(tren);
            usoActualToneladas += tren.getCargaActualToneladas();
            usoActualTrenes++;
            System.out.println("Tren agregado a la bodega.");
        } else {
            System.out.println("No se puede agregar el tren a la bodega.");
        }
    }

    public void darSalidaTren(Tren tren) {
        if (trenes.remove(tren)) {
            usoActualToneladas -= tren.getCargaActualToneladas();
            usoActualTrenes--;
            System.out.println("Tren dado de salida de la bodega.");
        } else {
            System.out.println("El tren no se encuentra en la bodega.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("ID de la bodega: " + id);
        System.out.println("Dirección: " + direccion);
        System.out.println("Capacidad máxima (toneladas): " + capacidadMaximaToneladas);
        System.out.println("Capacidad máxima (trenes): " + capacidadMaximaTrenes);
        System.out.println("Uso actual (toneladas): " + usoActualToneladas);
        System.out.println("Uso actual (trenes): " + usoActualTrenes);
        System.out.println("Tipo de carga: " + tipoCarga);
    }
}