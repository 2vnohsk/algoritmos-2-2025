import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Bodega bodegaAlimentos = new Bodega(1, "Calle 123", 800, 5, "Alimentos");
        Bodega bodegaQuimicos = new Bodega(2, "calle 456", 800, 5, "Insumos Químicos");

        
        Tren tren1 = new Tren(1, 50, 100, "Alimentos");
        Tren tren2 = new Tren(2, 5, 200, "Químicos");

        
        System.out.println("Seleccione un tren para agregar a la bodega 1:");
        System.out.println("1. ID: " + tren1.getId() + ", Tipo de carga: " + tren1.getTipoCarga() + ", Capacidad: " + tren1.getCapacidad() + " toneladas");
        System.out.println("2. ID: " + tren2.getId() + ", Tipo de carga: " + tren2.getTipoCarga() + ", Capacidad: " + tren2.getCapacidad() + " toneladas");
        
        System.out.print("Ingrese el ID del tren: ");
        int idTrenAgregar = scanner.nextInt();

        
        if (idTrenAgregar == 1) {
            bodegaAlimentos.agregarTren(tren1);
        } else if (idTrenAgregar == 2) {
            bodegaQuimicos.agregarTren(tren2);
        } 
        

        
        System.out.println("Seleccione un tren para dar salida:");
        System.out.println("1. ID: " + tren1.getId() + ", Tipo de carga: " + tren1.getTipoCarga());
        System.out.println("2. ID: " + tren2.getId() + ", Tipo de carga: " + tren2.getTipoCarga());
        
        System.out.print("Ingrese el ID del tren: ");
        int idTrenSalida = scanner.nextInt();

       
        if (idTrenSalida == 1) {
            bodegaAlimentos.darSalidaTren(tren1);
        } else if (idTrenSalida == 2) {
            bodegaQuimicos.darSalidaTren(tren2);
        } 
        
        bodegaAlimentos.mostrarInformacion();
        bodegaQuimicos.mostrarInformacion();

        scanner.close();
    }
}
