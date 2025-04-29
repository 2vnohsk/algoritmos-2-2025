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

    public Bodega(int id, String direccion, double capacidadMaximaToneladas, int capacidadMaximaTrenes, String tipoCarga) {
        this.id = id;
        this.direccion = direccion;
        this.capacidadMaximaToneladas = capacidadMaximaToneladas;
        this.capacidadMaximaTrenes = capacidadMaximaTrenes;
        this.tipoCarga = tipoCarga;
        this.trenes = new ArrayList<>();
        this.usoActualToneladas = 0;
        this.usoActualTrenes = 0;
    }

    public void agregarTren(Tren tren) {
        if (usoActualTrenes < capacidadMaximaTrenes &&
            usoActualToneladas + tren.getCapacidad() <= capacidadMaximaToneladas &&
            tren.getTipoCarga().equals(tipoCarga)) {
            
            trenes.add(tren);
            usoActualToneladas += tren.getCapacidad();
            usoActualTrenes++;
            System.out.println("Tren " + tren.getId() + " agregado a la bodega " + id + ".");
        } else {
            System.out.println("No se puede agregar el tren " + tren.getId() + " a la bodega " + id + ".");
        }
    }

    public void darSalidaTren(Tren tren) {
        if (trenes.remove(tren)) {
            usoActualToneladas -= tren.getCapacidad();
            usoActualTrenes--;
            tren.darSalida();
        } else {
            System.out.println("El tren " + tren.getId() + " no se encuentra en la bodega " + id + ".");
        }
    }

    public void mostrarInformacion() {
        System.out.println("ID de la bodega: " + id);
        System.out.println("Dirección: " + direccion);
        System.out.println("Capacidad máxima toneladas: " + capacidadMaximaToneladas);
        System.out.println("Capacidad máxima trenes: " + capacidadMaximaTrenes);
        System.out.println("Uso actual toneladas: " + usoActualToneladas);
        System.out.println("Uso actual trenes: " + usoActualTrenes);
        System.out.println("Tipo de carga: " + tipoCarga);
    }
