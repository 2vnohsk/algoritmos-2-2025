import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una bodega
        Bodega bodega = new Bodega();
        bodega.setId(1);
        bodega.setDireccion("Calle Falsa 123");
        bodega.setCapacidadMaximaToneladas(1000.0);
        bodega.setCapacidadMaximaTrenes(5);
        bodega.setTipoCarga("Granos");

        // Crear trenes
        Tren tren1 = new Tren();
        tren1.setId(101);
        tren1.setCargaMaximaToneladas(200.0);
        tren1.setCargaActualToneladas(150.0);
        tren1.setTipoCarga("Granos");

        Tren tren2 = new Tren();
        tren2.setId(102);
        tren2.setCargaMaximaToneladas(300.0);
        tren2.setCargaActualToneladas(250.0);
        tren2.setTipoCarga("Granos");

        Tren tren3 = new Tren();
        tren3.setId(103);
        tren3.setCargaMaximaToneladas(400.0);
        tren3.setCargaActualToneladas(350.0);
        tren3.setTipoCarga("Granos");

        // Agregar trenes a la bodega
        bodega.agregarTren(tren1);
        bodega.agregarTren(tren2);
        bodega.agregarTren(tren3);

        // Mostrar información de la bodega
        bodega.mostrarInformacion();

        // Dar salida a un tren
        System.out.println("¿Qué tren desea dar de salida? (Ingrese ID del tren)");
        int idTrenSalida = scanner.nextInt();
        if (idTrenSalida == tren1.getId()) {
            bodega.darSalidaTren(tren1);
        } else if (idTrenSalida == tren2.getId()) {
            bodega.darSalidaTren(tren2);
        } else if (idTrenSalida == tren3.getId()) {
            bodega.darSalidaTren(tren3);
        } else {
            System.out.println("Tren no encontrado.");
        }

        // Mostrar información actualizada de la bodega
        bodega.mostrarInformacion();

    }
}