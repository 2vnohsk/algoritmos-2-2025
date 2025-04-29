public class Tren {
    private int id;
    private double capacidad; 
    private String tipoCarga; 

    public Tren(int id, int vagones, double capacidad, String tipoCarga) {
        this.id = id;
        this.capacidad = capacidad;
        this.tipoCarga = tipoCarga;
    }

    public int getId() {
        return id;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void darSalida() {
        System.out.println("El tren " + id + " ha salido de la bodega.");
    }
}
